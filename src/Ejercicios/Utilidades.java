package Ejercicios;

import java.util.Arrays;
import java.util.List;

/**
 * 
 * @author matinal
 *
 */
public class Utilidades {
	//final su valor no va a cambiar
	public static final String[] ARTICULOS_DETERMINADOS={"el","la","los","las"};
	public static final String[] ARTICULOS_INDETERMINADOS={"un","una","unos","unas"};
	public static final String[] PREPOSICIONES={"a","ante","bajo","cabe","con","contra","de","durante","en","entre","hacia","hasta","mediante","para","por","segun","sin","so","sobre","tras","versus","via"};
	
	/**
	 * 
	 * @param frase
	 * @return numero palabras de la frase
	 */
	public static int numeroPalabras(String frase){
		String[] palabras=frase.split(" ");
		return palabras.length;
		//del tiron return palabra.split(" ").length;
	}
	/**
	 * 
	 * @param frase
	 * @return numero total preposiciones
	 */
	public static int  numeroPreposiciones(String frase){
		//Crear un array de palabras y convertirla a lista asList
		String[] palabras=frase.split(" ");
		List<String> ListaPreposiciones=Arrays.asList(PREPOSICIONES);
		int contador=0;
		for (int i = 0; i < palabras.length; i++) {
			if (ListaPreposiciones.contains(palabras[i])) {
				contador++;
			}
		}
		return contador;
		
	}
	/**
	 * 
	 * @param frase
	 * @return numero total articulos determinados
	 */
	public static int  numeroArticulosDeterminados(String frase){
		//Crear un array de palabras y convertirla a lista asList
		String[] palabras=frase.split(" ");
		List<String> ListaArticulosDeterminados=Arrays.asList(ARTICULOS_DETERMINADOS);
		int contador=0;
		for (int i = 0; i < palabras.length; i++) {
			if (ListaArticulosDeterminados.contains(palabras[i])) {
				contador++;
			}
		}
		return contador;
		
	}
	/**
	 * 
	 * @param frase
	 * @return numero total articulos indeterminados
	 */
	public static int  numeroArticulosIndeterminados(String frase){
		//Crear un array de palabras y convertirla a lista asList
		String[] palabras=frase.split(" ");
		List<String> ListaArticulosIndeterminados=Arrays.asList(ARTICULOS_INDETERMINADOS);
		int contador=0;
		for (int i = 0; i < palabras.length; i++) {
			if (ListaArticulosIndeterminados.contains(palabras[i])) {
				contador++;
			}
		}
		return contador;
	}
	/**
	 * 
	 * @param frase
	 * @param comienzo
	 * @param fin
	 * @return Devuelve un string a partir de un rango
	 */
	public static String devolverMayuscula(String frase,int comienzo,int fin){
		
		return frase.toUpperCase().substring(comienzo,fin);
	}
}
