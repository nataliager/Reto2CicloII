/**
 * Subclase: Particular.java Extends Vehiculo.java
 * Atributos: String color
 * @author Natalia Giraldo
 */
package reto2_p74_c2;

public class Particular extends Vehiculo{
    
    private String color;
    
    public Particular(String color,String tipo, String velocidadMaxima, 
            String cantidadPasajeros, String placa){
        super(velocidadMaxima,tipo,cantidadPasajeros,placa);
        this.color = color;
    }
    
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    
    @Override
    public String toString() {
        return "\tVehículo " +tipo+ " - Placa: "+ placa + "\n"
                + "\tvelocidad: " + velocidadMaxima + " km/h\n"
                + "\tpasajeros: " + cantidadPasajeros + "\n"
                + "\tcolor: " + this.color;
    }
}
