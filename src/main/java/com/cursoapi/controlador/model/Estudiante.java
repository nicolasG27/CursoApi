package com.cursoapi.controlador.model;

public class Estudiante {
    private String nombre;
    private String apellido;
    private String matricula;
    private Integer edad;
    public Estudiante(String nombre, String apellido, String matricula, Integer edad){
        this.nombre = nombre;
        this.apellido = apellido;
        this.matricula = matricula;
        this.edad=edad;
    }
    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }
}
