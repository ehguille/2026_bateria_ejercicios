
public class Pez {

	private String nombre;
	private int hambre, energia, peso;
	
	public Pez(String nombre) {
		this.nombre=nombre;
		hambre=30;
		energia=80;
		peso=50;
	}
	
	public void comer(int gramos) {
		hambre=hambre-4*gramos;
		peso+=1*gramos;
	}
	
	public void nadar(int minutos) {
		energia=energia-3*minutos;
		hambre=hambre+2*minutos;
	}
	
	public void descansar(int horas) {
		energia+=horas*10;
		hambre+=1*horas;
	}
	
	public void mostrarEstado() {
		System.out.println(nombre+"(hambre="+hambre+",energía="+energia+",peso="+peso+")");
	}
	
	public String toString() {
		return  nombre+"(hambre="+hambre+",energía="+energia+",peso="+peso+")";
	}
	
	public void setNombre(String nombre) {
		this.nombre=nombre;
	}
	
	public String getNombre() {
		return nombre;
	}
	
}
