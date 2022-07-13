/**
 * 
 */
package tipoDatos;

/**
 * @author jorge
 *
 */
public class Literales {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		//tipos de datos primitivos
		boolean esMayor = true;
		char caracter = 'J';
		byte by = 100;
		short sh = 1000;
		int in = 100000;
		long lo = 1000000000000000000L;
		float flo = 3.1416f;
		double dou = 3.1416;
		
		//division en bloques para numeros largos
		long tarjetaCredito = 1234_5678_9012_3456L;
		System.out.println("Tarjeta de credito : " +  tarjetaCredito);
		
		//representacion de numeros segun base
		int decimal = 26;
		int binario = 0b11010;
		int octal = 032;
		int hexadecimal = 0x1a;
		
		//tambien se pueden usar los wrappers para obtener un valor en funcion de la base
		System.out.println("decimal : " + decimal);
		System.out.println("binario : " + Integer.toBinaryString(decimal));
		System.out.println("octal : " + Integer.toOctalString(decimal));
		System.out.println("hexadecimal : " + Integer.toHexString(decimal));
		
		//notacion cientifica
		double cientifico = 0.345e3;
		System.out.println("cientifico : " + cientifico);
		cientifico = 0.345e2;
		System.out.println("cientifico : " + cientifico);
		cientifico = 0.345e-1;
		System.out.println("cientifico : " + cientifico);
		

	}

}
