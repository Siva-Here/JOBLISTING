package com.siva.joblisting.repository;

import com.siva.joblisting.model.Post;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
@Component
public class SearchRepoImpl implements SearchRepository{
    @Override
    public List<Post> findByText(String text){
        final List<Post> posts=new ArrayList<>();
        return null;
    }
}
