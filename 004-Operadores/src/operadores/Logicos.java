/**
 * 
 */
package operadores;

/**
 * @author jvand
 *
 */
public class Logicos {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		int matematicas = (int)(Math.random() * 11);
		int lenguaje = (int)(Math.random() * 11);
		int media = (matematicas+lenguaje)/2;
		boolean aprobado;
		
		System.out.println("Matematicas : " + matematicas);
		System.out.println("Lenguaje : " + lenguaje);
		System.out.println("Media : " + media);
		
		
		//operador AND
		if(matematicas >= 5 && lenguaje >= 5) System.out.println("Ha aprobado las dos asignaturas");
		//operador OR
		else if(matematicas >= 5 || lenguaje >= 5) System.out.println("Ha aprobado una asignatura");
		//por defecto
		else System.out.println("No ha aprobado ninguna asignatura");
		
		//operador ternario
		aprobado = (media >= 5)? true : false;
		
		//Negacion
		if(!aprobado) System.out.println("Ha suspendido el curso");
		else System.out.println("Ha aprobado el curso");
		
		//operadores logico relacionales (==,!=,>,<,>=,<=)
		

	}

}
