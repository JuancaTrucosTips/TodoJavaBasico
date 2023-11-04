package com.juanca.java.arquitectura.hexagonal._01_infraestructura.adaptador.casodeuso;

import com.juanca.java.arquitectura.hexagonal._01_infraestructura.adaptador.mapper.TaskMapper;
import com.juanca.java.arquitectura.hexagonal._02_aplicacion.dto.TaskDto;
import com.juanca.java.arquitectura.hexagonal._02_aplicacion.puerto.casodeuso.TaskUseCase;
import com.juanca.java.arquitectura.hexagonal._03_dominio_core.modelo.Task;
import com.juanca.java.arquitectura.hexagonal._03_dominio_core.puerto.TaskServicePort;
import java.util.List;

// Logica de negocio para que se comunique con nuestro dominio
public class TaskServiceImpl implements TaskUseCase {

  private final TaskServicePort taskServicePort;

  public TaskServiceImpl(TaskServicePort taskServicePort) {
    this.taskServicePort = taskServicePort;
  }

  @Override
  public List<TaskDto> getTasks() {
    return TaskMapper.toTaskDto(taskServicePort.getTasks());
  }

  @Override
  public TaskDto addTask(String description) {
    if ("".equals(description)) {
      throw new IllegalArgumentException("Description is empty");
    }
    Task task = taskServicePort.addTask(new Task(description));
    return TaskMapper.toTaskDto(task);
  }

}
