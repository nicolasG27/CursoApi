package com.cursoapi.controlador;

import com.cursoapi.controlador.model.Estudiante;
import com.cursoapi.servicio.EstudianteServicio;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

//@----> Anotaciones
//SpringBoot -> servidor
//Postman -> cliente
@RestController
@RequestMapping("/estudiantes") //define la base del endpoint
public class        EstudiantesControlador {

    private final EstudianteServicio estudianteServicio;

    public EstudiantesControlador(EstudianteServicio estudianteServicio){
        this.estudianteServicio = estudianteServicio;
    }

    @GetMapping
    public ResponseEntity<List<Estudiante>> getEstudiantes(){
        return new ResponseEntity<>(estudianteServicio.buscarTodos(),HttpStatus.OK);
    }

    @PostMapping public ResponseEntity<String> postEstudiante(@RequestBody Estudiante estudiante){
        return new ResponseEntity<>("Hola nuevo estudiante:" + estudiante.getNombre(), HttpStatus.CREATED);
    }

    @DeleteMapping("{matricula}")
    public String deleteEstudiante(@PathVariable String matricula){
        return "Hola estudiante eliminado"; //fadsf
    }
    @PutMapping("{matricula}")
    public String actualizarEstudiante(@PathVariable String matricula, @RequestBody Estudiante Estudiante){
        return "Hola estudiante actualizado MATEO";
    }


}
