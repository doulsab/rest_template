package com.dd.rest_template_demo.controller;

import com.dd.rest_template_demo.service.MainService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/v1/microservice/")
public class MainController {

    private final MainService mainService;
    @GetMapping("get_posts")
    public ResponseEntity<?> getDataFromMicroService(){
        return new ResponseEntity<>(mainService.getPostsByRestTemplate(), HttpStatus.OK);
    }

    @GetMapping("get_posts/{id}")
    public ResponseEntity<?> getPostsById(@PathVariable Integer id){
        return new ResponseEntity<>(mainService.getPostById(id), HttpStatus.OK);
    }

}
