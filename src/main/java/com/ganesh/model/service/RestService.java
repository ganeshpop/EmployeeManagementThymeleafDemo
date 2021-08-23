package com.ganesh.model.service;

import org.springframework.stereotype.Service;

@Service
public class RestService {

    public String printMessage(){
        return "<h1>Welcome To REST API</h1>";
    }

    public String showPage() {
        return "<h1>Page</h1>";
    }
}
