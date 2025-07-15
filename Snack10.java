// Snack10.java
// Stampa una piramide centrata con 5 righe (alberello di Natale).

public class Snack10 {
    public static void main(String[] args) {
        int n = 5;

        for (int i = 1; i <= n; i++) {
            // Spazi a sinistra
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }

            // Asterischi
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*");
            }

            System.out.println(); // A capo
        }
    }
}
