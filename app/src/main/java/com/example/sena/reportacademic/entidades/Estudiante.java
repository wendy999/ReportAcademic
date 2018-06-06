package com.example.sena.reportacademic.entidades;

import java.util.Date;

public class Estudiante
{
    //CAMPOS QUE VA TENER EL ESTUDIANTE EN LA BASE DE DATOS
    private Integer documento;
    private String nomnre;
    private String apellido;
    private Date fecha_nacimiento;
    private String nombre_acudiente;
    private String grado;
    private String contraseña;
    private String Confirmar_contraseña;
    private String User_id_user;

    //CONSTRUCTOR
    public Estudiante(Integer documento, String nomnre, String apellido, Date fecha_nacimiento, String nombre_acudiente, String grado, String contraseña, String confirmar_contraseña, String user_id_user) {
        this.documento = documento;
        this.nomnre = nomnre;
        this.apellido = apellido;
        this.fecha_nacimiento = fecha_nacimiento;
        this.nombre_acudiente = nombre_acudiente;
        this.grado = grado;
        this.contraseña = contraseña;
        Confirmar_contraseña = confirmar_contraseña;
        User_id_user = user_id_user;
    }

    public Integer getDocumento() {
        return documento;
    }

    public void setDocumento(Integer documento) {
        this.documento = documento;
    }

    public String getNomnre() {
        return nomnre;
    }

    public void setNomnre(String nomnre) {
        this.nomnre = nomnre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Date getFecha_nacimiento() {
        return fecha_nacimiento;
    }

    public void setFecha_nacimiento(Date fecha_nacimiento) {
        this.fecha_nacimiento = fecha_nacimiento;
    }

    public String getNombre_acudiente() {
        return nombre_acudiente;
    }

    public void setNombre_acudiente(String nombre_acudiente) {
        this.nombre_acudiente = nombre_acudiente;
    }

    public String getGrado() {
        return grado;
    }

    public void setGrado(String grado) {
        this.grado = grado;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public String getConfirmar_contraseña() {
        return Confirmar_contraseña;
    }

    public void setConfirmar_contraseña(String confirmar_contraseña) {
        Confirmar_contraseña = confirmar_contraseña;
    }

    public String getUser_id_user() {
        return User_id_user;
    }

    public void setUser_id_user(String user_id_user) {
        User_id_user = user_id_user;
    }
}
