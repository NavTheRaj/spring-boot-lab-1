package com.navraj.springbootclass.repo;

import com.navraj.springbootclass.entity.Comment;
import com.navraj.springbootclass.entity.Post;
import com.navraj.springbootclass.entity.User;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface UserRepo extends CrudRepository<User, Long> {
    List<User> findAll();

    User findById(long id);

    User save(User user);

    void deleteById(long id);

    @Query(value = "SELECT u.posts from User u WHERE u.id = :id")
    List<Post> getPostsById(long id);

    /*     Make a query that will retrieve all the users that have more than (n) posts.*/
    @Query(value = "SELECT u from User u JOIN u.posts p GROUP BY u HAVING COUNT(p) > :size")
    List<User> findUsersWithMoreThanOnePost(int size);


    /*     Make a query that will find the users that made posts within a given title */
    @Query(value = "SELECT u from User u JOIN u.posts p WHERE lower(p.title) = lower(:title)")
    List<User> findUsersWithPostsTitleWithin(String title);

    @Query(value =
            "SELECT c FROM User u JOIN u.posts p JOIN p.comment c " +
                    "WHERE c.id = :commentId " +
                    "AND u.id = :userId " +
                    "AND p.id = :postId")
    Comment findCommentOfUserThroughPost(long userId, long postId, long commentId);
}
