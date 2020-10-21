import java.util.Scanner;
public class Hello {
    public static void main (String abc[]){
        Scanner teclado = new Scanner (System.in);
        int a, b, soma;
        a = teclado.nextInt();
        b = teclado.nextInt();
        soma = a + b;
        System.out.println("SOMA = " + soma);
    }
}