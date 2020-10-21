import java.util.Scanner;
public class uri1046{
    public static void main(String abc[]){
        Scanner teclado = new Scanner(System.in);


        int hi,hf,total;

        hi = teclado.nextInt();
        hf = teclado.nextInt();
    


        if (hi > hf ){
            total = hf - hi + 24;
            System.out.println("O JOGO DUROU " + total + " HORA (S)");
        }
            else if (hi < hf ){
            total = hf - hi;
            System.out.println("O JOGO DUROU " + total + " HORA (S)");
            }
            else if (hi == hf ){
            System.out.println("O JOGO DUROU 24 HORA (S)");

        }

    }
}

