package ru.mirea.lab1;
import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        int[] array = new int[5];
        System.out.print("enter numbers: ");
        Scanner sc = new Scanner(System.in);
        int sum=0, i=0, j=1, maxNumber, minNumber;
        while (i<5) {
            array[i] = sc.nextInt();
            sum += array[i];
            i++;
        }
        minNumber = array[0];
        maxNumber = array[0];
        while (j<5) {
            if (array[j] < minNumber) {
                minNumber = array[j];
            }
            if (array[j] > maxNumber) {
                maxNumber = array[j];
            }
            j++;
        }
        System.out.println("Sum of your numbers: " + sum);
        System.out.println("Max number: " + maxNumber);
        System.out.println("Min number: " + minNumber);
    }
}
