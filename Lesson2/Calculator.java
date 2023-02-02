public class Calculator {

    private int firstNum;
    private int secondNum;
    private char operation;

    public int getFirstNum() {
        return firstNum;
    }

    public void setFirstNum(int firstNum) {
        this.firstNum = firstNum;
    }

    public int getSecondNum() {
        return secondNum;
    }

    public void setSecondNum(int secondNum) {
        this.secondNum = secondNum;
    }

    public char getOperation() {
        return operation;
    }

    public void setOperation(char operation) {
        this.operation = operation;
    }

    public int calculate() {
        switch (operation) {
            case '+':
                return firstNum + secondNum;
            case '-':
                return firstNum - secondNum;
            case '*':
                return firstNum * secondNum;
            case '/':
                if (secondNum != 0) {
                    return firstNum / secondNum;
                } else {
                    System.out.println("Делить на ноль нельзя!");
                    return 0;
                }
            case '%':
                return firstNum % secondNum;
            case '^':
                int result = 1;
                for (int i = 0; i < secondNum; i++) {
                    result *= firstNum;
                }
                return result;
            default:
                System.out.println("Вы ввели неверный математический знак!!!");
        }
        return 0;
    }
}