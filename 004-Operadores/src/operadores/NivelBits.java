/**
 * 
 */
package operadores;

/**
 * @author jorge
 *
 */
public class NivelBits {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		//variables locales
		int numA = (int)(Math.random() * 100);
		int numB = (int)(Math.random() * 100);
		
		//vemos por pantalla los valores iniciales
		System.out.println("Valores iniciales");
		System.out.println("numA = " + numA);
		System.out.println("numB = " + numB);
		System.out.println();
		
		//Valores en binario
		System.out.println("Valores en binario");
		System.out.println("numA = " + Integer.toBinaryString(numA));
		System.out.println("numB = " + Integer.toBinaryString(numB));
		System.out.println();
		
		//operador AND
		System.out.println("OPERADOR AND");
		System.out.println("decimal = " + (numA&numB));
		System.out.println("binario = " + Integer.toBinaryString(numA&numB));
		System.out.println();
		
		//operador OR exclusivo, solo 1 y 0
		System.out.println("OPERADOR OR exclusivo");
		System.out.println("decimal = " + (numA^numB));
		System.out.println("binario = " + Integer.toBinaryString(numA&numB));
		System.out.println();
		
		//operador OR exclusivo, incluye los 1 y 1
		System.out.println("OPERADOR OR inclusivo");
		System.out.println("decimal = " + (numA|numB));
		System.out.println("binario = " + Integer.toBinaryString(numA|numB));
		System.out.println();
		
		//cambio de numeros
		System.out.println("Cambio de numeros");
		System.out.println("numA = " + ~numA);
		System.out.println("binario = " + Integer.toBinaryString(~numA));
		System.out.println("numB = " + ~numB);
		System.out.println("binario = " + Integer.toBinaryString(~numB));
		System.out.println();
		
		//desplazamiento hacia la izquierda
		System.out.println("Desplazamiento hacia la izda");
		System.out.println("numA = " + (numA<<2));
		System.out.println("binario = " + Integer.toBinaryString(numA<<2));
		System.out.println("numB = " + (numB<<2));
		System.out.println("binario = " + Integer.toBinaryString(numB<<2));
		System.out.println();
		
		//desplazamiento hacia la derecha
		System.out.println("Desplazamiento hacia la izda");
		System.out.println("numA = " + (numA<<2));
		System.out.println("binario = " + Integer.toBinaryString(numA<<2));
		System.out.println("numB = " + (numB<<2));
		System.out.println("binario = " + Integer.toBinaryString(numB<<2));
		System.out.println();
		
		
		

	}

}
