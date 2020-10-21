import java.util.Scanner;
public class uri1038{
    public static void main(String abc[]){
        Scanner teclado = new Scanner(System.in);

        int codigo, quantidade;
        float total = 0;

        codigo = teclado.nextInt();
        quantidade = teclado.nextInt();

        if (codigo == 1){
            total = quantidade * 4.0f;
        }
        else if (codigo == 2){
            total = quantidade * 4.50f;
            }
        else if (codigo == 3){
            total = quantidade * 5.0f;
            }
        else if (codigo == 4){
            total = quantidade * 2.0f;
            }
        else if (codigo == 5){
            total = quantidade * 1.50f;
            }
        
        System.out.println("Total:" + total);
    }
}