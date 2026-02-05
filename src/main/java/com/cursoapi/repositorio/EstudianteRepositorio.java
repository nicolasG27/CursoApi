package com.cursoapi.repositorio;
import com.cursoapi.controlador.model.Estudiante;
import org.springframework.stereotype.Service;

import javax.swing.border.EtchedBorder;
import java.util.ArrayList;
import java.util.List;

@Service
public class EstudianteRepositorio {
    //private final para no poderla modificar, es inmutable
    private final List<Estudiante> estudiantes = new ArrayList<>(
            List.of(
                    new Estudiante("Nicolás", "García", "12345", 20),
                    new Estudiante("Luis", "Robles", "123456", 19),
                    new Estudiante("Leonardo", "Piedras", "67", 20)
            )
    );

    public List<Estudiante> buscarTodos(){
        return estudiantes;
    }

}
