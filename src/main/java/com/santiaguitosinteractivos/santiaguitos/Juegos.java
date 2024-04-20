package com.santiaguitosinteractivos.santiaguitos;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document(collection = "juegos")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Juegos {
    @Id
    private ObjectId id;
    private String nombreJuego;
    private String categoria;
    private String descripcion;
    private List<String> niveles;
}
