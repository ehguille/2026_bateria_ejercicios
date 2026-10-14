
public class Telefono {
	
	private Bateria unaBateria;
	
	public Telefono() {
		unaBateria=new Bateria();
	}
	
	public Telefono(int capacidad) {
		unaBateria=new Bateria(capacidad);
	}

}
