/**
 * 
 */
package envoltorio;

/**
 * @author jorge
 *
 */
public class Numericos {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		//tipo byte
		System.out.println("------------------");
		System.out.println("Byte");
		System.out.println("------------------");
		System.out.println("Valor minimo : " + Byte.MIN_VALUE);
		System.out.println("Valor maximo : " + Byte.MAX_VALUE);
		System.out.println("Numero bytes : " + Byte.BYTES);
		System.out.println("Numero bits : " + Byte.SIZE);
		
		//tipo short
		System.out.println("------------------");
		System.out.println("short");
		System.out.println("------------------");
		System.out.println("Valor minimo : " + Short.MIN_VALUE);
		System.out.println("Valor maximo : " + Short.MAX_VALUE);
		System.out.println("Numero bytes : " + Short.BYTES);
		System.out.println("Numero bits : " + Short.SIZE);
		
		//tipo int
		System.out.println("------------------");
		System.out.println("int");
		System.out.println("------------------");
		System.out.println("Valor minimo : " + Integer.MIN_VALUE);
		System.out.println("Valor maximo : " + Integer.MAX_VALUE);
		System.out.println("Numero bytes : " + Integer.BYTES);
		System.out.println("Numero bits : " + Integer.SIZE);
		
		//tipo long
		System.out.println("------------------");
		System.out.println("long");
		System.out.println("------------------");
		System.out.println("Valor minimo : " + Long.MIN_VALUE);
		System.out.println("Valor maximo : " + Long.MAX_VALUE);
		System.out.println("Numero bytes : " + Long.BYTES);
		System.out.println("Numero bits : " + Long.SIZE);
		
		//tipo float
		System.out.println("------------------");
		System.out.println("float");
		System.out.println("------------------");
		System.out.println("Valor minimo : " + Float.MIN_VALUE);
		System.out.println("Valor maximo : " + Float.MAX_VALUE);
		System.out.println("Numero bytes : " + Float.BYTES);
		System.out.println("Numero bits : " + Float.SIZE);
		
		//tipo double
		System.out.println("------------------");
		System.out.println("double");
		System.out.println("------------------");
		System.out.println("Valor minimo : " + Double.MIN_VALUE);
		System.out.println("Valor maximo : " + Double.MAX_VALUE);
		System.out.println("Numero bytes : " + Double.BYTES);
		System.out.println("Numero bits : " + Double.SIZE);
		
		//tipo char
		System.out.println("------------------");
		System.out.println("char");
		System.out.println("------------------");
		System.out.println("Valor minimo : " + Character.MIN_VALUE);
		System.out.println("Valor maximo : " + Character.MAX_VALUE);
		System.out.println("Numero bytes : " + Character.BYTES);
		System.out.println("Numero bits : " + Character.SIZE);
		
		//algunos metodos
		
		
		//parseo de valores
		int x = Integer.valueOf("12345");
		System.out.println(x);
		
		//valor maximo o minimo
		System.out.println(Integer.max(x, 10000));
		System.out.println(Integer.min(x, 10000));
		
		//obtener instancias
		long l = Long.valueOf(1234567890);
		System.out.println(l);
		
		//si un caracter es letra o numero
		char c = 'c';
		System.out.println(Character.isAlphabetic(c));
		System.out.println(Character.isDigit(c));
		

	}

}
