package Ejercicios;

public class ClaveSegura {
	public static boolean requisitos(String s){
		return (minlongitudocho(s) && unaMayus(s) && unaMinus(s) && unDigito(s) && tieneSignos(s)) ;		
		//Comprobar si tiene 1 mayuscula,minuscula,numeros y signos y minimo 8 letras
	}
	private static boolean minlongitudocho(String s){
		return s.length()>7;
	}
	private static boolean unaMayus(String s){
		boolean aux=false;
		for (int i = 0; i < s.length(); i++) {
			if (Character.isUpperCase(s.charAt(i))){
				aux=true;
				break;
			}
		}
		return aux;
	}
	private static boolean unaMinus(String s){
		boolean aux=false;
		for (int i = 0; i < s.length(); i++) {
			if (Character.isLowerCase(s.charAt(i))){
				aux=true;
				break;
			}
		}
		return aux;
	}
	private static boolean unDigito(String s){
		boolean aux=false;
		for (int i = 0; i < s.length(); i++) {
			if (Character.isDigit(s.charAt(i))){
				aux=true;
				break;
			}
		}
		return aux;
	}	
	private static boolean tieneSignos(String s){
		boolean aux=false;
		for (int i = 0; i < s.length(); i++) {
			if (!Character.isLetterOrDigit(s.charAt(i))){
				aux=true;
				break;
			}
		}
		return aux;
	}		
	/*
	 * Para pruebas
	 * public static void main(String[] args) {
		System.out.println(requisitos("HolaHolad%dddd1"));
		
	}*/
}
