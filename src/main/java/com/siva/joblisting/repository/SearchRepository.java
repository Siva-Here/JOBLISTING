package com.siva.joblisting.repository;

import com.siva.joblisting.model.Post;

import java.util.List;

public interface SearchRepository {
    List<Post> findByText(String text);
}
