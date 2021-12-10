package uaslp.objetos.escuela;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Alumno {
    private String nombre;
    private String clave;
    private String claveDeCarrera;
    private int anioDeIngreso;
    private LocalDate fechaNacimiento;

    public Alumno(){

    }

    public Alumno(String nombre, String clave, String claveDeCarrera, int anioDeIngreso, LocalDate fechaNacimiento) {
        this.nombre = nombre;
        this.clave = clave;
        this.claveDeCarrera = claveDeCarrera;
        this.anioDeIngreso = anioDeIngreso;
        this.fechaNacimiento = fechaNacimiento;
    }

    public static AlumnoBuilder builder() {
        return new AlumnoBuilder();
    }

    public String getNombre() {
        return this.nombre;
    }

    public String getClave() {
        return this.clave;
    }

    public String getClaveDeCarrera() {
        return this.claveDeCarrera;
    }

    public int getAnioDeIngreso() {
        return this.anioDeIngreso;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

}
