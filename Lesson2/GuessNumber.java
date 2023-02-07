import java.util.Scanner;

public class GuessNumber {

    private Player player1;
    private Player player2;
    private int compNum;

    public GuessNumber(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
    }

    public void start() {
        generateNumber();
        do {
            enterNumber(player1);
            if (isGuisse(player1)) {
                break;
            }
            enterNumber(player2);
            if (isGuisse(player2)) {
                break;
            }
        } while (true);
    }

    private void generateNumber() {
        compNum = (int) ((Math.random() * 100) + 1);
    }

    private void enterNumber(Player player) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(player.getName() + ", введите число: ");
        player.setNumber(scanner.nextInt());
        scanner.nextLine();
    }

    private boolean isGuisse(Player player) {
        if (player.getNumber() == compNum) {
            System.out.println("Победил игрок " + player.getName() + ". Компьтер загадал число " + compNum);
            return true;
        }
        if (player.getNumber() > compNum) {
            System.out.println("Число, загаданное компьютером меньше " + player.getNumber());
        } else {
            System.out.println("Число, загаданное компьютером больше " + player.getNumber());
        }
        return false;
    }
}