
public class Socio {
	
	private String nombre;
	private double peso;
	private int energia;
	
	public Socio(String nombre, double kg) {
		this.nombre=nombre;
		peso=kg;
		energia=100;
	}
	
	public void hacerEjercicio(int minutos) {
		energia=energia-2*minutos;
		peso=peso-0.05*minutos;
	}
	
	public void tomarBatido() {
		energia=energia+30;
		peso=peso+0.2;
	}
	
	public String toString() {
		return "Nombre: "+nombre+". Peso: "+peso+". Energía: "+energia;
	}

}
