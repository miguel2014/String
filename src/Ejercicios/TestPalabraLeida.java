package Ejercicios;

import java.util.Scanner;

public class TestPalabraLeida {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Introduce una palabra");
		Scanner in =new Scanner(System.in);
		String palabra=in.next();
		PalabraLeida p1=new PalabraLeida(palabra);
		in.close();
		System.out.println("Numero letras "+p1.NumeroDeLetras());
		System.out.println("Acaba en vocal? "+p1.AcabaEnVocal());
		System.out.println("Acaba en vocal 2? "+p1.AcabaEnVocal2());
		System.out.println("Empieza en vocal? "+p1.EmpiezaPorVocal());
		System.out.println("Empieza en vocal 2? "+p1.EmpiezaPorVocal2());
		System.out.println("Numero vocales "+p1.NumerodeVocales());
		System.out.println("Contiene H? "+p1.ContieneH());
		System.out.println("Contiene H 2?  "+p1.ContieneH2());
		System.out.println("Es un palindromo ? "+ p1.esunPalindromo() );
		if (args.length>0) {
		String comparar=args[0];
		System.out.println("Es igual a "+comparar+" ? "+ p1.SonIguales(comparar) );
		}
	}

}
