
package vehiculos;


public class Automovil extends Vehiculo {
	
	private static int cantidadAutomoviles;
	private int puestos;
        
        
	
	public Automovil(String placa, String nombre, int precio, int peso, Fabricante fabricante, int puestos) {
		super(placa, 4, 100, nombre, precio, peso, "FWD", fabricante);
		this.setPuestos(puestos);
		cantidadAutomoviles++;
	}
	
	public Automovil() {
		this(null, null, 0, 0, null, 0);
	}

	public int getPuestos() {
		return puestos;
	}
        
        public static void setCantidadAutomoviles(int cantidadAutomoviles) {
		Automovil.cantidadAutomoviles = cantidadAutomoviles;
	}
	
	public void setPuestos(int puestos) {
		this.puestos = puestos;
	}

	public static int getCantidadAutomoviles() {
		return cantidadAutomoviles;
	}

	
}