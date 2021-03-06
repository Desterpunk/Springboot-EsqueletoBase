package com.sofkau.crudPerson.controlador;

import com.sofkau.crudPerson.entidades.Persona;
import com.sofkau.crudPerson.servicios.InterfazServiciosPersona;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.persistence.criteria.CriteriaBuilder;

@RestController
@RequestMapping("api")
public class ControladorPersona {
    @Autowired
    private InterfazServiciosPersona servicio;

    @GetMapping(value = "/listarPersonas")
    public Iterable<Persona>listarPersonas(){
        return servicio.listar();
    }

    @PostMapping(value = "/guardarPersona")
    public Persona guardarPersona(@RequestBody Persona persona){
        return servicio.guardar(persona);
    }

    @GetMapping(value = "/listarId")
    public Persona listarId(@RequestBody Integer id){
        return servicio.listarId(id);
    }

    @DeleteMapping(value = "/borrar")
    public void borrar(@RequestBody Integer id){
        servicio.borrar(id);
    }

    @PostMapping(value = "/actualizarPersona")
    public Persona actualizarPersona(@RequestBody Persona persona){
        return servicio.actualizar(persona);
    }
}
