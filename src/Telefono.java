
public class Telefono {
	
	private Bateria unaBateria;
	
	public Telefono() {
		unaBateria=new Bateria();
		System.out.println("T: Teléfono creado. Carga actual="+unaBateria.getCarga());
	}
	
	public Telefono(int capacidad) {
		unaBateria=new Bateria(capacidad);
		System.out.println("T: Teléfono creado. Carga actual="+unaBateria.getCarga());
	}
	
	public void llamar(int numeroMinutos) {
		unaBateria.bajarBateria(20*numeroMinutos);
		System.out.println("T: Llamada realizada. Carga actual="+unaBateria.getCarga());
	}
	
	public void hacerFoto() {
		unaBateria.bajarBateria(5);
		System.out.println("T: Foto sacada. Carga actual="+unaBateria.getCarga());
	}
	
	public void hacerFoto(int numeroFotos) {
		unaBateria.bajarBateria(numeroFotos*5);
		System.out.println("T: Fotos sacadas. Carga actual="+unaBateria.getCarga());
	}
	
	public void cargarTelefono(int numeroMinutos) {
		unaBateria.cargarBateria(numeroMinutos*50);
		System.out.println("T: Teléfono cargado. Carga actual="+unaBateria.getCarga());
	}
	 

}
