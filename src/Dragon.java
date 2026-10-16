
public class Dragon {
	
	private String nombre;
	private int puntosVida;
	
	public Dragon(String nombre) {
		this.nombre=nombre;
		puntosVida=300;
		System.out.println("D: nace el dragón "+nombre+" con "+puntosVida+" puntos de vida");
	}
	
	public void atacar(Caballero c, int puntosAtaque) {
		System.out.println("D: "+nombre+" ataca a "+c.getNombre()+" con "+puntosAtaque+" puntos de ataque");
		c.setPuntosVida(c.getPuntosVida()-(puntosAtaque-c.getPuntosArmadura()));
	}
	
	public String getNombre() {
		return nombre;
	}


}
