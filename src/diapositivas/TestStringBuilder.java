package diapositivas;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class TestStringBuilder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Crear un StringBuilder a partir de un string que leemos de Scanner
	Scanner in=new Scanner(System.in);
	StringBuilder sBuilder=new StringBuilder();
	System.out.println("Introduce palabras,quit para salir:");
	//leer desde un scanner,primero crear una variable que recoja los datos 
	String aux=null;
	while(true){
		aux=in.next();
		if (aux.equalsIgnoreCase("quit"))
			break;
		//Añadimos al stringbuilder
		sBuilder.append(aux+' ');
	}
	in.close();
	System.out.println("Ya no puedes escribir mas");
	//Control de errores
	if (sBuilder.length()>0) 
		sBuilder.deleteCharAt(sBuilder.length()-1);
	System.out.println(sBuilder);
	//Le damos la vuelta a Stringbuilder
	sBuilder.reverse(); //es mutante ?
	System.out.println(sBuilder);//Si
	//Guardamos en un array de String usando el delimitador
	String string=sBuilder.toString();
	String[] array=string.split(" ");
	//Comprobamos contenido del array
	for (int i = 0; i < array.length; i++) {
		System.out.println(i+") "+array[i]);
	}
	//Hay que convertir a arraylist
	List<String> lista1=new ArrayList<String>();
	for (int i = 0; i < array.length; i++) {
		lista1.add(array[i]);
	}
	System.out.println(lista1);
	//Existe un metodo que convierte los array en List
	List<String> lista2=Arrays.asList(array);
	System.out.println(lista2);
	}

}
