package org.hexagon.todo.adapter.repository;

import lombok.AllArgsConstructor;
import org.hexagon.todo.adapter.entity.TodoEntity;
import org.hexagon.todo.domain.Todo;
import org.hexagon.todo.domain.ports.TodoRepositoryPort;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@AllArgsConstructor
public class TodoRepositoryAdapter implements TodoRepositoryPort {
    private final TodoRepository repository;
    private final ModelMapper mapper;

    @Override
    public Todo save(Todo todo) {
        var entity = mapper.map(todo, TodoEntity.class);
        var entitySaved = repository.save(entity);

        return mapper.map(entitySaved, Todo.class);
    }

    @Override
    public List<Todo> fetchAll() {
        var entities = repository.findAll();
        return entities.stream()
                .map(it -> mapper.map(it, Todo.class)).toList();
    }
}
