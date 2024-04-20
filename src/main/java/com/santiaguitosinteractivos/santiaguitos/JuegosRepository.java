package com.santiaguitosinteractivos.santiaguitos;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface JuegosRepository extends MongoRepository<Juegos, ObjectId> {
    Optional<Juegos> findJuegosBynombreJuego(String nombreJuego);
}
