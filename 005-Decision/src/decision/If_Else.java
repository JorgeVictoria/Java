/**
 * 
 */
package decision;

/**
 * @author jvand
 *
 */
public class If_Else {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		int nota = (int)(Math.random() * 11);
		String calificacion;
		
		//if simple
		if(nota >= 5)System.out.println("Has aprobado");
		else System.out.println("Has suspendido");
		
		//if anidado
		if(nota < 5) calificacion = "Suspendido";
		else if(nota < 6) calificacion ="Suficiente";
		else if(nota < 7 ) calificacion = "Bien";
		else if(nota < 9) calificacion = "Notable";
		else calificacion = "Sobresaliente";
		
		System.out.println("Nota : " + nota);
		System.out.println("Calificacion : " + calificacion);
		
	}

}
