package ru.mirea.lab1;
import java.util.Scanner;

public class Task7 {
    public static int fact(int n) {
            int factorial = 1;
            for (int i = 1; i < n + 1; i++) {
                factorial *= i;
            }
            return factorial;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter your number: ");
        int number = sc.nextInt();
        if (number>0) {
            int factorial = fact(number);
            System.out.println("factorial of your number: "+factorial);
        }
        else {
            System.out.println("error, you enter number less than 1");
        }
    }
}
