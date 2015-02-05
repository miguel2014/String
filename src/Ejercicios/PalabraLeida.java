package Ejercicios;

public class PalabraLeida {
	private String valor;
	

	public PalabraLeida(String valor) {
		this.valor = valor;
	}


	public String getValor() {
		return valor;
	}


	public void setValor(String valor) {
		this.valor = valor;
	}

	public int NumeroDeLetras(){
		return valor.length(); 
	}
	public boolean EmpiezaPorVocal(){
		boolean comprobar=false;
		valor=valor.toLowerCase();
		if ((valor.startsWith("a")) || (valor.startsWith("e"))|| (valor.startsWith("i"))
				|| (valor.startsWith("o")) || (valor.startsWith("u"))) {
		comprobar=true;	
		}
		return comprobar;	
	}
	  public boolean EmpiezaPorVocal2(){
	  return valor.toLowerCase().matches("[aeiou].*");
	  }
	  
	  
	public boolean AcabaEnVocal(){
		boolean comprobar=false;
		valor=valor.toLowerCase();
		if ((valor.endsWith("a")) || (valor.endsWith("e"))|| (valor.endsWith("i"))
				|| (valor.endsWith("o")) || (valor.endsWith("u"))) {
		comprobar=true;	
		}
		return comprobar;	
	}
	public boolean AcabaEnVocal2(){
		  return valor.toLowerCase().matches(".*[aeiou]");
		  }
	
	public int NumerodeVocales(){
		String prueba=valor.toLowerCase();
		int contador=0;	
		for (int i = 0; i < prueba.length(); i++) {
			if (Character.toString(prueba.charAt(i)).matches("[aeiou]"))
				contador++;
		}
		
		return contador;
	}
	public boolean ContieneH(){
		valor=valor.toLowerCase();
		boolean comprobar=false;
			if (valor.contains("h")) {
				comprobar=true;
			}
		return comprobar;
	}
	public boolean ContieneH2(){
		return valor.toLowerCase().matches(".*[h].*");
	}
	public boolean esunPalindromo(){
		//Creamos un StringBuilder y otro al reves
		StringBuilder sbuilder=new StringBuilder(valor);
		StringBuilder sbuilderalreves=sbuilder.reverse();
		//Lo convertimos a un string para posteriormente llamar al metodo equals
		String reverso=sbuilderalreves.toString();
		//devolvemos la comparacion de los dos strings
		return this.valor.equalsIgnoreCase(reverso);
	}
	public boolean SonIguales(String palabra){
		return this.valor.equalsIgnoreCase(palabra);
	}
/*
	public static void main(String[] args) {
		PalabraLeida p1=new PalabraLeida("eseHl");
		System.out.println("Numero letras "+p1.NumeroDeLetras());
		System.out.println("Acaba en vocal? "+p1.AcabaEnVocal());
		System.out.println("Acaba en vocal 2? "+p1.AcabaEnVocal2());
		System.out.println("Empieza en vocal? "+p1.EmpiezaPorVocal());
		System.out.println("Empieza en vocal 2? "+p1.EmpiezaPorVocal2());
		System.out.println("Numero vocales "+p1.NumerodeVocales());
		System.out.println("Contiene H? "+p1.ContieneH());
		System.out.println("Contiene H 2?  "+p1.ContieneH2());
		System.out.println("Es un palindromo ? "+ p1.esunPalindromo() );
		System.out.println("Es igual a palabra ? "+ p1.SonIguales("palabra") );
		
	}
	*/
}
