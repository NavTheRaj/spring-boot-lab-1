//package com.navraj.springbootclass.repo.impl;
//
//import com.navraj.springbootclass.entity.Post;
//import com.navraj.springbootclass.repo.PostRepo;
//import org.springframework.stereotype.Repository;
//
//import java.util.ArrayList;
//import java.util.List;
//
//@Repository
//public class PostRepoImpl implements PostRepo {
//
//    private static List<Post> posts;
//    private static long postId = 256;
//
//    static {
//        posts = new ArrayList<>();
//
//        Post p1 = new Post(
//                1,
//                "The Many Flowers",
//                "He took a sip of the drink. He wasn't sure whether he liked it or not, but at this moment it didn't matter. She had made it especially for him so he would have forced it down even if he had absolutely hated it. That's simply the way things worked. She made him a new-fangled drink each day and he took a sip of it and smiled, saying it was excellent.",
//                "Random Guy");
//        Post p2 = new Post(
//                2,
//                "Franks Story",
//                "Frank knew there was a correct time and place to reveal his secret and this wasn't it. The issue was that the secret might be revealed despite his best attempt to keep it from coming out. At this point, it was out of his control and completely dependant on those around him who also knew the secret. They wouldn't purposely reveal it, or at least he believed that, but they could easily inadvertently expose it. It was going to be a long hour as he nervously eyed everyone around the table hoping they would keep their mouths shut.",
//                "Frankeinstein");
//
//        posts.add(p1);
//        posts.add(p2);
//    }
//
//    @Override
//    public List<Post> findAll() {
//        return posts;
//    }
//
//    @Override
//    public Post findById(int id) {
//        return posts.stream()
//                .filter(p -> p.getId() == id)
//                .findFirst()
//                .orElse(null);
//    }
//
//    @Override
//    public Object save(Post p) {
//        p.setId(postId);
//        postId++;
//        posts.add(p);
//        return null;
//    }
//
//    @Override
//    public void delete(int id) {
//        var post = posts.stream()
//                .filter(p -> p.getId() == id)
//                .findFirst().get();
//        posts.remove(post);
//    }
//
//    @Override
//    public void update(int id, Post p) {
//        Post postToUpdate = findById(id);
//        postToUpdate.setAuthor(p.getAuthor());
//        postToUpdate.setTitle(p.getTitle());
//        postToUpdate.setContent(p.getContent());
//    }
//}
