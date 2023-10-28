package com.juanca.java.arquitectura.hexagonal._02_aplicacion.servicio;

import com.juanca.java.arquitectura.hexagonal._01_infraestructura.adaptador.dto.TaskDto;
import com.juanca.java.arquitectura.hexagonal._01_infraestructura.adaptador.mapper.TaskMapper;
import com.juanca.java.arquitectura.hexagonal._02_aplicacion.casodeuso.TaskUseCase;
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

}
