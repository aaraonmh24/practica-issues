package edu.practica.modelo;

public class Conexion {

    private final String basedatos;
    private final String usuario;

    public Conexion(String basedatos, String usuario) {
        this.basedatos = basedatos;
        this.usuario = usuario;
    }

    public String getBasedatos() {
        return basedatos;
    }

    public String getUsuario() {
        return usuario;
    }
}
