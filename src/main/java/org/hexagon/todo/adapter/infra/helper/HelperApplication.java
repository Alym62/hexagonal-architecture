package org.hexagon.todo.adapter.infra.helper;

import org.hexagon.todo.domain.ports.TodoRepositoryPort;
import org.hexagon.todo.domain.ports.TodoServicePort;
import org.hexagon.todo.domain.services.TodoService;
import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class HelperApplication {
    @Bean
    public ModelMapper modelMapper() {
        return new ModelMapper();
    }

    @Bean
    public TodoServicePort todoServicePort(TodoRepositoryPort repositoryPort) {
        return new TodoService(repositoryPort);
    }
}
