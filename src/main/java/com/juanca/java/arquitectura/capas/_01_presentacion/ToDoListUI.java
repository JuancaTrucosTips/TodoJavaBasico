package com.juanca.java.arquitectura.capas._01_presentacion;

import com.juanca.java.arquitectura.capas._02_logica.ToDoListService;
import com.juanca.java.arquitectura.capas._02_logica.modelo.Task;
import com.juanca.java.arquitectura.capas._infraestructura.AuthenticationService;
import java.util.List;

public class ToDoListUI {

  private final ToDoListService toDoListService;

  private final AuthenticationService authenticationService;

  public ToDoListUI(ToDoListService toDoListService, AuthenticationService authenticationService) {
    this.toDoListService = toDoListService;
    this.authenticationService = authenticationService;
  }

  public void displayTasks() {
    // Obtén la lista de tareas desde el servicio o capa de negocio o logica
    List<Task> tasks = toDoListService.getTasks();
    // Muestra las tareas en la interfaz de usuario
    for (Task task : tasks) {
      System.out.println("Task ID: " + task.getId());
      System.out.println("Description: " + task.getDescription());
      System.out.println("---------------");
    }
  }

  public void addTask(Task task) {
    // Lógica de interacción de usuario
  }

}
