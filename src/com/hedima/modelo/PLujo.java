package com.hedima.modelo;

public class PLujo extends Producto{

    private String material;
    @Override
    public double calcularIVA() {
        return pvp * 0.21;
    }

    public PLujo() {

    }

    public PLujo(String nombre, double pvp, String material) {
        super(nombre, pvp);
        this.material = material;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }
}
