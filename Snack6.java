// Snack6.java
// L'utente inserisce un numero N e il programma stampa il cubo di ogni numero da 1 a N.

import java.util.Scanner;

public class Snack6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Inserisci un numero intero N: ");
        int n = scanner.nextInt();

        for (int i = 1; i <= n; i++) {
            int cubo = i * i * i; // Calcolo del cubo
            System.out.println("Cubo di " + i + " = " + cubo);
        }

        scanner.close();
    }
}

