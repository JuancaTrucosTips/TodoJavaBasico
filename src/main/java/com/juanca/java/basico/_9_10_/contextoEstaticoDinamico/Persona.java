package com.juanca.java.basico._9_10_.contextoEstaticoDinamico;

public class Persona {
    private final int idPersona;
    private static int contadorPersonas;
    
    // Contexto estatico
    static{
        System.out.println("Ejecucion bloque estatico");
        ++Persona.contadorPersonas;
        //idPersona = 10; // No es posible por que es no static
    }
    
    // Contexto dinamico
    {
        System.out.println("Ejecucion bloque NO estatico");
        this.idPersona = Persona.contadorPersonas++;
        // contadorPersonas++; Acá si se puede acceder a lo static
    }
    
    public Persona(){
        System.out.println("Ejecucion del constructor");
    }

    public int getIdPersona() {
        return idPersona;
    }

    @Override
    public String toString() {
        return "Persona{" + "idPersona=" + idPersona + '}';
    }
    
    
}
