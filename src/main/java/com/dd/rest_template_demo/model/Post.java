package com.dd.rest_template_demo.model;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

@Data
public class Post {
    private int id;
    private String title;
    private String body;
}