package com.sistema.imagingweb;

import com.sistema.imagingweb.entidades.Rol;
import com.sistema.imagingweb.entidades.Usuario;
import com.sistema.imagingweb.entidades.UsuarioRol;
import com.sistema.imagingweb.services.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.HashSet;
import java.util.Set;

@SpringBootApplication
public class SistemasImagingwebBackendApplication implements CommandLineRunner {

	@Autowired
	private UsuarioService usuarioService;

	public static void main(String[] args) {
		SpringApplication.run(SistemasImagingwebBackendApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		/*Usuario usuario = new Usuario();

		usuario.setUsername("prueba");
		usuario.setPassword("123");
		usuario.setEmail("prueba@gmail.com");
		usuario.setPerfil("foto.jpg");

		Rol rol = new Rol();
		rol.setRolId(1L);
		rol.setNombre("ADMIN");

		Set<UsuarioRol> usuarioRoles = new HashSet<>();
		UsuarioRol usuarioRol = new UsuarioRol();
		usuarioRol.setRol(rol);
		usuarioRol.setUsuario(usuario);
		usuarioRoles.add(usuarioRol);

		Usuario usuarioGuardado = usuarioService.guardarUsuario(usuario,usuarioRoles);
		System.out.println(usuarioGuardado.getUsername());*/

	}
}
