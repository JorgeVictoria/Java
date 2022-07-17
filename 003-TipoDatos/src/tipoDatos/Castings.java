/**
 * 
 */
package tipoDatos;

/**
 * @author jvand
 *
 */
public class Castings {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		//String a integer
		Integer a = Integer.valueOf("900");
		// o
		int b = Integer.parseInt("900");
		
		//Integer a String
		String importe = Integer.toString(900);
		// o
		int entero = 900;
		String mensaje = String.valueOf(entero);
		
		//char a String
		char codigo = 'A';
		String cadena = Character.toString(codigo);
		
		//String a char
		String codigoA= "H2O";
		char caracter = codigoA.charAt(0);
		
		//String a double
		double doble = Double.parseDouble("900.1");
		
		//Double a String
		double totalDoble = 900.5;
		String totalString = String.valueOf(totalDoble);
		
		//String a float
		float importeA = Float.parseFloat("900.5");
		
		//float a String
		String total = Float.toString(importeA);
		
		//String a Boolean
		Boolean booleanA = Boolean.valueOf("true");
		// o
		boolean booleanB = Boolean.parseBoolean("false");
		
		//Boolean a String
		boolean verdadero = true;
		String cadenaA = String.valueOf(verdadero);
		// o
		boolean falso = false;
		String cadenaB = Boolean.toString(falso);
		
		//para valores numericos, tienen que ser compatibles sino habrá inconsistencia de valores
		int numA = 1000000;
		short corto = (short)numA;
		System.out.println(corto);
		
		corto = 10000;
		numA = (int)corto;
		System.out.println(corto);		

	}

}
