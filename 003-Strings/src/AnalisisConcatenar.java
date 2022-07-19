public class AnalisisConcatenar {

    public static void main(String[] args) {

        String a = "a";
        String b = "b";
        String c = a;

        //test rendimiento con concat
        long inicio = System.currentTimeMillis();
        for(int i = 0; i < 500000; i++ ){
            c=c.concat(a).concat(b).concat("\n");
        }
        long fin = System.currentTimeMillis();
        System.out.println("concat: " + (fin - inicio) + "ms.");

        //test rendimiento con concatenacion +
        inicio = System.currentTimeMillis();
        for(int i = 0; i < 500000; i++ ){
            c += a + b + "\n";
        }
        fin = System.currentTimeMillis();
        System.out.println("signo+ :" + (fin - inicio) + "ms.");

        //test con StringBuilder. Es mutable
        StringBuilder sb = new StringBuilder(a);
        inicio = System.currentTimeMillis();
        for(int i = 0; i < 500000; i++ ){
            sb.append(a);
            sb.append(b);
            sb.append("\n");
        }
        fin = System.currentTimeMillis();
        System.out.println("StrinBuilder :" + (fin - inicio) + "ms.");
    }
}
