import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        int x, y, temp;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое число ");
        x = scanner.nextInt();
        System.out.println("Введите второе число");
        y = scanner.nextInt();

        if (x > y) {
            temp = x;
            x = y;
            y = temp;
        }

        if (x % 2 != 0) {
            x++;
        }

        while (x <= y) {
            System.out.println(x);
            x += 2;
        }
    }
}
