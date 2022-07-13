/**
 * 
 */
package tipoDatos;

/**
 * @author jorge
 *
 */
public class Booleanos {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		boolean verdadero = true;
		boolean falso = false;
		
		//ejemplo de uso
		boolean esMayorDeEdad;
		int edad = (int)(Math.random() * 100);
		
		System.out.println("Edad: " + edad);
		if(edad >= 18) esMayorDeEdad = true;
		else esMayorDeEdad = false;
		
		System.out.println("esMayorDeEdad : " + esMayorDeEdad);

	}

}
