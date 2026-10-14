
public class Aplicacion {
	
	public Aplicacion() {
		Termostato t1=new Termostato();
		Termostato t2=new Termostato();
		t1.bajar(10);
		t2.subir(10);
		t1.imprimirTemperatura();
		System.out.println("Aplicacion.java: "+t2.getTemperatura());
	}

	public static void main(String[] args) {
		Aplicacion app=new Aplicacion();
	}

}
