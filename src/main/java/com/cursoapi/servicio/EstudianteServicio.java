package com.cursoapi.servicio;

import com.cursoapi.controlador.model.Estudiante;
import com.cursoapi.repositorio.EstudianteRepositorio;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class EstudianteServicio {
    private final EstudianteRepositorio estudianteRepostiorio;

    public EstudianteServicio(EstudianteRepositorio estudianteRepositorio) {
        this.estudianteRepostiorio = estudianteRepositorio;
    }

    public List<Estudiante> buscarTodos(){
        return estudianteRepostiorio.buscarTodos();
    }
}
