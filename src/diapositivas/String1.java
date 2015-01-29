package diapositivas;

public class String1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String string1="Hola mundo";
		String string2="Hola mundo";
		String string3=new String("Hola mundo");
		String string4=new String(new char[]{'H','o','l','a',' ','m','u','n','d','o'});
		//Usamos el comparador ==
		//Comparamos las referencias (posiciones de memoria)
		System.out.println(string1==string2);//True
		System.out.println(string1==string3);//False
		System.out.println(string1==string4);//False
		System.out.println(string3==string4);//False
		//Usamos el metodo equals
		System.out.println(string1.equals(string2));//True
		System.out.println(string1.equals(string3));//True
		System.out.println(string1.equals(string4));///True
		System.out.println(string3.equals(string4));//True
		//usamos el metodo comparateto
		System.out.println(string1.compareTo(string2));//True
		System.out.println(string1.compareTo(string3));//True
		System.out.println(string1.compareTo(string4));///True
		System.out.println(string3.compareTo(string4));//True
		System.out.println(string1.compareToIgnoreCase(string2.toUpperCase()));
		System.out.println(string2);
		string2.toUpperCase();
		System.out.println(string2);
		System.out.println(string1.startsWith("H"));
		System.out.println(string1.startsWith("Hola"));
		System.out.println(string1.endsWith("mundo "));
		System.out.println(string1.endsWith("mundo ".trim()));
		//Comprobamos metodos length,concat,charat
		System.out.println(string1.length());
		System.out.println(string1.concat(" ".concat(string4)));
		System.out.println(string1+" "+string4);
		//Bucle que pone un espacio por cada letra
		for (int i = 0; i < string1.length(); i++) {
			System.out.print(string1.charAt(i) + " ");
		}
		//Bucle que lee el string al reves
		System.out.println();
		for (int i = string1.length()-1; i >=0; i--) {
			System.out.print(string1.charAt(i) + " ");
		}
		System.out.println();
		//Bucle que crea un nuevo substring
		for (int i = 0; i < string1.length(); i++) {
			if (string1.charAt(i)==' ') {
				System.out.println(string1.substring(i+1));
			}
		}
		//Probando los replace
		System.out.println();
		System.out.println(string1.replace("o", "a"));
		System.out.println(string1);//Metodo no mutante
		System.out.println(string1.replace("Hola", "aloH"));
		System.out.println(string1.replaceAll("[aeiou]","*,"));//Reemplzamamos vocales por *,
		System.out.println(string1.replaceFirst("[aeiou]","*,"));
		
		//probando split por espacios en blanco y luego por vocales
		String[] array=string1.split(" ");
		for (int i = 0; i < array.length; i++) {
			System.out.println(i+") "+array[i]);
		}
		String[] array2=string1.split("[aeiou]");
		for (int i = 0; i < array2.length; i++) {
			System.out.println(i+") "+array2[i]);
		}
		
	}
}
