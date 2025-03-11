package com.smartjob.ejercicio.repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.smartjob.ejercicio.model.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, UUID> {

    Usuario findByEmail(String email);

    Usuario findByToken(String token);

    Usuario findByEmailAndPassword(String email, String password);
}
