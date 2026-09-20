package edu.practica;

import edu.practica.dao.ConexionDAO;
import edu.practica.modelo.Conexion;
import edu.practica.modelo.ImportacionResultado;
import edu.practica.servicio.Importador;

public class Main {

    public static void main(String[] args) {
        ConexionDAO dao = new ConexionDAO(new Conexion("inventario", "admin"));
        System.out.println(dao.construirUrl());
        System.out.println(dao.describir());

        ImportacionResultado r = new Importador().importar("datos.csv");
        System.out.println("Fallidas: " + r.getFilasFallidas() + " de " + r.total());
    }
}
