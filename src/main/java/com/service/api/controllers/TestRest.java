package com.service.api.controllers;

import com.service.api.model.RestInterface;
import com.service.api.model.RestModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestRest {

    @Autowired
    private RestInterface service;

    @GetMapping(path = "/")
    public RestModel get() {
        return service.findById(1L).orElseThrow(() -> new RuntimeException("Not found"));
    }

}
