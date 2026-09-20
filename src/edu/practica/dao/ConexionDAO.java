package edu.practica.dao;

import edu.practica.modelo.Conexion;

public class ConexionDAO {

    private final Conexion conexion;

    public ConexionDAO(Conexion conexion) {
        this.conexion = conexion;
    }

    public String construirUrl() {
        return "jdbc:mysql://localhost/" + conexion.getBaseDatos();
    }

    public String   describir( ) {
            return "Conexion a "+conexion.getBasedatos()+" como "+conexion.getUsuario( );
    }
}
