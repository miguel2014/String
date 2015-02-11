package Ejercicios;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Programa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//si no hay argumentos
		if (args.length==0)
		{
			Scanner in=new Scanner(System.in);
			List <String> listaNombres=new ArrayList<String>();
			String palabra="";
			while (in.hasNext()){
				palabra=in.next();
				listaNombres.add(palabra);
			}
			in.close();
			//Mostrar todos
			for (int i = 0; i < listaNombres.size(); i++) {
				System.out.println(listaNombres.get(i));
			}
			//Total de nombres
			System.out.println("Total de nombres "+listaNombres.size());
			//Nueva lista con A
			List <String> listaNombresA=new ArrayList<String>();
			for (int i = 0; i < listaNombres.size(); i++) {
				if (listaNombres.get(i).startsWith("a")) {
						listaNombresA.add(listaNombres.get(i));
				}
						
			}
			System.out.println(listaNombresA);
			System.out.println("\n\n\n");
			//Nueva lista sin vocal
			List <String> listanombressinvocalfinal=new ArrayList<String>();
			for (int i = 0; i < listaNombres.size(); i++) {
				if (!listaNombres.get(i).matches(".*[aeiou]$")) {
					listanombressinvocalfinal.add(listaNombres.get(i));
				}
			}
			System.out.println(listanombressinvocalfinal);
			System.out.println("\n\n\n");
			//Nueva lista de nombre largo y corto
			List <String> listaNombreLargo=new ArrayList<String>();
			List <String> listaNombrePequeño=new ArrayList<String>();
			listaNombreLargo.add(listaNombres.get(0));
			listaNombrePequeño.add(listaNombres.get(0));
			for (int i = 1; i < listaNombres.size(); i++) {
				if (listaNombreLargo.get(0).length()<listaNombres.get(i).length()) {
					listaNombreLargo.remove(0);
					listaNombreLargo.add(listaNombres.get(i));
				}
				else if(listaNombrePequeño.get(0).length()>listaNombres.get(i).length())
				{
					listaNombrePequeño.remove(0);
					listaNombrePequeño.add(listaNombres.get(i));
				}
			}
			System.out.println("Nombre mas largo "+ listaNombreLargo );
			System.out.println("Total longitud nombre: "+listaNombreLargo.get(0).length());
			System.out.println("Nombre mas corto "+ listaNombrePequeño );
			System.out.println("Total longitud nombre: "+listaNombrePequeño.get(0).length());
			
		}
		//si hay argumentos
		else{
			//codigo duplicado
			String argumento=args[0];
			Scanner in=new Scanner(System.in);
			String palabra="";
			List <String> listaNombres=new ArrayList<String>();
			List <String> listaNombresSugeridos=new ArrayList<String>();

			boolean contieneNombre=false;
			while (in.hasNext()){
				palabra=in.next();
				listaNombres.add(palabra);
				if (palabra.equalsIgnoreCase(argumento)) {
					contieneNombre=true;
					System.out.println("Existe en la lista el nombre de :" +argumento);
					break; //al estar en la lista no merece la pena seguir buscando
				}
				
			}
			in.close();
			if (!contieneNombre && argumento.length()>1) {
				System.out.println("No existe en la lista el nombre de :" +argumento);
		
			String comiezaPor=argumento.substring(0,argumento.length());
			//Recorremos la lista que contiene los nombres
			for (String string : listaNombres) {
				if (string.startsWith(comiezaPor)) {
					listaNombresSugeridos.add(string);
				}
			}
			System.out.println("Palabras sugeriddas "+listaNombresSugeridos);	
			}
		}
	}
		
}
