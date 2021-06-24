/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ico.fes.componentes;

/**
 *
 * @author Fatima
 */
public class CPU {
   private String marca;
   private String modelo;
   private float Velocidad;

    public CPU() {
    }

    public CPU(String marca, String modelo, float Velocidad) {
        this.marca = marca;
        this.modelo = modelo;
        this.Velocidad = Velocidad;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public float getVelocidad() {
        return Velocidad;
    }

    public void setVelocidad(float Velocidad) {
        this.Velocidad = Velocidad;
    }

    @Override
    public String toString() {
        return "CPU{" + "marca=" + marca + ", modelo=" + modelo + ", Velocidad=" + Velocidad + '}';
    }
   
   
}
