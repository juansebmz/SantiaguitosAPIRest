package com.santiaguitosinteractivos.santiaguitos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.DocumentReference;

import java.util.List;

@Document(collection = "santiaguitos")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Santiaguitos {
    @Id
    private ObjectId id;
    private int identificacion;
    private String nombre;
    private String apellido;
    private String grado;
    private List<String> progreso;
}
