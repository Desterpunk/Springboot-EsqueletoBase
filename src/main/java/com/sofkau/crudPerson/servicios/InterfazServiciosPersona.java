package com.sofkau.crudPerson.servicios;

import com.sofkau.crudPerson.entidades.Persona;

import java.util.List;

public interface InterfazServiciosPersona {
    public List<Persona>listar();
    public Persona listarId(Integer id);
    public Persona guardar(Persona persona);
    public void borrar(Integer id);
    public Persona actualizar(Persona persona);
}
