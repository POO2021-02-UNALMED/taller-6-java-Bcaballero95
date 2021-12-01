/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vehiculos;



import java.util.ArrayList;

import java.util.ArrayList;

public class Pais {
	
	private static ArrayList<Pais> listado = new ArrayList<Pais>();
	private String nombre;
	
	public Pais(String nombre) {
		this.setNombre(nombre);
		listado.add(this);
	}
	
	public Pais() {
		this(null);
	}
	
	
	public static Pais paisMasVendedor() {
		
		ArrayList<Integer> venta = new ArrayList<Integer>();
                
                ArrayList<Vehiculo> vehiculos = Vehiculo.getLista();
                
                
		for(Pais f: listado) {
			int count = 0;
			for(Vehiculo v: vehiculos) {
                            if(f.getNombre().equals(v.getFabricante().getPais().getNombre())) {
                                count++;
				}
			}
			venta.add(count);
		}
		
		int mayor = 0;
                
		for(int vehiculo: venta) {
			if(vehiculo > mayor) {
				mayor = vehiculo;
			}
		}
		
		return listado.get(venta.indexOf(mayor));
	}
        
        public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
}