/**
 * 
 */
package repeticion;

/**
 * @author jvand
 *
 */
public class Bucle_Do_While {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		boolean esMultiplo = false;
		int numero;
		
		do {
			
			numero = (int)(Math.random() * 100);
			System.out.print(numero + " ");
			if(numero % 5 == 0) esMultiplo = true;
			
			
		} while (!esMultiplo);

	}

}
