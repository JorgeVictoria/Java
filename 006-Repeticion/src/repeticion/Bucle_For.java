/**
 * 
 */
package repeticion;

/**
 * @author jvand
 *
 */
public class Bucle_For {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		//incremento
		for(int i = 0; i <= 10; i++) {
			System.out.print(i + " ");
		}
		
		System.out.println();
		
		//decremento
		for(int i = 10; i >= 0; i--) {
			System.out.print(i + " ");
		}
		
		System.out.println();
		
		//uso de break
		for(int i = 0; i <= 20; i++) {
			System.out.print(i + " ");
			if(i != 0 && i % 3 == 0) break;
		}
		
		System.out.println();
		
		//uso de continue
		for(int i = 0; i <= 20; i++) {
			if(i % 3 == 0) continue;
			System.out.print(i + " ");
		}
		
		System.out.println();

	}

}
