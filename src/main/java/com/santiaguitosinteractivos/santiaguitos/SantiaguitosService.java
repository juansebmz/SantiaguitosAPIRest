package com.santiaguitosinteractivos.santiaguitos;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SantiaguitosService {

    @Autowired
    private SantiaguitosRepository santiaguitosRepository;

    public List<Santiaguitos> getAllSantiaguitos(){
        return santiaguitosRepository.findAll();
    }

    public Optional<Santiaguitos> oneSantiaguito(int identificacion){
        return santiaguitosRepository.findSantiaguitosByidentificacion(identificacion);
    }
}
