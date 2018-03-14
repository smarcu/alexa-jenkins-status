package com.example.rest.alexademo;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

@Service
@Scope("singleton")
public class JenkinsStatusCache {

    private String jenkinsStatus;

    public synchronized String getJenkinsStatus() {
        return jenkinsStatus;
    }

    public synchronized void setJenkinsStatus(String jenkinsStatus) {
        this.jenkinsStatus = jenkinsStatus;
    }
}
