import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double num1, num2;
        System.out.print("Birinci ededi daxil edin: ");
        num1 = scanner.nextDouble();
        System.out.print("İkinci ededi daxil edin: ");
        num2 = scanner.nextDouble();

        System.out.print("Emeliyyati seçin (+, -, *, /): ");
        char operator = scanner.next().charAt(0);

        double result;

        switch (operator) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                if (num2 != 0) {
                    result = num1 / num2;
                } else {
                    System.out.println("Sifira bolmek olmur.");
                    return;
                }
                break;
            default:
                System.out.println("Duzgun emeliyyat seçin (+, -, *, /).");
                return;
        }

        System.out.println("Netice: " + result);
    }
}
