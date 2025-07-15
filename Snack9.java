// Snack9.java
// Calcola la somma e la media dei numeri da 1 a 10.

public class Snack9 {
    public static void main(String[] args) {
        int somma = 0;

        for (int i = 1; i <= 10; i++) {
            somma += i;
        }

        double media = somma / 10.0;

        System.out.println("Somma: " + somma);
        System.out.println("Media: " + media);
    }
}

