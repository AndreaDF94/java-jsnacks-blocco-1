// Snack4.java
// Verifica se un nome è presente nella lista degli invitati.

import java.util.Scanner;

public class Snack4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] invitati = {"Andrea", "Giulia", "Luca", "Martina", "Francesco"};

        System.out.print("Inserisci il tuo nome: ");
        String nome = scanner.nextLine();

        boolean trovato = false;

        for (String invitato : invitati) {
            if (invitato.equalsIgnoreCase(nome)) {
                trovato = true;
                break;
            }
        }

        if (trovato) {
            System.out.println("Puoi partecipare alla festa!");
        } else {
            System.out.println("Mi dispiace, non sei nella lista.");
        }

        scanner.close();
    }
}
