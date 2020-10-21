
import java.util.Scanner;
public class uri1065{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        int numero;
        int pares=0;

        for (int cont=1; cont <= 5 ; cont++){ 
            numero = teclado.nextInt(); 
            if (numero % 2 == 0){              
                pares++;  
               
            }
        }

        System.out.println(pares+" valores pares");
    }
}