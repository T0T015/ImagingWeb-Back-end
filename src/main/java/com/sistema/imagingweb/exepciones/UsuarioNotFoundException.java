package com.sistema.imagingweb.exepciones;

public class UsuarioNotFoundException extends  Exception{
    public UsuarioNotFoundException(){
        super("Usuario no existe en la base de datos");
    }

    public UsuarioNotFoundException(String mensaje){
        super(mensaje);
    }
}
