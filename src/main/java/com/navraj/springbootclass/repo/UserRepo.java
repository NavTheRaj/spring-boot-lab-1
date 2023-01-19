package com.navraj.springbootclass.repo;

import com.navraj.springbootclass.entity.Post;
import com.navraj.springbootclass.entity.User;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface UserRepo extends CrudRepository<User, Long> {
    List<User> findAll();

    User findById(long id);

    User save(User user);

    @Query(value = "SELECT u.posts from User u WHERE u.id = :id")
    List<Post> getPostsById(long id);

    @Query(value = "SELECT u from User u JOIN u.posts p GROUP BY u HAVING COUNT(p) > 1")
    List<User> findUsersWithMoreThanOnePost();
}
