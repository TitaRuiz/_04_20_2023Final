package com.hedima.modelo;

public final class Factura {

    private int id;
    private final double IVA_ALIMENTOS=0.4;
    private double importe;

    public final double calcularIva(int porcentaje){

        return importe * porcentaje;
    }

    public Factura() {
    }

    public Factura(int id, double importe) {
        this.id = id;
        this.importe = importe;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getImporte() {
        return importe;
    }

    public void setImporte(double importe) {
        this.importe = importe;
    }
}
