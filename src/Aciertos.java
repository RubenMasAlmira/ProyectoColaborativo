import java.util.Scanner;

public class Aciertos {
//Se genera el n�mero aleatorio
    public static void main(String[] args) {
        int n = 0,cont = 0;
        int x = (int) (500 *Math.random());
        //System.out.print(x);
        Scanner sc = new Scanner(System.in);
        do {
        	//Se introduce el n�mero
            System.out.print("\nIntroduce el valor de X: ");
            n = sc.nextInt();
            if (n > x) {
            	//El n�mero introducido es mayor
                System.out.print("Te pasaste Amigo");
            } else if (n < x){
            	//El n�mero introducido es menor
                System.out.print("Casi cerca ...");
            }
            cont++;
        } while (n != x);
        System.out.print("Exelente!!! Haz acertado , No. de intentos: "+cont );
        sc.close();
    }
}
