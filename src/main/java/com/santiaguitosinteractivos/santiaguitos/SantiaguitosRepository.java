package com.santiaguitosinteractivos.santiaguitos;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface SantiaguitosRepository extends MongoRepository<Santiaguitos, String> {
}
