package com.juanca.java.arquitectura.hexagonal._01_infraestructura.adaptador.data;

import com.juanca.java.arquitectura.hexagonal._01_infraestructura.adaptador.mapper.TaskMapper;
import com.juanca.java.arquitectura.hexagonal._01_infraestructura.entitymanager.repository.TaskRepository;
import com.juanca.java.arquitectura.hexagonal._03_dominio_core.modelo.Task;
import com.juanca.java.arquitectura.hexagonal._03_dominio_core.puerto.TaskServicePort;
import java.util.List;

public class TaskJpaAdapter implements TaskServicePort {

  private final TaskRepository taskRepository;

  public TaskJpaAdapter(TaskRepository taskRepository) {
    this.taskRepository = taskRepository;
  }

  @Override
  public List<Task> getTasks() {
    return TaskMapper.toDomain(this.taskRepository.getAllTaskEntities());
  }

  @Override
  public Task addTask(Task task) {
    return TaskMapper.toDomain(this.taskRepository.saveTask(TaskMapper.toTaskEntity(task)));
  }

}
