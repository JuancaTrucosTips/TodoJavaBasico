package com.juanca.java.arquitectura.hexagonal._03_dominio_core.puerto;

import com.juanca.java.arquitectura.hexagonal._03_dominio_core.modelo.Task;
import java.util.List;

/**
 * la idea de un "puerto" es para definir una interfaz o contrato que representa
 * la forma en que la capa de dominio se comunica con las capas externas.
 */
public interface TaskServicePort {

  List<Task> getTasks();

  Task addTask(Task task);

}
