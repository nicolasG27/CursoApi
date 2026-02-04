package com.cursoapi.controlador;

import com.cursoapi.controlador.model.Estudiante;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

//@----> Anotaciones
//SpringBoot -> servidor
//Postman -> cliente
@RestController
@RequestMapping("/estudiantes") //define la base del endpoint
public class        EstudiantesControlador {

    @GetMapping
    String getEstudiantes(){
        return "Hola estudiantes";
    }


    @PostMapping public ResponseEntity<String> postEstudiante(@RequestBody Estudiante estudiante){
        return new ResponseEntity<>("Hola nuevo estudiante:" + estudiante.getNombre(), HttpStatus.CREATED);
    }

    @DeleteMapping("{matricula}") public String deleteEstudiante(@PathVariable String matricula){
        return "Hola estudiante eliminado";
    }
}
