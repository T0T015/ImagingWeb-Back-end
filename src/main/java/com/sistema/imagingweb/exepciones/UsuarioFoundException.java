package com.sistema.imagingweb.exepciones;

public class UsuarioFoundException extends Exception {
    public UsuarioFoundException(){
        super("Usuario ya existente en la base de datos");
    }

    public UsuarioFoundException(String mensaje){
        super(mensaje);
    }
}
