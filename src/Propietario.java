
public class Propietario {
	
	private Pez miPez;
	
	public Propietario(Pez miPez) {
		this.miPez=miPez;
	}
	
	public void cambiarNombre(String nuevoNombre) {
		String nombreAntiguo=miPez.getNombre();
		miPez.setNombre(nuevoNombre);
		System.out.println("El pez pasa de llamarse "+nombreAntiguo+" a "+nuevoNombre+".");
	}
	

	public void alimentar(int gramos) {
		miPez.comer(gramos);
	}

}
