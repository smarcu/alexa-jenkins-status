package com.example.rest.alexademo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class JenkinsController {

    private static final Logger LOG = LoggerFactory.getLogger(JenkinsController.class);
    @Autowired
    private JenkinsStatusCache jenkinsStatusCache;

    @GetMapping("/jenkins")
    public void jenkins(@RequestParam(name = "status") String status) {

        jenkinsStatusCache.setJenkinsStatus(status);

    }

}
