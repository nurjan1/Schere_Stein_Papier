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
        int spieler_wahl = 0;
        String spieler_wahl_wort;
        String jaNein = null;

        System.out.println("Willst du ein Spiel mit mir spielen?");
        jaNein = scanner.nextLine();
        if (Objects.equals(jaNein, "ja") || Objects.equals(jaNein, "Ja") || Objects.equals(jaNein, "JA")){
            jaNein = null ;
            System.out.println("Super!");
            System.out.println("Wir spielen Schere-Stein-Papier.");
            System.out.println("Wer zuerst 3 Punkte bekommt, hat gewonnen.");
            System.out.println("Soll ich dir die Regeln des Spiels erklären?");

            jaNein = scanner.nextLine();
            if (Objects.equals(jaNein, "ja") || Objects.equals(jaNein, "Ja")|| Objects.equals(jaNein, "JA")){

                System.out.println("Es gilten folgende Regeln:   ");
                System.out.println("1.Papier gewinnt gegen Stein (Papier wickelt ihn ein).");
                System.out.println("2.Schere gewinnt gegen das Papier (Schere zerschneidet Papier).");
                System.out.println("3.Stein gewinnt gegen die Schere (Schere wird stumpf).");
                System.out.println("Alle Regeln verstanden?");
                jaNein = scanner.nextLine();
                if (Objects.equals(jaNein, "ja") || Objects.equals(jaNein, "Ja")|| Objects.equals(jaNein, "JA")) {
                }
                else  { System.out.println("EGAL,WIR SPIELEN JETZT!");

                }
                System.out.println("Okay, dann lass uns Spielen.");

            }
            else {
                System.out.println("Okay, dann lass uns Spielen.");
            }

            while (spieler_score <3 || computer_score < 3) {
                System.out.println("Schere,Stein oder Papier?");
                spieler_wahl_wort = scanner.nextLine();
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
                if (Objects.equals(spieler_wahl_wort, "Schere") ||Objects.equals(spieler_wahl_wort, "schere")||Objects.equals(spieler_wahl_wort, "SCHERE")){
                    spieler_wahl = 1;
                }
                if (Objects.equals(spieler_wahl_wort, "Stein") ||Objects.equals(spieler_wahl_wort, "stein")||Objects.equals(spieler_wahl_wort, "STEIN")){
                    spieler_wahl = 2;
                }
                if (Objects.equals(spieler_wahl_wort, "Papier") ||Objects.equals(spieler_wahl_wort, "papier")||Objects.equals(spieler_wahl_wort, "PAPIER")){
                    spieler_wahl = 3;
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
            System.out.println("Schade *traurige Computer geräusche*");
        }


    }
}