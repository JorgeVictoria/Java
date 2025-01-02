package string;

public class TestRendimientoConcat {

    public static void main(String[] args) {

        String a = "a";
        String b = "b";
        String c = a;
        String d = a;
        StringBuilder sb = new StringBuilder(a);
        long inicio;
        long fin;
        long total;

        //test con método concat
        inicio = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++){
            c=c.concat(a).concat(b).concat("\n");
        }
        fin = System.currentTimeMillis();
        total = fin - inicio;
        System.out.println("total = " + total);

        //test con concatenación
        inicio = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++){
            d+=a+b+"\n";
        }
        fin = System.currentTimeMillis();
        total = fin - inicio;
        System.out.println("total = " + total);

        //test con Stringbuilder. Este tipo de objetos son mutables
        inicio = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++){
            sb.append(a).append(b).append("\n");
        }
        fin = System.currentTimeMillis();
        total = fin - inicio;
        System.out.println("total = " + total);

    }
}
