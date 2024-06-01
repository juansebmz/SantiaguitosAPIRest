package com.santiaguitosinteractivos.santiaguitos;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class SantiaguitosService {

    @Autowired
    private SantiaguitosRepository santiaguitosRepository;



    public void saveorUpdate(Santiaguitos santiaguitos) {

        santiaguitosRepository.save(santiaguitos);
    }

    public Iterable<Santiaguitos> listAll() {

        return this.santiaguitosRepository.findAll();
    }

    public void deleteSantiaguito(String id) {
        santiaguitosRepository.deleteById(id);
    }

    public Santiaguitos getSantiaguitoById(String santiaguitoid) {
        return santiaguitosRepository.findById(santiaguitoid).get();
    }
}
