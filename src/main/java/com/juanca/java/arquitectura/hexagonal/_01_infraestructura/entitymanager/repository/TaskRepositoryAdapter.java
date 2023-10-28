package com.juanca.java.arquitectura.hexagonal._01_infraestructura.entitymanager.repository;

import com.juanca.java.arquitectura.hexagonal._01_infraestructura.entitymanager.entity.TaskEntity;
import java.util.List;

public class TaskRepositoryAdapter implements TaskRepository {

  // Conexión a la base de datos
  public List<TaskEntity> getAllTaskEntities() {
    // Lógica para obtener tareas desde la base de datos
    return null;
  }

  public void saveTask(TaskEntity task) {
    // Lógica para guardar una nueva tarea en la base de datos
  }

}
