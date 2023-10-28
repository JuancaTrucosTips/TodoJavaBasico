package com.juanca.java.basico._9_17_.Exceptions;

import java.io.Serializable;

public class PersonalException extends RuntimeException implements Serializable {

    public PersonalException(String message){
        super(message);
    }
}
