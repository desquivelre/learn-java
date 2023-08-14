package pe.com.alura.AnnotationTest;

import java.time.LocalDate;

public class Usuario {
    private String nombre;
    @StringMinLength(lengthValue = 8)
    private String contrasena;
    @EdadMinima(valor = 18)
    private LocalDate fechaNacimiento;

    public Usuario() {
    }

    public Usuario(String nombre, String contrasena, LocalDate fechaNacimiento) {
        this.nombre = nombre;
        this.contrasena = contrasena;
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }
}
