package com.juanca.java.arquitectura.hexagonal._01_infraestructura.contoller;

import com.juanca.java.arquitectura.hexagonal._02_aplicacion.dto.TaskDto;
import com.juanca.java.arquitectura.hexagonal._02_aplicacion.puerto.casodeuso.TaskUseCase;
import java.util.List;

// Adaptador de la Capa de Presentación:
public class TaskController {

  private final TaskUseCase taskUseCase;

  public TaskController(TaskUseCase taskUseCase) {
    this.taskUseCase = taskUseCase;
  }

  public List<TaskDto> displayTasks() {
    // Lógica para mostrar tareas en la interfaz de usuario
    return taskUseCase.getTasks();
  }

}
