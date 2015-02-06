package Ejercicios;

public class ClaveSegura {
	private String clave;
	
	public ClaveSegura(String clave) {
		this.clave = clave;
	}
	
	public  boolean minlongitudocho(){
		return clave.length()>7;
	}
	public  boolean unaMayus(){
		boolean aux=false;
		for (int i = 0; i < clave.length(); i++) {
			if (Character.isUpperCase(clave.charAt(i))){
				aux=true;
				break;
			}
		}
		return aux;
	}
	public boolean unaMinus(){
		boolean aux=false;
		for (int i = 0; i < clave.length(); i++) {
			if (Character.isLowerCase(clave.charAt(i))){
				aux=true;
				break;
			}
		}
		return aux;
	}
	public boolean unDigito(){
		boolean aux=false;
		for (int i = 0; i < clave.length(); i++) {
			if (Character.isDigit(clave.charAt(i))){
				aux=true;
				break;
			}
		}
		return aux;
	}	
	public boolean tieneSignos(){
		boolean aux=false;
		for (int i = 0; i < clave.length(); i++) {
			if (!Character.isLetterOrDigit(clave.charAt(i))){
				aux=true;
				break;
			}
		}
		return aux;
	}
}
