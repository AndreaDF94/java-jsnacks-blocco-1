// Snack5.java
// L'utente inserisce 6 numeri. Il programma stampa solo quelli dispari.

import java.util.Scanner;

public class Snack5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        for (int i = 1; i <= 6; i++) {
            System.out.print("Inserisci il numero " + i + ": ");
            int numero = scanner.nextInt();

            if (numero % 2 != 0) {
                System.out.println("Numero dispari: " + numero);
            }
        }

        scanner.close();
    }
}
