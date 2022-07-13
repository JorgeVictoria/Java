package operadores;

public class Incremento_Decremento {

	public static void main(String[] args) {
		
		//declaramos variables
		int numA = 5, numB = 7, numC = 0;
		
		//imprimimos los numeros
		System.out.println("Valores iniciales");
		System.out.println("numA = " + numA);
		System.out.println("numB = " + numB);
		System.out.println("numC = " + numC);
		System.out.println();
		
		//PreIncremento
		numC = ++numA + numB;
		
		//imprimimos los numeros
		System.out.println("Valores preIncremento");
		System.out.println("numA = " + numA);
		System.out.println("numB = " + numB);
		System.out.println("numC = " + numC);
		System.out.println();
		
		//PostIncremento
		numC = numA + numB++;
		
		//imprimimos los numeros
		System.out.println("Valores postIncremento");
		System.out.println("numA = " + numA);
		System.out.println("numB = " + numB);
		System.out.println("numC = " + numC);
		System.out.println();
		
		//PreDecremento
		numC = --numA + numB;
		
		//imprimimos los numeros
		System.out.println("Valores preDecremento");
		System.out.println("numA = " + numA);
		System.out.println("numB = " + numB);
		System.out.println("numC = " + numC);
		System.out.println();
		
		//PostDecremento
		numC = numA + numB--;
		
		//imprimimos los numeros
		System.out.println("Valores postDecremento");
		System.out.println("numA = " + numA);
		System.out.println("numB = " + numB);
		System.out.println("numC = " + numC);
		System.out.println();
		
		

	}

}
