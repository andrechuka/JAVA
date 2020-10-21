import java.util.Scanner;
public class uri1037{
public static void main(String abc[]){
    Scanner teclado = new Scanner(System.in);



    double valores;

    valores = teclado.nextDouble();

    if ((valores >= 0) && (valores <= 25)){
        System.out.println("Intervalo [0,25]");
        }
        else if ((valores > 25) && (valores <= 50)){
        System.out.println("Intervalo (25,50]");
        }
        else if ((valores > 50) && (valores <= 75)){
        System.out.println("Intervalo (50,75]");
        }
        else if ((valores > 75) && (valores <= 100)){
        System.out.println("Intervalo (75,100]");
        }
        else {
            System.out.println("Fora de intervalo");
        }

}

}