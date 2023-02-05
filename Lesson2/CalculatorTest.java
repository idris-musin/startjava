import java.util.Scanner;

public class CalculatorTest {

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        Scanner scanner = new Scanner(System.in);

        String answer = "yes";

        while (answer.equals("yes")) {
            System.out.print("Введите первое число: ");
            calculator.setNum1(scanner.nextInt());
            scanner.nextLine();
            System.out.print("Введите знак математической операции: ");
            calculator.setOperation(scanner.next().charAt(0));
            scanner.nextLine();
            System.out.print("Введите второе число: ");
            calculator.setNum2(scanner.nextInt());
            scanner.nextLine();

            System.out.println(calculator.getNum1() + " " +
                    calculator.getOperation() + " " +
                    calculator.getNum2() + " = " +
                    calculator.calculate());

            do {
                System.out.println("Хотите продолжить вычисления? [yes/no]");
                answer = scanner.nextLine();
            } while (!answer.equals("yes") && !answer.equals("no"));
        }

        scanner.close();
    }
}