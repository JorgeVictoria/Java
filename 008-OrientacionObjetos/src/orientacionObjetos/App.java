package orientacionObjetos;

public class App {

	public static void main(String[] args) {
		
		//variables locales
		Empleado emp1 = null;
		
		//Null, ausencia de informacion. Declaramos la referencia del objeto, pero no tenemos informacion
		if(emp1 == null) System.out.println("Nulo");
		
		//creamos la instancia del objeto
		emp1 = new Empleado();
		
		//ahora ya no es null
		if(emp1 != null) System.out.println("No es Nulo");
		
		//ya podemos usar los metodos
		emp1.saludar();
		
		//creamos nuevos empleados
		Empleado emp2 = new Empleado();									//constructor vacio
		Empleado emp3 = new Empleado("Jorge", "Victoria", "Andreu");	//constructor parcial
		Empleado emp4 = new Empleado("Jose","Garcia", "Perez", 45);		//constructor completo
		
		//podemos acceder a los getters
		emp2.setNombre("Pedro");
		emp2.setApe1("Perez");
		emp2.setApe2("Rodriguez");
		
		//podemos acceder a los setters
		System.out.println(emp3.getNombre() + " " + emp3.getApe1() + " " + emp3.getApe2());
		
		//podemos acceder a los metodos
		emp4.presentacion();
		
		//podemos usar el metodo toString
		System.out.println(emp1.toString());
		System.out.println(emp2.toString());
		System.out.println(emp3.toString());
		System.out.println(emp4.toString());
		
		

	}

}
