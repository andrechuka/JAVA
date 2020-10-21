
import java.util.Scanner;
public class uri1066{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        int numero;
        int pares=0;
        int impares=0;
        int qtdpositivos=0;
        int qtdnegativos=0;

        for (int cont=1; cont <= 5 ; cont++){ 
            numero = teclado.nextInt(); 
            if (numero % 2 == 0){              
                pares++;
            }
            else {
                impares++;
            }
            if (numero > 0){
                qtdpositivos++;
            }
            else if(numero < 0) {
                qtdnegativos++;
            }  
        }
    

        System.out.println(pares+" valor(es) par(es)");
        System.out.println(impares+" valor(es) impar(es)");
        System.out.println(qtdpositivos+" valor(es) positivo(s)");
        System.out.println(qtdnegativos+" valor(es) negativo(s)");
    

    }   
}