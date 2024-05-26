package com.msb.firstspring.Controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/")
public class RootController {

    @GetMapping
    public static ResponseEntity<String> hello() {
        return ResponseEntity.ok("<h1>Hello World!</h1>");
    }

    @PostMapping
    public static ResponseEntity<String> helloPost(@RequestBody String name) {
        return ResponseEntity.ok("Hello " + name + "!");
    }
}
