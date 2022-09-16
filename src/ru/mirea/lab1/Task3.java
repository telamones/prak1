package ru.mirea.lab1;

public class Task3 {
    public static void main(String[] args) {
        int[] array = {1, 5, 3, 9, -2};

        int sum=0, average;
        for (int i=0; i<5; i++) {
            sum += array[i];
        }
        average = sum/5;
        System.out.println("Sum: " + sum);
        System.out.println("Average: " + average);
    }
}
