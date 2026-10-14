
public class Libro {

	private String titulo, autor;
	private int numeroPaginas, paginaActual;
	
	public Libro(String titulo, String autor, int numeroPaginas) {
		this.titulo=titulo;
		this.autor=autor;
		this.numeroPaginas=numeroPaginas;
		paginaActual=0;
	}
	
	public void leer() {
		paginaActual=paginaActual+1;
	}
	
	public int getPaginasRestantes() {
		int paginasRestantes=numeroPaginas-paginaActual;
		return paginasRestantes;
		//return numeroPaginas-paginaActual;
	}
	
	public String toString() {
		String resultado=titulo+" ("+autor+")"+" - Página "+paginaActual+" de "+numeroPaginas+".";
		return resultado;
	}
	
	public String getAutor() {
		return this.autor;
	}
	
}
