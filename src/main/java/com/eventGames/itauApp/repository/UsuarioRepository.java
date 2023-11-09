package com.eventGames.itauApp.repository;

import com.eventGames.itauApp.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface UsuarioRepository  extends JpaRepository<Usuario, Long> {

    @Query("select c from Usuario c where c.email= ?1 or c.telefono= ?2")
    List<Usuario> getUsuarioByEmail(String email, String telefono);
}
