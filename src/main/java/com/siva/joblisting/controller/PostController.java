package com.siva.joblisting.controller;
import com.siva.joblisting.repository.PostRepository;
import com.siva.joblisting.model.Post;
import com.siva.joblisting.repository.SearchRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/")
public class PostController {
    @Autowired
    PostRepository repo;

    @Autowired
    SearchRepository srepo;

    @GetMapping("/allposts")
    @CrossOrigin
    public List<Post> getAllPosts(){
        System.out.println("get method called...");
        return repo.findAll();
    }

    @PostMapping("/posts")
    @CrossOrigin
    public Post addPost(@RequestBody Post post){
        System.out.println(post);
        return repo.save(post);
    }

    @GetMapping("/posts/{text}")
    @CrossOrigin
    public List<Post> search(@PathVariable String text){
        return srepo.findByText(text);
    }
}
