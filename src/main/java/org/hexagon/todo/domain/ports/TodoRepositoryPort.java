package org.hexagon.todo.domain.ports;

import org.hexagon.todo.domain.Todo;

import java.util.List;

public interface TodoRepositoryPort {
    Todo save(Todo todo);
    List<Todo> fetchAll();
}
