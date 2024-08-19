import java.util.Scanner;

public class Task2Version2 {
    public static void main(String[] args) {
    Scanner scanner=new Scanner(System.in);
    System.out.println("Введите первое число ");
    int x,y,z;
    x=scanner.nextInt();
    System.out.println("Введите второе число");
    y=scanner.nextInt();
    if (x>=y){z=x;
    x=y;
    y=z;}
    if(x%2==0){x++;}

        while (x <= y) {
            System.out.println(x);
            x += 2;
    }
}}

