// Snack1.java
// L'utente inserisce due numeri. Il programma stampa il maggiore.

import java.util.Scanner;

public class Snack1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Scanner per input da tastiera

        System.out.print("Inserisci il primo numero: ");
        int num1 = scanner.nextInt(); // Lettura primo numero

        System.out.print("Inserisci il secondo numero: ");
        int num2 = scanner.nextInt(); // Lettura secondo numero

        // Confronto tra i due numeri
        if (num1 > num2) {
            System.out.println("Il numero maggiore è: " + num1);
        } else if (num2 > num1) {
            System.out.println("Il numero maggiore è: " + num2);
        } else {
            System.out.println("I numeri sono uguali.");
        }

        scanner.close(); // Chiusura dello scanner
    }
}
