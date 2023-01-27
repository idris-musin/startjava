import java.util.Scanner;

public class CalculatorTest {

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        Scanner scanner = new Scanner(System.in);

        String answer = "yes";

        while (answer.equals("yes")) {

            System.out.print("Введите первое число: ");
            calculator.setFirstNum(scanner.nextInt());
            scanner.nextLine();
            System.out.print("Введите знак математической операции: ");
            calculator.setOperation(scanner.next().charAt(0));
            scanner.nextLine();
            System.out.print("Введите второе число: ");
            calculator.setSecondNum(scanner.nextInt());
            scanner.nextLine();

            System.out.println(calculator.getFirstNum() + " " +
                    calculator.getOperation() + " " +
                    calculator.getSecondNum() + " = " +
                    calculator.result());

            do {
                System.out.println("Хотите продолжить вычисления? [yes/no]");
                answer = scanner.nextLine();
            } while (!answer.equals("yes") && !answer.equals("no"));
        }

        scanner.close();
    }
}