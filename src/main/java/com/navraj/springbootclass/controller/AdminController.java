package com.navraj.springbootclass.controller;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;


@RestController
@RequestMapping("/api/v1/admin")
public class AdminController {
    @GetMapping
    public HashMap<String, String> adminRoute() {
        HashMap<String,String> adminMessage = new HashMap<>();
        adminMessage.put("id","Super User");
        adminMessage.put("name","superuser admin");
        return adminMessage;
    }


}