/*Ejercicio 5
Realiza un conversor de pesetas a euros. La cantidad en pesetas que se quiere
convertir deberá estar almacenada en una variable. 
*/

import java.util.Scanner;
public class Eje05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float pesetas;

        System.out.print("Pesetas a convertir: ");
        pesetas = sc.nextFloat();

        System.out.println(pesetas + " pesetas son " + (pesetas*0.006 ) + " en euros");
        sc.close();
    }
}
