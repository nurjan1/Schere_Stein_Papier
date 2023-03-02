import java.util.Objects;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        String spieler_wahl;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Willst du Schere Stein Papier spielen");
        String jaNein = scanner.nextLine();
        if (Objects.equals(jaNein, "ja") || Objects.equals(jaNein, "Ja")){
            System.out.println("Super!");


        }
        else {
            System.out.println("Schade");
        }
    }
}