
public class Bateria {
	
	private int capacidad;
	
	public Bateria() {
		this.capacidad=3000;
		System.out.println("Se crea una batería con 3000 mAh de capacidad.");
	}
	
	public Bateria(int capacidad) {
		this.capacidad=capacidad;
		System.out.println("Se crea una batería con "+capacidad+" mAh de capacidad.");
	}

}
