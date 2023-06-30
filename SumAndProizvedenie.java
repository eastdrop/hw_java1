import java.util.Scanner;

public class SumAndProizvedenie {
    //1) Вычислить n-ое треугольного число (сумма чисел от 1 до n), n! (произведение чисел от 1 до n)
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.printf("Input int n: ");
        int n = iScanner.nextInt();
        int sum = 0;
        int pon = 1;
        for (int i = 1; i <= n; i++) {
            sum += i;
            pon *= i;
        }
        System.out.println("Сумма чисел от 1 до n: " + sum);
        System.out.print("Произведение чисел от 1 до n: " + pon);

    }
}
