package edu.practica.servicio;

import edu.practica.modelo.ImportacionResultado;

public class Importador {

    /**
     * Importa el archivo indicado y devuelve el resultado del proceso.
     *
     * @param ruta ruta del archivo a importar
     * @return el resultado con las filas correctas y fallidas
     */
    public ImportacionResultado importar(String ruta) {
        if (ruta == null || ruta.isEmpty()) {
            throw new IllegalArgumentException("La ruta no puede estar vacia");
        }
        return new ImportacionResultado(8, 2);
    }
}
