
public class Termostato {
	
	private int grados;
	
	public Termostato() {
		grados=20;
		System.out.println("Termostato.java: se ha creado un termostato a 20 grados.");
	}
	
	public void subir() {
		grados=grados+1;//grados++
		System.out.println("Termostato.java: se ha subido la temperatura 1 grado.");
	}
	
	public void subir(int grados) {
		this.grados=this.grados+grados;
		System.out.println("Termostato.java: se ha subido la temperatura "+grados+" grados.");
	}
	
	public void bajar() {
		grados--;
		System.out.println("Termostato.java: se ha bajado la temperatura 1 grado.");
	}
	
	public void bajar(int grados) {
		this.grados=this.grados-grados;
		System.out.println("Termostato.java: se ha bajado la temperatura "+grados+" grados.");
	}
	
	public int getTemperatura() {
		return grados;
	}
	
	public void imprimirTemperatura() {
		System.out.println("Termostato.java: temperatura: "+grados);
	}

}
