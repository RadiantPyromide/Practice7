import java.util.Scanner;

public class Task1 {
    public static void main(String[] args){
    int a,b,i;
    Scanner scanner=new Scanner(System.in);
    System.out.println("Введите первое число");
    a=scanner.nextInt();
    i=a;
    System.out.println("Введите второе число ");
    b=scanner.nextInt();
    while (i<=b){
        System.out.println(i);
        i++;//a=a+1 a+=1

    }


}}
