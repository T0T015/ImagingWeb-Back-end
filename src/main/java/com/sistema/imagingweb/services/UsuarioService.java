package com.sistema.imagingweb.services;

import com.sistema.imagingweb.entidades.Usuario;
import com.sistema.imagingweb.entidades.UsuarioRol;

import java.util.Set;

public interface UsuarioService {
     public Usuario guardarUsuario(Usuario usuario, Set<UsuarioRol> usuarioRoles) throws Exception;

     public Usuario obetenerUsuario(String username);

     public void eliminarUsuario(Long usuarioId);
}
