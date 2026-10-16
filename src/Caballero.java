
public class Caballero {
	
	private String nombre;
	private int puntosVida;
	private int puntosArmadura;
	
	public Caballero(String nombre) {
		this.nombre=nombre;
		puntosVida=120;
		puntosArmadura=20;
	}
	
	public void setPuntosVida(int puntosVida) {
		this.puntosVida=puntosVida;
		System.out.println("C: "+nombre+" pasa a tener "+puntosVida+" puntos de vida");
	}
	
	public int getPuntosVida() {
		return puntosVida;
	}
	
	public int getPuntosArmadura() {
		return puntosArmadura;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void atacar(Dragon d, int puntosAtaque) {
		System.out.println("C: "+nombre+" ataca al dragón "+d.getNombre()+".");
		d.setPuntosVida(d.getPuntosVida()-puntosAtaque);
	}
	
	public void tomarPocion() {
		puntosVida=puntosVida+25;
		System.out.println("D: "+nombre+" toma una poción, ahora tiene "+puntosVida+" puntos de vida");
	}
	
	public void tomarPocion(int puntosSanacion) {
		puntosVida+=puntosSanacion;
		System.out.println("D: "+nombre+" toma una poción, ahora tiene "+puntosVida+" puntos de vida");
	}
	

}
