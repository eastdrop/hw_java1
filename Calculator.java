import java.util.Scanner;
public class Calculator {
    //3) Реализовать простой калькулятор
    public static void main(String[] args) {
        int x1 = GetInt();
        int x2 = GetInt();
        char operation = GetOperation();
        int result = calc(x1, x2, operation);
        System.out.println("Итог: " + result);
    }
    public static int GetInt() {
        System.out.print("Введите целое число:");
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        return x;
    }

    public static char GetOperation() {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите желаемое действие(Калькулятор может выполнить только следующие " +
                "действия (*,/,+,-)): ");
        char operation = in.next().charAt(0);
        return operation;
    }

    public static int calc(int x1, int x2, char operation) {
        int res = 0;
        switch (operation){
            case '+':
                res = x1 + x2;
                break;
            case '-':
                res = x1 - x2;
                break;
            case '*':
                res = x1 * x2;
                break;
            case '/':
                res = x1 / x2;
                break;
            default:
                System.out.println("Введены неверные данные");
        }
        return res;
    }
}
