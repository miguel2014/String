package diapositivas;

import java.util.Scanner;

//probamos algunas expresiones regulares

public class LeerDatos {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("Introduce frase");
		String frase = in.nextLine(); //leemos la frase
		//cierro el scanner
		in.close();
		//Quiero saber si la frase tiene dígitos.
		//la expresión regular es: .*[0-9]+.*
		// . es cualquier caracter excepto salto de línea
		// * es cero o mas
		// [0-9] quiere decir ó 0 ó 1 ó 2 ..... ó 9
		// + es uno o mas
		// encaja con: dkjfdklsjf1dfdf, 11, 1, 1dfdf, dfdf1 ....
		// es decir que debe haber como mínimo un número
		boolean fraseTieneNumero = frase.matches(".*[0-9]+.*");
		System.out.println("¿La frase contiene algún número? "+fraseTieneNumero);
		//queremos saber cuantas palabras de la frase tienen número
		//convertirmos la frase en un array de String, usando split
		//y como separador " "
		String[] palabras = frase.split(" ");
		int contadorPalabrasConNumero=0;
		for (int i = 0; i < palabras.length; i++) {
		if (palabras[i].matches(".*[0-9]+.*"))
		contadorPalabrasConNumero++;
		}
		System.out.println("Nº palabras con dígito: "+contadorPalabrasConNumero);
		//queremos saber el número de dígitos en la frase
		//una opción es trabajar con charAt(index) recorriendo la longitud
		//de la frase. Vamos a usar Character.isDigit
		int contadorDeNumeros=0;
		for (int i = 0; i < frase.length(); i++) {
		if (Character.isDigit(frase.charAt(i)))
		contadorDeNumeros++;
		}
		System.out.println("Nº de dígitos: "+contadorDeNumeros);
		//otra opción que funciona de forma similar
		//convertir el String frase a un char[]
		char[] letras = frase.toCharArray();
		contadorDeNumeros = 0; //reseteo contador
		for (int i = 0; i < letras.length; i++) {
		if (Character.isDigit(letras[i]))
		contadorDeNumeros++;
		}
		System.out.println("Nº de dígitos: "+contadorDeNumeros);
		//queremos saber cuantas palabras empiezan por vocal
		//ignoramos acentos, usamos el array de String que contiene
		//las palabras de la frase llamado palabras
		int contadorEmpiezaVocal=0;
		String aux=null;
		for (int i = 0; i < palabras.length; i++) {
		aux = palabras[i].toLowerCase();
		if (aux.startsWith("a") || aux.startsWith("e") || aux.startsWith("i")
		|| aux.startsWith("o") || aux.startsWith("u"))
		contadorEmpiezaVocal++;
		}
		System.out.println("Nº palabras que empiezan por vocal: "+contadorEmpiezaVocal);
		//usando expresiones regulares
		//la expresion regular a usar es: [aeiouAEIOU].*
		//es decir empieza por vocal y le siguie cualquier caracter
		//que no sea salto de línea
		contadorEmpiezaVocal=0; //reseteo de contador
		for (int i = 0; i < palabras.length; i++) {
		if (palabras[i].matches("[aeiouAEIOU].*"))
		contadorEmpiezaVocal++;
		}
		System.out.println("Nº palabras que empiezan por vocal: "+contadorEmpiezaVocal);
		}
		}
