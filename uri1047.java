import java.util.Scanner;
public class uri1047{
    public static void main(String abc[]){
        Scanner teclado = new Scanner(System.in);


        int hi,mi,hf,mf,totali,totalf,dur,durh,durm;

        hi = teclado.nextInt();
        mi = teclado.nextInt();
        hf = teclado.nextInt();
        mf = teclado.nextInt();

        totali = hi * 60 + mi;
        totalf = hf * 60 + mf;

        dur = totalf - totali;

        if (dur <= 0){
            dur = dur + 24 * 60;
        }

        durh = dur / 60;
        durm = dur % 60;

        System.out.println("O JOGO DUROU "+durh+" HORA(S) E "+durm+" MINUTO(S)");

        }

    }

