package com.proyecto.CineAPI.model;
import java.util.Date;

public class Cine {


    public Cine(Long idL, String nombrePelicula, String genero, String clasificacion, String sinopsis, int duracionMin, String tipoSala, Date fechaHoraInicio, boolean subtitulada) {
        this.idL = idL;
        this.nombrePelicula = nombrePelicula;
        this.genero = genero;
        this.clasificacion = clasificacion;
        this.sinopsis = sinopsis;
        this.duracionMin = duracionMin;
        this.tipoSala = tipoSala;
        this.fechaHoraInicio = fechaHoraInicio;
        this.subtitulada = subtitulada;
    }

    public Long getIdL() {
        return idL;
    }

    public void setIdL(Long idL) {
        this.idL = idL;
    }

    public String getNombrePelicula() {
        return nombrePelicula;
    }

    public void setNombrePelicula(String nombrePelicula) {
        this.nombrePelicula = nombrePelicula;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getClasificacion() {
        return clasificacion;
    }

    public void setClasificacion(String clasificacion) {
        this.clasificacion = clasificacion;
    }

    public String getSinopsis() {
        return sinopsis;
    }

    public void setSinopsis(String sinopsis) {
        this.sinopsis = sinopsis;
    }

    public int getDuracionMin() {
        return duracionMin;
    }

    public void setDuracionMin(int duracionMin) {
        this.duracionMin = duracionMin;
    }

    public String getTipoSala() {
        return tipoSala;
    }

    public void setTipoSala(String tipoSala) {
        this.tipoSala = tipoSala;
    }

    public Date getFechaHoraInicio() {
        return fechaHoraInicio;
    }

    public void setFechaHoraInicio(Date fechaHoraInicio) {
        this.fechaHoraInicio = fechaHoraInicio;
    }

    public boolean isSubtitulada() {
        return subtitulada;
    }

    public void setSubtitulada(boolean subtitulada) {
        this.subtitulada = subtitulada;
    }

    private Long idL;
    private String nombrePelicula;
    private String genero;
    private String clasificacion;
    private String sinopsis;
    private int duracionMin;
    private String tipoSala;
    private Date fechaHoraInicio;
    private boolean subtitulada;

    //hola yo

}
