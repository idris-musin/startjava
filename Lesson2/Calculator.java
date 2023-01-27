public class Calculator {

    private int firstNum;
    private int secondNum;
    private char operation;
    private int result;

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

    public int getResult() {
        return result;
    }

    public void setResult(int result) {
        this.result = result;
    }

    public int result() {
        switch (operation) {
            case '+':
                result = firstNum + secondNum;
                break;
            case '-':
                result = firstNum - secondNum;
                break;
            case '*':
                result = firstNum * secondNum;
                break;
            case '/':
                if (secondNum != 0) {
                    result = firstNum / secondNum;
                } else {
                    System.out.println("Делить на ноль нельзя!");
                }
                break;
            case '%':
                result = firstNum % secondNum;
                break;
            case '^':
                result = 1;
                for (int i = 0; i < secondNum; i++) {
                    result *= firstNum;
                }
                break;
            default:
                System.out.println("Вы ввели неверный математический знак!!!");
                break;
        }
        return result;
    }
}