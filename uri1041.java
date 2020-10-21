import java.util.Scanner;
public class uri1041{
    public static void main(String abc[]){
        Scanner teclado = new Scanner(System.in);

        double x,y;

        7 

        if ((x > 0) && (y < 0)){
            System.out.println("Q4");
        }
        else if ((x < 0) && (y < 0)){
            System.out.println("Q3");
        }
        else if ((x < 0) && (y > 0)){
            System.out.println("Q2"); 
        }
        else if ((x > 0) && (y < 0)){
            System.out.println("Q4");
        }
        else if ((x > 0) && (y > 0)){
            System.out.println("Q1");
        }
        else if ((x != 0) && (y == 0)){
            System.out.println("Eixo X");
        }
        else if ((x == 0) && (y != 0)){
            System.out.println("Eixo Y");
        }
        else if ((x == 0) && (y == 0)){
            System.out.println("Origem");
        }
    }
}