
public class Entrenador {
	
	private String nombre;
	private int intensidad;
	private Socio socioPrioritario;
	
	public Entrenador(String nombre, Socio socioPrioritario) {
		this.nombre=nombre;
		intensidad=1;
		this.socioPrioritario=socioPrioritario;
	}
	
	public Entrenador(String nombre, int intensidad, Socio socioPrioritario) {
		this.nombre=nombre;
		this.intensidad=intensidad;
		this.socioPrioritario=socioPrioritario;
	}
	
	public void entrenarSocio(Socio s, int minutos) {
		s.hacerEjercicio(minutos*intensidad);
	}
	
	public void entrenarSocio(int minutos) {
		socioPrioritario.hacerEjercicio(minutos);
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public int getIntensidad() {
		return intensidad;
	}
	
	public void setNombre(String nuevoNombre) {
		this.nombre=nuevoNombre;
	}

}
