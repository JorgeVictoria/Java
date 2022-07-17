/**
 * 
 */
package decision;

/**
 * @author jvand
 *
 */
public class Switch_Case {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		int nota = (int)(Math.random() * 11);
		String calificacion;
		
		switch(nota) {
			
		 case 0 : calificacion = "Suspendido";
		 		  break;
		 case 1 : calificacion = "Suspendido";
		  		  break;
		 case 2 : calificacion = "Suspendido";
		  		  break;
		 case 3 : calificacion = "Suspendido";
 		  		  break;
		 case 4 : calificacion = "Suspendido";
		  		  break;
		 case 5 : calificacion = "Suficiente";
 		  		  break;
		 case 6 : calificacion = "Bien";
 		  		  break;
		 case 7 : calificacion = "Notable";
  		  		  break;
		 case 8:  calificacion = "Notable";
		  		  break;
		 case 9 : calificacion = "Sobresaliente";
 		  		  break;
		 case 10 : calificacion = "Sobresaliente";
 		  	       break;
		 default : calificacion = "Nota no valida";
  		  		   break;
		 
		}
		
		System.out.println("Nota : " + nota);
		System.out.println("Calificacion : " + calificacion);
		
		switch(nota) {
		
		 case 0 : 
		 case 1 : 
		 case 2 : 
		 case 3 : 
		 case 4 : calificacion = "Suspendido";
		  		  break;
		 case 5 : calificacion = "Suficiente";
		  		  break;
		 case 6 : calificacion = "Bien";
		  		  break;
		 case 7 : 
		 case 8:  calificacion = "Notable";
		  		  break;
		 case 9 : 
		 case 10 : calificacion = "Sobresaliente";
		  	       break;
		 default : calificacion = "Nota no valida";
 		  		   break;
		 
		}
		
		System.out.println("Calificacion : " + calificacion);

	}

}
