package org.hexagon.todo.domain.ports;

import org.hexagon.todo.domain.Todo;

import java.util.List;

public interface TodoServicePort {
    Todo save(Todo todo);
    List<Todo> fetchAll();
}
