public class ObjetoString {

    public static void main(String[] args) {
        
        //aunque se puede crear como un primitivo, es un objeto. Tipo especial
        String curso = "Programacion Java";
        
        //se puede crear mediante instancia
        String otroCurso = new String("Programacion Java");
        
        //son dos objetos distintos
        boolean sonIguales = curso == otroCurso;
        System.out.println("sonIguales = " + sonIguales);
        
        //ambos objetos pueden tener el mismo contenido
        boolean mismoContenido = curso.equals(otroCurso);
        System.out.println("mismoContenido = " + mismoContenido);

        //como ya tenemos una misma instancia con el mismo texto, ambas variables apuntan a la misma referencia
        String tercerCurso = "Programacion Java";
        sonIguales = curso == tercerCurso;
        System.out.println("sonIguales = " + sonIguales);
        //si lo comparamos con la instancia (segundo objeto) dará false porque son diferentes referencias
        sonIguales = otroCurso == tercerCurso;
        System.out.println("sonIguales = " + sonIguales);
    }
}
