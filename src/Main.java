import java.util.Objects;
import java.util.Scanner;
import java.util.Random;
public class Main {
    public static void main(String[] args) {
        String spieler_wahl;
        int computer_wahl = 3;

        Scanner scanner = new Scanner(System.in);
        Random zufallszahlenGenerator = new Random();


        System.out.println("Willst du Schere Stein Papier spielen");
        String jaNein = scanner.nextLine();
        if (Objects.equals(jaNein, "ja") || Objects.equals(jaNein, "Ja")){
            System.out.println("Supper!");
            System.out.println("Wir spielen mit Schere,stein und Parier.");
            spieler_wahl = scanner.nextLine();
            computer_wahl = zufallszahlenGenerator.nextInt(3);
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
            System.out.println("Schade");
        }
    }
}