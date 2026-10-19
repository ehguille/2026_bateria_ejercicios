
public class Alumno {
	
	private String nombre;
	private double n1, n2, n3;
	
	public Alumno(String nombre, double n1, double n2, double n3) {
		this.nombre=nombre;
		this.n1=n1;
		this.n2=n2;
		this.n3=n3;
	}
	
	public double calcularMedia() {
		return (n1+n2+n3)/3;
	}
	
	public void subirNota() {
		n1++;
		n2++;
		n3++;
	}
	
	public void presentarse() {
		System.out.println("Me llamo "+nombre+" y mi nota media es "+calcularMedia());
	}

}
