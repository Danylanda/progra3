package com.example.AppRest.Service;

import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class Persona implements PersonaServiceInterface{
    private Integer idPer;
    private String nombres;
    private String apellidos;
    private String email;
    private Date fecNac;

    @Override
    public Persona save(Persona persona) {
        return null;
    }

    @Override
    public Persona update(Persona persona) {
        return null;
    }

    @Override
    public Integer delete(Integer idPer) {
        return null;
    }

    public Integer getIdPer() {
        return idPer;
    }

    public String getNombres() {
        return nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public String getEmail() {
        return email;
    }

    public Date getFecNac() {
        return fecNac;
    }
}
