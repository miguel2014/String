package Ejercicios;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TestConstitucion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in =new Scanner(System.in);
		String palabra="";
		List<String> listaconstitucion=new ArrayList<String>();
		while (in.hasNext()) {
		palabra=in.next();
		listaconstitucion.add(palabra);
		}
		in.close();
		StringBuilder sbuilder=new StringBuilder();
		for (int i = 0; i < 500; i++) {
			int aleatorio=(int) (Math.random()*listaconstitucion.size());
			sbuilder.append(listaconstitucion.get(aleatorio)+" ");
		}
		//System.out.println(listaconstitucion);
		//System.out.println(sbuilder);
		System.out.println("Total de palabras "+Utilidades.numeroPalabras(sbuilder.toString()));
		System.out.println("Texto en mayuscula "+Utilidades.devolverMayuscula(sbuilder.toString(),1,5));
		System.out.println("Preposiciones "+Utilidades.numeroPreposiciones(sbuilder.toString().toLowerCase()));
	}

}
