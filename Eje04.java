/*Ejercicio 4
Realiza un conversor de euros a pesetas. La cantidad en euros que se quiere
convertir deberá estar almacenada en una variable.
*/

import java.util.Scanner;
public class Eje04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float euros;

        System.out.print("Euros a convertir: ");
        euros = sc.nextFloat();

        System.out.println(euros + " euros son " + euros*166+ " en pesetas");
        sc.close();
    }
}
