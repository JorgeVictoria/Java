package operadores;
/**
 * 
 */

/**
 * @author jorge
 *
 */
public class Aritmeticos {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		int numA = (int)(Math.random() * 11);
		int numB = (int)(Math.random() * 11);
		
		System.out.println("numA = " + numA);
		System.out.println("numB = " + numB);
		
		System.out.println("---------------");
		System.out.println("Suma");
		System.out.printf("%d + %d = %d \n", numA, numB, numA+numB);
		System.out.println("-------------");
		System.out.println("Resta");
		System.out.printf("%d - %d = %d \n", numA, numB, numA-numB);
		System.out.println("---------------");
		System.out.println("Producto");
		System.out.printf("%d x %d = %d \n", numA, numB, numA*numB);
		System.out.println("---------------");
		System.out.println("Division Entera");
		System.out.printf("%d : %d = %d \n", numA, numB, numA/numB);
		System.out.println("---------------");
		System.out.println("Division Real");
		System.out.printf("%d : %d = %.2f \n", numA, numB, (float)numA/numB);
		System.out.println("---------------");
		System.out.println("Resto division");
		System.out.printf("%d %s %d = %d \n", numA, "%", numB, numA%numB);

	}

}
