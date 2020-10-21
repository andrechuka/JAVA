import java.util.Scanner;
public class uri1067{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        int x = teclado.nextInt();
        

        for (int impares = 1; impares <= x; impares+=2){
        System.out.println(impares);            
        }
    }
}