/**
 * Super clase Vehiculo.java 
 * Atributos: velocidadMaxima, cantidadPasajeros, placa, tipo.
 * @author Natalia Giraldo
 */
package reto2_p74_c2;

public class Vehiculo {
    
    protected String velocidadMaxima;
    protected String cantidadPasajeros;
    protected String placa;
    protected String tipo;
 
    public Vehiculo (String velocidadMaxima,String tipo, String cantidadPasajeros,
            String placa){
        this.velocidadMaxima = velocidadMaxima;
        this.cantidadPasajeros = cantidadPasajeros;
        this.placa = placa;
        this.tipo = tipo;
    }
    
    public String getVelocidadMaxima() {
        return velocidadMaxima;
    }

    public void setVelocidadMaxima(String velocidadMaxima) {
        this.velocidadMaxima = velocidadMaxima;
    }

    public String getCantidadPasajeros() {
        return cantidadPasajeros;
    }

    public void setCantidadPasajeros(String cantidadPasajeros) {
        this.cantidadPasajeros = cantidadPasajeros;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }
}

