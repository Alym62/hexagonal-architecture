package org.hexagon.todo.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/todo")
public class TodoController {
    @GetMapping
    public ResponseEntity<String> fetch() {
        return ResponseEntity.ok().body("Olá mundo");
    }
}
