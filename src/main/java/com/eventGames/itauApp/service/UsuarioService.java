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

    public Usuario getUsuarioByEmail(String email, String telefono){
//        Optional<Usuario> optionalUsuario = usuarioRepository.getUsuarioByEmail(email, telefono);
//        if(optionalUsuario.isPresent())
//            return optionalUsuario.get();
//        else return null;
        List<Usuario> usuarios = usuarioRepository.getUsuarioByEmail(email, telefono);
        if(usuarios.size() > 0){
            return usuarios.get(0);
        }
        else return null;
    }

    public Usuario createUsuario(Usuario usuario){
        return usuarioRepository.save(usuario);
    }
}
