package org.hexagon.todo.domain.services;

import org.hexagon.todo.domain.Todo;
import org.hexagon.todo.domain.ports.TodoServicePort;

import java.util.List;

public class TodoService implements TodoServicePort {
    @Override
    public Todo save(Todo todo) {
        return null;
    }

    @Override
    public List<Todo> fetchAll() {
        return List.of();
    }
}
