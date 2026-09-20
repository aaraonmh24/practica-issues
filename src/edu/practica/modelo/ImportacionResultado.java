package edu.practica.modelo;

public class ImportacionResultado {

    private final int filasOk;
    private final int filasFallidas;

    public ImportacionResultado(int filasOk, int filasFallidas) {
        this.filasOk = filasOk;
        this.filasFallidas = filasFallidas;
    }

    public int getFilasOk() {
        return filasOk;
    }

    public int getFilasFallidas() {
        return filasFallidas;
    }

    public int total() {
        return filasOk + filasFallidas;
    }
}
