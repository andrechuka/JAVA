import java.util.Scanner;
public class uri1115{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        int x;
        int y;


        do {
            x = teclado.nextInt();
            y = teclado.nextInt();
            if (x > 0 && y > 0){
                System.out.println("primeiro");
            }
            else if (x > 0 && y < 0){
                System.out.println("quarto");
            }
            else if (x < 0 && y < 0){
                System.out.println("terceiro");
            }
            else if (x < 0 && y > 0){
                System.out.println("segundo");
            }

            
            
        } while  (x != 0 && y != 0);
    } 
}   