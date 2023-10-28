package com.juanca.java.arquitectura.hexagonal._01_infraestructura.contoller;

import com.juanca.java.arquitectura.hexagonal._01_infraestructura.adaptador.dto.TaskDto;
import com.juanca.java.arquitectura.hexagonal._02_aplicacion.casodeuso.TaskUseCase;
import java.util.List;

// Adaptador de la Capa de Presentación:
public class TaskControllerAdapter {

  private final TaskUseCase taskUseCase;

  public TaskControllerAdapter(TaskUseCase taskUseCase) {
    this.taskUseCase = taskUseCase;
  }

  public List<TaskDto> displayTasks() {
    // Lógica para mostrar tareas en la interfaz de usuario
    return taskUseCase.getTasks();
  }

}
