
public class Bateria {
	
	private int capacidad, carga;
	
	public Bateria() {
		this.capacidad=3000;
		this.carga=capacidad;
		System.out.println("B: Se crea una batería con 3000 mAh de capacidad.");
	}
	
	public Bateria(int capacidad) {
		this.capacidad=capacidad;
		this.carga=capacidad;
		System.out.println("B: Se crea una batería con "+capacidad+" mAh de capacidad.");
	}
	
	public void bajarBateria(int mah) {
		carga=carga-mah;
	}
	
	public void cargarBateria(int mah) {
		carga=carga+mah;
	}
	
	public int getCarga() {
		return carga;
	}

}
