/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package universidad.Entidades;

import java.time.LocalDate;

/**
 *
 * @author Exon
 */
public class Alumnos { 
    
    private int idAlumno;
    private int dni;
    private String apellido;
    private String nombre;
    private LocalDate fecha;
    private boolean estado;

    public Alumnos(int idAlumno, int dni, String apellido, String nombre, LocalDate fecha, boolean estado) {
        this.idAlumno = idAlumno;
        this.dni = dni;
        this.apellido = apellido;
        this.nombre = nombre;
        this.fecha = fecha;
        this.estado = estado;
    }

    public Alumnos(int dni, String apellido, String nombre, LocalDate fecha, boolean estado) {
        this.dni = dni;
        this.apellido = apellido;
        this.nombre = nombre;
        this.fecha = fecha;
        this.estado = estado;
    }

    public Alumnos() {
    }

    public int getIdAlumno() {
        return idAlumno;
    }

    public void setIdAlumno(int idAlumno) {
        this.idAlumno = idAlumno;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
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

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Alumnos{" + "idAlumno=" + idAlumno + ", dni=" + dni + ", apellido=" + apellido + ", nombre=" + nombre + ", fecha=" + fecha + ", estado=" + estado + '}';
    }
    
    
}
