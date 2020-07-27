package com.example.demo.controller;


import com.example.demo.model.PublishModelRequest;
import com.example.demo.model.PublishModelResponse;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping("getaway")
public class GetawayController {

    @PostMapping("publish")
    public PublishModelResponse publish(@RequestBody PublishModelRequest request) {
        System.out.println(request.toString());
        // Пример ответа
        PublishModelResponse response = new PublishModelResponse();
        response.setInstance_id(UUID.randomUUID().toString());
        response.setPing_interval(10_000);

        return response;
    }

    @GetMapping("ping/{instance_id}")
    public void ping(@PathVariable("instance_id") String instanceId) {
    }

    @GetMapping("ready/{instance_id}")
    public void ready(@PathVariable("instance_id") String instanceId) {
    }

    @GetMapping("unpublish/{instance_id}")
    public void unpublish(@PathVariable("instance_id") String instanceId) {
    }



}
