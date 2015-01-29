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
		
	}

}
