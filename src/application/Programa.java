package application;

import java.util.Locale;
import java.util.Scanner;
import entities.Quarto;

public class Programa {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Quarto[] quartos = new Quarto[10];

        System.out.print("Quantos quartos serão alugados? ");
        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < n; i++) {
            System.out.println();
            System.out.println("Aluguel #" + (i + 1));

            System.out.print("Nome: ");
            String nome = sc.nextLine();

            System.out.print("Email: ");
            String email = sc.nextLine();

            System.out.print("Quarto: ");
            int numeroQuarto = sc.nextInt();
            sc.nextLine();

            if (quartos[numeroQuarto] == null) {
                quartos[numeroQuarto] = new Quarto(nome, email);
            } else {
                System.out.println("Quarto já ocupado!");
                i--; // repete esse aluguel
            }
        }

        System.out.println();
        System.out.println("Quartos ocupados:");
        for (int i = 0; i < quartos.length; i++) {
            if (quartos[i] != null) {
                System.out.println(i + ": " + quartos[i]);
            }
        }

        sc.close();
    }
}


