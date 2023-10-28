package com.juanca.java.arquitectura.hexagonal._01_infraestructura.entitymanager.repository;

import com.juanca.java.arquitectura.hexagonal._01_infraestructura.entitymanager.entity.TaskEntity;
import java.util.List;

public interface TaskRepository {

  List<TaskEntity> getAllTaskEntities();

  void saveTask(TaskEntity task);

}
