package com.soa;
import org.springframework.web.bind.annotation.*;
@RestController
@RequestMapping("/api")
public class DataController {
    @GetMapping("/data")
    public String getData() {
        return "Microservice Running Successfully!";
    }
    @GetMapping("/hello")
    public String hello() {
        return "Hello from Docker!";
    }
}