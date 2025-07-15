// Snack8.java
// L'utente inserisce un numero di 4 cifre e il programma calcola la somma delle sue cifre.

import java.util.Scanner;

public class Snack8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Inserisci un numero di 4 cifre: ");
        String numero = scanner.nextLine();

        int somma = 0;
        for (int i = 0; i < numero.length(); i++) {
            int cifra = Character.getNumericValue(numero.charAt(i));
            somma += cifra; // Somma delle cifre
        }

        System.out.println("Somma delle cifre: " + somma);
        scanner.close();
    }
}
