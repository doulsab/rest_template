package com.dd.rest_template_demo.service;

import com.dd.rest_template_demo.model.Post;
import lombok.RequiredArgsConstructor;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Service
@RequiredArgsConstructor
public class MainService {
    // Initialized as a bean in AppConfig
    private final RestTemplate restTemplate;

    public List<Post> getPostsByRestTemplate() {
        ResponseEntity<List<Post>> responseEntity =
                restTemplate.exchange("https://jsonplaceholder.typicode.com/posts",
                HttpMethod.GET,null,new ParameterizedTypeReference<List<Post>>() {}
        );
        return responseEntity.getBody();
    }

    public Post getPostById(Integer id) {
        String url = "https://jsonplaceholder.typicode.com/posts/".concat(String.valueOf(id));
        System.out.println("url is : " + url);
        return restTemplate.getForObject(url, Post.class);
    }
}
