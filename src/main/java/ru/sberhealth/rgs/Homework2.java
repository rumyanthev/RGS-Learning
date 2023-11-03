package ru.sberhealth.rgs;

public class Homework2 {

    // Метод, который возвращает массив в обратном порядке
    public static int[] reverseArray(int[] arr) {
        int[] reversedArray = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            reversedArray[i] = arr[arr.length - i - 1];
        }
        return reversedArray;
    }

    // Метод, который прибавляет к каждому числу предыдущее и возвращает новый массив
    public static int[] addPrevious(int[] arr) {
        int[] newArray = new int[arr.length];
        newArray[0] = arr[0];
        for (int i = 1; i < arr.length; i++) {
            newArray[i] = arr[i] + arr[i - 1];
        }
        return newArray;
    }

    // Метод, который возвращает среднее арифметическое округленное в большую сторону
    public static int calculateAverage(int[] arr) {
        int sum = 0;
        for (int num : arr) {
            sum += num;
        }
        int average = sum / arr.length;
        if (sum % arr.length != 0) {
            average++;
        }
        return average;
    }

    public static void main(String[] args) {
        int[] originalArray = {1, 2, 3, 4, 5};

        // Используем методы
        int[] reversedArray = reverseArray(originalArray);
        int[] newArrayWithSum = addPrevious(originalArray);
        int average = calculateAverage(originalArray);

        // Выводим результаты
        System.out.println("Массив в обратном порядке:");
        for (int num : reversedArray) {
            System.out.print(num + " ");
        }

        System.out.println("\nМассив с прибавлением предыдущего:");
        for (int num : newArrayWithSum) {
            System.out.print(num + " ");
        }

        System.out.println("\nСреднее арифметическое (округленное в большую сторону): " + average);
    }
}