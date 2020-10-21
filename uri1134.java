import java.util.Scanner;
public class uri1134{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        int combustivel,Alcool=0,Gasolina=0,Diesel=0;

        do {
            combustivel = teclado.nextInt();
            if (combustivel == 1){
                Alcool++;
            }
            else if (combustivel == 2){
                Gasolina++;
            }
            else if (combustivel == 3){
                Diesel++;
            }

          } 
          while  (combustivel != 4);

          System.out.println("MUITO OBRIGADO");
          System.out.println("Alcool: "+Alcool);
          System.out.println("Gasolina: "+Gasolina);
          System.out.println("Diesel: "+Diesel);
        
    
    }
}