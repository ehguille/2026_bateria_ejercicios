
public class Cuidador {

	private int boteComida;
	
	public Cuidador() {
		boteComida=3;
	}
	
	public Cuidador(int gramos) {
		boteComida=gramos;
	}
	
	public void alimentar(Pez unPez) {
		unPez.comer(1);
	}
	
	public void alimentar(Pez unPez, int gramos) {
		unPez.comer(gramos);
	}
	
	
}
