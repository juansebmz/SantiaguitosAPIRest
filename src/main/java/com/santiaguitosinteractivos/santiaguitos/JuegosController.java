package com.santiaguitosinteractivos.santiaguitos;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/v1/juegos")
public class JuegosController {

    @Autowired
    JuegosService juegosService;

    @GetMapping
    private ResponseEntity getAllJuegos(){
        return new ResponseEntity<List<Juegos>>(juegosService.getAllJuegos(), HttpStatus.OK);
    }

    @GetMapping ("juegos/{nombreJuego}")
    public ResponseEntity<Optional<Juegos>> getJuego(@PathVariable String nombreJuego){
        return new ResponseEntity<Optional<Juegos>>(juegosService.buscarPorNombre(nombreJuego), HttpStatus.OK);
    }

}
