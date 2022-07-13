/**
 * 
 */
package operadores;

/**
 * @author jorge
 *
 */
public class Abreviada {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		int numA = (int)(Math.random() * 11);
		int numB = (int)(Math.random() * 11);
		
		System.out.println("numA = " + numA);
		System.out.println("numB = " + numB);
		
		System.out.println("---------------");
		
		//Asignacion abreviada. Es lo mismo que numA = numA + numB
		numA += numB;
		System.out.println("numA = " + numA);
		numA -= numB;
		System.out.println("numA = " + numA);
		numA *= numB;
		System.out.println("numA = " + numA);
		numA /= numB;
		System.out.println("numA = " + numA);
		numA %= numB;
		System.out.println("numA = " + numA);

	}

}
