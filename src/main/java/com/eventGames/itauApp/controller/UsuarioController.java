package com.eventGames.itauApp.controller;

import com.eventGames.itauApp.model.Usuario;
import com.eventGames.itauApp.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/usuario")
public class UsuarioController {

    @Autowired
    private UsuarioService usuarioService;

    @CrossOrigin
    @PostMapping
    public Usuario createUsuario(@RequestBody Usuario usuario){
        return usuarioService.createUsuario(usuario);
    }

    @GetMapping("/{email}")
    public ResponseEntity<Usuario> getSportByEmail(@PathVariable("email") String email){
        ResponseEntity<Usuario> response =  null;
        Usuario usuario = usuarioService.getUsuarioByEmail(email);
        if(usuario == null){
            response = new ResponseEntity<Usuario>( HttpStatus.NO_CONTENT);
        }
        else response = new ResponseEntity<Usuario>(usuario, HttpStatus.OK);
        return response;
    }

}
