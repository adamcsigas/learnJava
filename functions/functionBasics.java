package functions;

import java.util.Arrays;

public class functionBasics {

    public static void main(String[] args) {

        int sum = addNumbers(2, 3);
        int sum2 = addNumbers(4, 5) + addNumbers(1, 2);
        int sum3 = addNumbers(sum, sum2);

        int number = 2;
        number = incrementNumber(number);
        System.out.println(number);

        int[] numbers = {1, 2, 3};
        incrementArray(numbers);
        System.out.println(Arrays.toString(numbers));

//    System.out.println(addNumbers(addNumbers(1, 2), addNumbers(1, 2)));
//
//    System.out.println(addNumbers(3, "Number:"));
//    System.out.println(sum);
//    System.out.println(sum2);
//    System.out.println(sum3);
        printSum(sum, sum2);
        printSum(2, 5);

        printArrayTillIndex(numbers, 1);

//    System.out.println(addManyNumbers(1, 2, 3, 4, 5, 6));

        int[] numbers2 = {1, 2, 3};
        int result = doBusinessLogic(numbers2, 4);
        System.out.println(result);

    }

    private static void printArrayTillIndex(int[] numbers, int limit) {

        for (int j = 0; j < numbers.length; j++) {
            System.out.println(numbers[j]);
            if (j == limit) {
                return;
            }
        }

        System.out.println("cica");
    }

    private static void printSum(int sum, int sum2) {
        System.out.println(sum + sum2);
    }

    private static int doBusinessLogic(int[] numbers, int newNumber) {
        numbers =  addElementToArray(numbers, newNumber);
        incrementArray(numbers);
        int sum = calculateSum(numbers);
        return sum;
    }

    private static int calculateSum(int[] numbers) {
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        return sum;
    }

    private static int[] addElementToArray(int[] numbers, int newNumber) {
        int[] newNumbers = new int[numbers.length + 1];

        for (int i = 0; i < numbers.length; i++) {
            newNumbers[i] = numbers[i];
        }
        newNumbers[numbers.length] = newNumber;
        return newNumbers;
    }

    private static int[] incrementArray(int[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = numbers[i] + 1;
        }
        return numbers;
    }

    private static int incrementNumber(int number) {
        number++;
        return number;
    }

    public static int addNumbers(int a, int b) {
//    int sum = a + b;
        return a + b;
    }

    public static int addManyNumbers(int... numbers) {
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        return sum;
    }

    public static String addNumbers(int a, String s) {
//    int sum = a + b;
        return s + " " + a;
    }

}
