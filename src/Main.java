import java.util.Objects;
import java.util.Scanner;
import java.util.Random;
public class Main {
    public static void main(String[] args) {
        String spieler_wahl;
        int computer_wahl = 3;

        Scanner scanner = new Scanner(System.in);
        Random zufallsZahlenGenerator = new Random();


        System.out.println("Willst du ein Spiel mit mir spielen?");
        String jaNein = scanner.nextLine();
        if (Objects.equals(jaNein, "ja") || Objects.equals(jaNein, "Ja")){
            jaNein = "0";
             System.out.println("Super!");
             System.out.println("Wir spielen Schere-Stein-Papier.");
             System.out.println("Wer zuerst 3 Punkte bekommt, hat gewonnen.");
             System.out.println("Soll ich dir die Regeln des Spiels erklären?");

             jaNein = scanner.nextLine();
            if (Objects.equals(jaNein, "ja") || Objects.equals(jaNein, "Ja")){

                System.out.println("Es gilten folgende Regeln: Papier gewinnt gegen Stein (Papier wickelt ihn ein). Schere gewinnt gegen das Papier (Schere zerschneidet Papier). Stein gewinnt gegen die Schere (Schere wird stumpf).");

                System.out.println("Alle Regeln verstanden?");
                jaNein = scanner.nextLine();
               if (Objects.equals(jaNein, "ja") || Objects.equals(jaNein, "Ja")) {
              }
                 else  { System.out.println("EGAL,WIR SPIELEN JETZT!");

                 }
                System.out.println("Okay, dann lass uns Spielen.");

            }
            else {
                System.out.println("Okay, dann lass uns Spielen.");
            }

            System.out.println("Schere,Stein oder Papier?");
            spieler_wahl = scanner.nextLine();
            computer_wahl = zufallsZahlenGenerator.nextInt(3);
            if (computer_wahl == 0){
                System.out.println("Schere");
            }
            if (computer_wahl == 1){
                System.out.println("Stein");
            }
            if (computer_wahl == 2){
                System.out.println("Papier");
            }



        }
        else {
            System.out.println("Schade *traurige Computer geräusche*");
        }
    }
}