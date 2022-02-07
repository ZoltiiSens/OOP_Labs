import java.util.Scanner;

public class Lab1 {
    public static void main(String[] args) {
        Scanner getFromConsole = new Scanner(System.in);
        // Вхідні дані: №1314
        final int C2 = 1314 % 2; // O1 - "+"
        final int C3 = 1314 % 3; // C = 0
        final int C5 = 1314 % 5; // O2 - "-"
        final int C7 = 1314 % 7; // type - float
        final int C = C3;

        // Змінні для формули
        float i, j;
        int a, n, b, m;

        // Отримуємо змінні a, b, n, m від користувача
        System.out.println("Enter a: ");
        a = getFromConsole.nextInt();
        System.out.println("Enter n: ");
        n = getFromConsole.nextInt();
        System.out.println("Enter b: ");
        b = getFromConsole.nextInt();
        System.out.println("Enter m: ");
        m = getFromConsole.nextInt();

        //Перевірка введених даних на коректність(a>n та b>m)
        if (a > n || b > m) {
            System.out.printf("Error in input data! Result is 0");
            throw new IllegalArgumentException("Problems with arguments");
        }
        //Перевірка ділення на нуль(чи дорівнюватиме i нулю)
        else if (-C <= n && -C >= a) {
            System.out.println("Error! Division by 0!");
            throw new ArithmeticException("Division by zero");
        }
        //Виконуємо потрібні обчислення
        else {
            float sum = 0;
            for (i = a; i <= n; i++) {
                for (j = b; j <= m; j++){
                    sum += (i - j) / (i + C);
                }
            }
            System.out.printf("Sum is %f", sum);
        }
    }
}
