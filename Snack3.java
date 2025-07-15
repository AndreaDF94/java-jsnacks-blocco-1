// Snack3.java
// Il programma chiede 10 numeri all'utente e stampa la loro somma.

import java.util.Scanner;

public class Snack3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int somma = 0; // Inizializzazione somma

        for (int i = 1; i <= 10; i++) {
            System.out.print("Inserisci il numero " + i + ": ");
            int numero = scanner.nextInt(); // Lettura numero
            somma += numero; // Aggiunta alla somma
        }

        System.out.println("La somma dei numeri inseriti è: " + somma);
        scanner.close();
    }
}
