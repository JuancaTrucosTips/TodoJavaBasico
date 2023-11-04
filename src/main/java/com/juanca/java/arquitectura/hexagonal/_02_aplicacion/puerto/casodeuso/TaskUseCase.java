package com.juanca.java.arquitectura.hexagonal._02_aplicacion.puerto.casodeuso;

import com.juanca.java.arquitectura.hexagonal._02_aplicacion.dto.TaskDto;
import java.util.List;

public interface TaskUseCase {

  List<TaskDto> getTasks();

  TaskDto addTask(String description);

}
