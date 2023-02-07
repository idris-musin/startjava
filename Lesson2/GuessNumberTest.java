import java.util.Scanner;

public class GuessNumberTest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите имя первого игрока: ");
        Player player1 = new Player(scanner.nextLine());
        System.out.print("Введите имя второго игрока: ");
        Player player2 = new Player(scanner.nextLine());

        GuessNumber guessNumber = new GuessNumber(player1, player2);
        String answer = "yes";

        do {
            guessNumber.start();
            do {
                System.out.println("Хотите продолжить игру? [yes/no]");
                answer = scanner.nextLine();
            } while (!answer.equals("yes") && !answer.equals("no"));
        } while(!answer.equals("no"));
    }
}