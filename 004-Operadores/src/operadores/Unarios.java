package operadores;
/**
 * 
 */

/**
 * @author jorge
 *
 */
public class Unarios {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		int numA = 8;
		System.out.println("numA = " + numA);
		
		//cambio de signo
		numA = -numA;
		System.out.println("numA = " + numA);
		
		numA = -numA;
		System.out.println("numA = " + numA);
		
		numA = -numA;
		System.out.println("numA = " + numA);
		
		//como es negativo, no cambia de signo
		numA = +numA;
		System.out.println("numA = " + numA);

	}

}
