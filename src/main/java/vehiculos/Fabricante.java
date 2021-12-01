/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vehiculos;

import java.util.ArrayList;

public class Fabricante {
	
	
    private String nombre;
    private Pais pais;
    private static ArrayList<Fabricante> lista = new ArrayList<Fabricante>();
    private int cantVentas;
	
    public Fabricante(String nombre, Pais pais) {
        this.nombre= nombre;
        this.pais = pais;
        lista.add(this);
    }
	
    public Fabricante() {
        this(null, null);
    }
    
    public static Fabricante fabricaMayorVentas() {
        Fabricante mayor = lista.get(0);
        for(Fabricante aux: lista){
            if(aux.getVentas() > mayor.getVentas()){
                mayor = aux;
            }
        }
        return mayor;
    }
	
    public String getNombre() {
        return nombre;
    }
    public int getVentas(){
        return cantVentas;
    }
	
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
	
    public Pais getPais() {
        return pais;
    }
	
    public void setPais(Pais pais) {
        this.pais = pais;
    }
	
}