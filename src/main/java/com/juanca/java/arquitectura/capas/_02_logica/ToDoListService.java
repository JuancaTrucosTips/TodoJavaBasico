package com.juanca.java.arquitectura.capas._02_logica;

import com.juanca.java.arquitectura.capas._02_logica.modelo.Task;
import com.juanca.java.arquitectura.capas._03_datos.entidad.TaskEntity;
import com.juanca.java.arquitectura.capas._03_datos.repositorio.TaskRepository;
import com.juanca.java.arquitectura.capas._infraestructura.ConfigurationService;
import java.util.List;
import java.util.stream.Collectors;

public class ToDoListService {

  private final TaskRepository taskRepository;

  private final ConfigurationService configurationService;

  public ToDoListService(TaskRepository taskRepository, ConfigurationService configurationService) {
    this.taskRepository = taskRepository;
    this.configurationService = configurationService;
  }

  public List<Task> getTasks() {
    List<TaskEntity> taskEntities = taskRepository.getAllTaskEntities();
    // Mapear TaskEntity a Task
    return taskEntities
        .stream()
        .map(taskEntity -> new Task(taskEntity.getId(), taskEntity.getDescription()))
        .collect(Collectors.toList());
  }

  public void addTask(Task task) {
    // Lógica para agregar una nueva tarea
  }

}