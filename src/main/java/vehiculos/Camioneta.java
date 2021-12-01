/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vehiculos;


public class Camioneta extends Vehiculo {

    private static int cantidadCamionetas;
    protected boolean volco;
	

    public Camioneta(String placa, int puertas, String nombre, int precio, int peso, Fabricante fabricante, boolean volco) {
        super( placa, puertas, 90, nombre,precio, peso,"4X4", fabricante);
        this.volco = volco;
    }
        
    public static int getCantidadCamionetas() {
        return Camioneta.cantidadCamionetas;
    }
        
    public void setVolco(boolean volco) {
        this.volco = volco;
    }
	
    public boolean isVolco() {
        return volco;
    }

	
}