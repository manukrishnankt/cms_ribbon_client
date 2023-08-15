package com.opensource.cmsclient.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.ResourceAccessException;
import org.springframework.web.client.RestTemplate;

@RestController
public class FrontEndController {
    @Autowired
    RestTemplate restTemplate;

    @RequestMapping("/client/frontend")
    public String hi() {
        try {
            String randomString = this.restTemplate.getForObject("http://server/backend", String.class);
            return "Server Response :: " + randomString;
        } catch (ResourceAccessException e) {
            return "Error";
        }
    }

}
