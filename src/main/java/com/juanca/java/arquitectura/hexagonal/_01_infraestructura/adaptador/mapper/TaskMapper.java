package com.juanca.java.arquitectura.hexagonal._01_infraestructura.adaptador.mapper;

import com.juanca.java.arquitectura.hexagonal._01_infraestructura.entitymanager.entity.TaskEntity;
import com.juanca.java.arquitectura.hexagonal._02_aplicacion.dto.TaskDto;
import com.juanca.java.arquitectura.hexagonal._03_dominio_core.modelo.Task;
import java.util.List;
import java.util.stream.Collectors;

// Se puede usar ModelMapper u org.mapstruct
public class TaskMapper {

  private TaskMapper() {
  }

  public static Task toDomain(TaskEntity taskEntity) {
    return new Task(taskEntity.getId(), taskEntity.getDescription());
  }

  public static TaskEntity toTaskEntity(Task task) {
    return new TaskEntity(task.getDescription());
  }

  public static TaskDto toTaskDto(Task task) {
    return new TaskDto(task.getDescription());
  }

  public static List<Task> toDomain(List<TaskEntity> taskEntities) {
    // Se puede usar ModelMapper u org.mapstruct
    return taskEntities
        .stream()
        .map(TaskMapper::toDomain)
        .collect(Collectors.toList());
  }

  public static List<TaskDto> toTaskDto(List<Task> tasks) {
    return tasks
        .stream()
        .map(task -> new TaskDto(task.getId(), task.getDescription()))
        .collect(Collectors.toList());
  }

}
