/**
 * Subclase: Comercial.java Extends Vehiculo.java
 * Atributos: double cargaLimite
 * @author Natalia Giraldo
 */
package reto2_p74_c2;

public class Comercial extends Vehiculo{
    
    private String cargaLimite;
    
    public Comercial(String cargaLimite,String velocidadMaxima,String tipo, 
            String cantidadPasajeros,String placa){
        super(velocidadMaxima, tipo, cantidadPasajeros, placa);
        this.cargaLimite = cargaLimite;
    }

    public String getCargaLimite() {
        return cargaLimite;
    }

    public void setCargaLimite(String cargaLimite) {
        this.cargaLimite = cargaLimite;
    }
    
    @Override
    public String toString() {
        return "\tVehículo " +tipo+ " - Placa: "+ placa + "\n"
                + "\tvelocidad: " + velocidadMaxima + " km/h\n"
                + "\tpasajeros: " + cantidadPasajeros + "\n"
                + "\tCarga máxima: " + this.cargaLimite+ "kg\n";  
    }  
}
