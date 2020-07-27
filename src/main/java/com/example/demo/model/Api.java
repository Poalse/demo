package com.example.demo.model;

import lombok.Data;

@Data
public class Api {
    private String method_type;
    private String path;
    private String api_version;
}
