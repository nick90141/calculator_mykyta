import java.util.Scanner;

public class Calculator_class {
    public static void main(String[] args) {

        double operand1 = 10;
        double operand2 = 100;

        System.out.print("Введите арифмитический знак: +, -, *, /, %: ");
        Scanner in = new Scanner(System.in);
        String sign = in.nextLine();
        if (sign.equals("+")) {
            System.out.println("Результат: " + (operand1 + operand2));
        }
        if (sign.equals("-")) {
            System.out.println("Результат: " + (operand1 - operand2));
        }
        if (sign.equals("*")) {
            System.out.println("Результат: " + (operand1 * operand2));
        }
        if (sign.equals("/"))
            if (operand2 == 0) {
                System.out.println("На ноль делить нельзя!");
            } else {
                System.out.println("Результат: " + (operand1 / operand2));
            }
        if (sign.equals("%")) {
            System.out.println("Результат: " + (operand1 % operand2));
        }

    }
}