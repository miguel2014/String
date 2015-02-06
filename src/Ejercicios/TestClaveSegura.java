package Ejercicios;


public class TestClaveSegura {
	 final static String caracteres = "!@~#%&/?¿^+-*aAbBcCdDeEfFgGhHiIjJkKlLmMnNñÑnNoOpPqQrRsStTuUvVwWxXyYzZ0123456789";	
	public static void main(String[] args) {
		//Creamos un bucle infinito hasta que sea segura si es se sale e imprime
		while (true) {

		int longitudClave=aleatorio();
		//int longitudClave=10;
		
	//Vamos a generar de forma aleatoria la clave 
	 //usamos un bucle y repetimos la accion hasta longitud clave
	StringBuilder sBuilder=new StringBuilder();

	
	for (int i = 0; i < longitudClave; i++) {
		int posicionCaracter=aleatorio();
		//Añado esa posicion al stringbuilder
		char caracterelegido=caracteres.charAt(posicionCaracter);
		sBuilder.append(caracterelegido);
	}
	//pasar el stringbuilder a string
		String puedeclave=sBuilder.toString();
		ClaveSegura c1=new ClaveSegura(puedeclave);
		boolean esSegura=c1.minlongitudocho() && c1.unaMayus() && c1.unaMinus() && c1.unDigito() 
				&& c1.tieneSignos();
		
		if (esSegura) {
			System.out.println(puedeclave);
			break;
		}
		
	}
	}
	public static int aleatorio(){
		return (int) (Math.random()*caracteres.length());
	}	
	
}
