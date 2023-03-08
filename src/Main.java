import java.util.Objects;
import java.util.Scanner;
import java.util.Random;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random zufallszahlenGenerator = new Random();

        int computer_wahl;
        int spieler_score = 0;
        int computer_score = 0;
        int spieler_wahl;
        String jaNein = null;

        System.out.println("Willst du Schere Stein Papier spielen");
        jaNein = scanner.nextLine();
        if (Objects.equals(jaNein, "ja") || Objects.equals(jaNein, "Ja") || Objects.equals(jaNein, "JA")) {
            System.out.println("Supper!");
            System.out.println("Wir spielen mit Schere,stein und Papier.");

            while (spieler_score <3 || computer_score < 3) {
                System.out.println("1.Schere");
                System.out.println("2.Stein");
                System.out.println("3.Papier");
                spieler_wahl = Integer.parseInt(scanner.nextLine());
                computer_wahl = zufallszahlenGenerator.nextInt(3);
                computer_wahl = computer_wahl + 1;

                if (computer_wahl == 1) {
                    System.out.println("Schere");
                }
                if (computer_wahl == 2) {
                    System.out.println("Stein");
                }
                if (computer_wahl == 3) {
                    System.out.println("Papier");
                }
                if (computer_wahl == spieler_wahl) {
                    System.out.println("unentschieden noch mal.");
                    //schere < stein punkt spieler
                } else if (computer_wahl == 1 && spieler_wahl == 2) {
                    System.out.println("Ok die runde geht an dich.");
                    spieler_score = spieler_score + 1;
                    //schere > papier punkt computer
                } else if (computer_wahl == 1 && spieler_wahl == 3) {
                    System.out.println("Ok die runde geht an mich.");
                    computer_score = computer_score + 1;
                    //stein > schere punkt computer
                } else if (computer_wahl == 2 && spieler_wahl == 1) {
                    System.out.println("Ok die runde geht an mich.");
                    computer_score = computer_score + 1;
                    //stein < papier punkt spieler
                } else if (computer_wahl == 2 && spieler_wahl == 3) {
                    System.out.println("Ok die runde geht an dich.");
                    spieler_score = spieler_score + 1;
                    //papier > stein punkt compuret
                } else if (computer_wahl == 3 && spieler_wahl == 2) {
                    System.out.println("Ok die runde geht an mich.");
                    computer_score = computer_score + 1;
                    //papier < schere punkt spieler
                } else if (computer_wahl == 3 && spieler_wahl == 1) {
                    System.out.println("Ok die runde geht an mich.");
                    spieler_score = spieler_score + 1;
                }
                System.out.println("Du hast " + spieler_score + " punkte.");
                System.out.println("Ich habe " + computer_score + " punkte.");
                if (spieler_score == 3){
                    System.out.println("Ok du gewinst!");
                    System.exit(0);
                }
                if (computer_score == 3){
                    System.out.println("Ok ich gewine!");
                    System.exit(0);
                }

            }
        }else {
            System.out.println("Schade");
        }


    }
}