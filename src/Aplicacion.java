import java.util.Scanner;

public class Aplicacion {
	
	public Aplicacion() {
	/*	Termostato t1=new Termostato();
		Termostato t2=new Termostato();
		t1.bajar(10);
		t2.subir(10);
		t1.imprimirTemperatura();
		System.out.println("Aplicacion.java: "+t2.getTemperatura());*/
		
		Scanner s = new Scanner(System.in);
		Conversor conversor=new Conversor();
		
		System.out.println("Introduce un número de kilómetros (entero):");
		int km=s.nextInt();
		double millas=conversor.convertirKmAMillas(km);
		System.out.println(km+ " km son "+millas+" millas");
	
		System.out.println("Introduce un número de grados celsius (entero):");
		int celsius=s.nextInt();
		double fahrenheit=conversor.convertirCelsiusAFahrenheit(celsius);
		System.out.println(celsius +" grados celsius son "+fahrenheit+" grados fahrenheit.");
		s.close();
	}

	public static void main(String[] args) {
		Aplicacion app=new Aplicacion();
	}

}
