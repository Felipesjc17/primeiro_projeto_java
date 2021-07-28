import java.util.Arrays;

public class AulaJavaBasico {

    public static void main(String[] args) {
    String java = "Aula, de Java";
    String abcd = "A B C D E F G";

        char[] pegandoAbcd = abcd.toCharArray();
        for (char pegandoA: pegandoAbcd) {

            System.out.println(pegandoA);
        }

        String[] pegandoJava = java.split(", ");
        for (String pegandoJ: pegandoJava) {
            System.out.println(pegandoJ);
        }
        System.out.println("Aula".concat(" de Java"));
        System.out.println("1234 asda qw".replaceAll("[0-3]", "#"));
    }

}
