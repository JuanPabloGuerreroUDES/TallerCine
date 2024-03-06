/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PAQUETE;

/**
 *
 * @author juang
 */
public class Pelicula {
    private String titulo;
    private String actores;
    private String duracion;
    private String clasificacion;

    public Pelicula(String titulo, String actores, String duracion, String clasificacion) {
        this.titulo = titulo;
        this.actores = actores;
        this.duracion = duracion;
        this.clasificacion = clasificacion;
    }

    // Getters y setters de pelicula
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getActores() {
        return actores;
    }

    public void setActores(String actores) {
        this.actores = actores;
    }

    public String getDuracion() {
        return duracion;
    }

    public void setDuracion(String duracion) {
        this.duracion = duracion;
    }

    public String getClasificacion() {
        return clasificacion;
    }

    public void setClasificacion(String clasificacion) {
        this.clasificacion = clasificacion;
    }
}


