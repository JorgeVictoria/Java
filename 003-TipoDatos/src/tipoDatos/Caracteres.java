/**
 * 
 */
package tipoDatos;

/**
 * @author jorge
 *
 */
public class Caracteres {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		char caracter = 'C';
		System.out.println("caracter : " + caracter);
		
		//podemos usar valores enteros para coger letras de la tabla ascii
		caracter = (char) ((int)(Math.random() * 100) + 50);
		System.out.println("caracter : " + caracter);

	}

}
