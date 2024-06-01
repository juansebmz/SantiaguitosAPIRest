package com.santiaguitosinteractivos.santiaguitos;


import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;



@Document(collection = "santiaguitos")

public class Santiaguitos {
    @Id
    private String _id;
    private String nombre;
    private String apellido;
    private String grado;

    public Santiaguitos(String _id, String nombre, String apellido, String grado) {
        this._id = _id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.grado = grado;
    }

    public Santiaguitos() {
    }

    public String get_id() {
        return _id;
    }

    public void set_id(String _id) {
        this._id = _id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getGrado() {
        return grado;
    }

    public void setGrado(String grado) {
        this.grado = grado;
    }

    @Override
    public String toString() {
        return "Santiaguitos{" +
                "_id='" + _id + '\'' +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", grado='" + grado + '\'' +
                '}';
    }
}
