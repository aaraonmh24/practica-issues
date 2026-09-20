package edu.practica.modelo;

public class ImportacionResultado {

    private final int filasOk;
    private final int fillasFallidas;

    public ImportacionResultado(int filasOk, int fillasFallidas) {
        this.filasOk = filasOk;
        this.fillasFallidas = fillasFallidas;
    }

    public int getFilasOk() {
        return filasOk;
    }

    public int getFillasFallidas() {
        return fillasFallidas;
    }

    public int total() {
        return filasOk + fillasFallidas;
    }
}
