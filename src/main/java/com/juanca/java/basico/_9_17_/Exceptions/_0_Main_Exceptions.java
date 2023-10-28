package com.juanca.java.basico._9_17_.Exceptions;

public class _0_Main_Exceptions {
    public static void main(String[] args) {
        llamarFuncion(1);
    }

    public static void llamarFuncion(int valor){
        try {
            SumaNumeros.funcion(valor);
        } catch (PersonalException e) {
            System.out.println("Salio la excepcion");
        }
    }
}
