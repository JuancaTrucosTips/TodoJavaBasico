package com.juanca.java.arquitectura.hexagonal._02_aplicacion.casodeuso;

import com.juanca.java.arquitectura.hexagonal._01_infraestructura.adaptador.dto.TaskDto;
import java.util.List;

public interface TaskUseCase {

  List<TaskDto> getTasks();

}
