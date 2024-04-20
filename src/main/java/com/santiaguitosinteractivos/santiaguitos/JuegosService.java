package com.santiaguitosinteractivos.santiaguitos;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class JuegosService {

    @Autowired
    private JuegosRepository juegosRepository;

    public List<Juegos> getAllJuegos() {
        return juegosRepository.findAll();
    }
    public Optional<Juegos> buscarPorNombre(String nombreJuego){
        return juegosRepository.findJuegosBynombreJuego(nombreJuego);
    }
}
