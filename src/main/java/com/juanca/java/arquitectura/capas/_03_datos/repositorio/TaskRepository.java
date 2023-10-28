package com.juanca.java.arquitectura.capas._03_datos.repositorio;

import com.juanca.java.arquitectura.capas._03_datos.entidad.TaskEntity;
import com.juanca.java.arquitectura.capas._infraestructura.DatabaseConfiguration;
import java.util.List;

public class TaskRepository {

  private final DatabaseConfiguration databaseConfiguration;

  public TaskRepository(DatabaseConfiguration databaseConfiguration) {
    this.databaseConfiguration = databaseConfiguration;
  }

  public List<TaskEntity> getAllTasks() {
    // Lógica de acceso a la base de datos
    return null;
  }

  public void saveTask(TaskEntity task) {
    // Lógica para guardar la tarea en la base de datos
  }

  public List<TaskEntity> getAllTaskEntities() {
    // Lógica para obtener TaskEntity desde la base de datos
    return null;
  }

}