package com.eventGames.itauApp.service;

import com.eventGames.itauApp.model.Usuario;
import com.eventGames.itauApp.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UsuarioService {

    @Autowired
    private UsuarioRepository usuarioRepository;

    public Usuario getUsuarioByEmail(String email){
        Optional<Usuario> optionalUsuario = usuarioRepository.getUsuarioByEmail(email);
        if(optionalUsuario.isPresent())
            return optionalUsuario.get();
        else return null;
    }

    public Usuario createUsuario(Usuario usuario){
        return usuarioRepository.save(usuario);
    }
}
