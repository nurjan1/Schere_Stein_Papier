import java.util.Objects;
import java.util.Scanner;
import java.util.Random;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random zufallszahlenGenerator = new Random();

        int computer_wahl;
        computer_wahl = 3;
        int spieler_score = 0;
        int computer_score = 0;
        int spieler_wahl;
        String jaNein = "Hallo";

        System.out.println("Willst du Schere Stein Papier spielen");
        jaNein = scanner.nextLine();
        if (Objects.equals(jaNein, "ja") || Objects.equals(jaNein, "Ja")) {
            System.out.println("Supper!");
            System.out.println("Wir spielen mit Schere,stein und Papier.");
            System.out.println("1.Schere");
            System.out.println("2.Stein");
            System.out.println("3.Papier");
            spieler_wahl =Integer.parseInt(scanner.nextLine());
            computer_wahl = zufallszahlenGenerator.nextInt(3);

            if ( computer_wahl == 0 ) {
                System.out.println("Schere");
            }
            if ( computer_wahl == 1 ) {
                System.out.println("Stein");
            }
            if ( computer_wahl == 2 ) {
                System.out.println("Papier");
            }
            if (computer_wahl == spieler_wahl) {
                System.out.println("unentschieden noch mal.");
            } else if ( computer_wahl == 0 && spieler_wahl == 2 ) {
                System.out.println("Ok die runde geht an dich.");
                spieler_score = spieler_score + 1;
            } else if ( computer_wahl == 0 && spieler_wahl == 3 ) {
                System.out.println("Ok die runde geht an mich.");
                computer_score = computer_score + 1;
            } else if ( computer_wahl == 1 && spieler_wahl == 1 ) {
                System.out.println("Ok die runde geht an mich.");
                computer_score = computer_score + 1;
            } else if ( computer_wahl == 1 && spieler_wahl == 3 ) {
                System.out.println("Ok die runde geht an dich.");
                computer_score = computer_score + 1;
            } else if ( computer_wahl == 2 && spieler_wahl == 2 ) {
                System.out.println("Ok die runde geht an dich.");
                computer_score = computer_score + 1;
            } else if ( computer_wahl == 2 && spieler_wahl == 1 ) {
                System.out.println("Ok die runde geht an mich.");
                computer_score = computer_score + 1;
            }
        }else {
            System.out.println("Schade");
        }


    }
}