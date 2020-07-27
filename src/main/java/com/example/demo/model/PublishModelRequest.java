package com.example.demo.model;

import lombok.Data;

import java.util.List;

@Data
public class PublishModelRequest {
    private String address;
    private String port;
    private String name_service;
    private String version_service;
    private List<Api> api;
}
