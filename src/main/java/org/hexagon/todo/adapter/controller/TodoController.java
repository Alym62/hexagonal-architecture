package org.hexagon.todo.adapter.controller;

import lombok.AllArgsConstructor;
import org.hexagon.todo.domain.Todo;
import org.hexagon.todo.domain.ports.TodoServicePort;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;

@RestController
@RequestMapping("/api/v1/todo")
@AllArgsConstructor
public class TodoController {
    private final TodoServicePort servicePort;

    @PostMapping
    public ResponseEntity<Todo> save(@RequestBody Todo todo) {
        var entity = servicePort.save(todo);
        URI uri = ServletUriComponentsBuilder
                .fromCurrentRequest()
                .path("/{id}")
                .buildAndExpand(entity.getId())
                .toUri();

        return ResponseEntity.created(uri).body(entity);
    }
}
