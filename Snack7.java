// Snack7.java
// Il programma stampa le potenze di 2 da 2 fino a 1000.

public class Snack7 {
    public static void main(String[] args) {
        int potenza = 2;

        while (potenza <= 1000) {
            System.out.println(potenza);
            potenza *= 2; // Ogni volta moltiplica per 2
        }
    }
}

