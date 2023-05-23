package com.sistema.imagingweb;

import com.sistema.imagingweb.entidades.Rol;
import com.sistema.imagingweb.entidades.Usuario;
import com.sistema.imagingweb.entidades.UsuarioRol;
import com.sistema.imagingweb.exepciones.UsuarioFoundException;
import com.sistema.imagingweb.services.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import java.util.HashSet;
import java.util.Set;

@SpringBootApplication
public class SistemasImagingwebBackendApplication implements CommandLineRunner {

	@Autowired
	private UsuarioService usuarioService;

	@Autowired
	public BCryptPasswordEncoder bCryptPasswordEncoder;

	public static void main(String[] args) {
		SpringApplication.run(SistemasImagingwebBackendApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		/*try {
			Usuario usuario = new Usuario();

			usuario.setUsername("Admin");
			usuario.setPassword(bCryptPasswordEncoder.encode("admin"));
			usuario.setEmail("admin@test.com");
			usuario.setPerfil("default.jpg");

			Rol rol = new Rol();
			rol.setRolId(1L);
			rol.setRolNombre("ADMIN");

			Set<UsuarioRol> usuarioRoles = new HashSet<>();
			UsuarioRol usuarioRol = new UsuarioRol();
			usuarioRol.setRol(rol);
			usuarioRol.setUsuario(usuario);
			usuarioRoles.add(usuarioRol);

			Usuario usuarioGuardado = usuarioService.guardarUsuario(usuario, usuarioRoles);
			System.out.println(usuarioGuardado.getUsername());

		}catch (UsuarioFoundException exception){
			exception.printStackTrace();

		}*/
	}
}
