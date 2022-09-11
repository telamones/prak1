package ru.mirea.lab1;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        int[] array = new int[5];
        System.out.print("enter numbers: ");
        Scanner sc = new Scanner(System.in);
        int sum=0, average;
        for (int i=0; i<5; i++) {
            array[i] = sc.nextInt();
            sum += array[i];
        }
        average = sum/5;
        System.out.println("Sum of your numbers: " + sum);
        System.out.println("Average of your numbers: " + average);
    }
}
