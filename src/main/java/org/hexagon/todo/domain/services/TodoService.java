package org.hexagon.todo.domain.services;

import org.hexagon.todo.domain.Todo;
import org.hexagon.todo.domain.ports.TodoRepositoryPort;
import org.hexagon.todo.domain.ports.TodoServicePort;

import java.util.List;

public class TodoService implements TodoServicePort {
    private final TodoRepositoryPort repositoryPort;

    public TodoService(TodoRepositoryPort repositoryPort) {
        this.repositoryPort = repositoryPort;
    }

    @Override
    public Todo save(Todo todo) {
        return repositoryPort.save(todo);
    }

    @Override
    public List<Todo> fetchAll() {
        return repositoryPort.fetchAll();
    }
}
