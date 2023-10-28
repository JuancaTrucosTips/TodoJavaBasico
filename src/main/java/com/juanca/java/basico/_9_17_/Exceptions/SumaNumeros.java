package com.juanca.java.basico._9_17_.Exceptions;

public class SumaNumeros {

    public static void funcion(int valor) {
        if (valor == 1)
            throw new PersonalException("Error de igualdad");

        System.out.println(valor);
    }
}
