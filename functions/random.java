package functions;

import java.util.Scanner;

public class random {
    static int randomNumber;
    static Scanner userInput = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println(getRandomNum());
        int guessResult = 1;
        int randomGuess = 0;

        while (guessResult != -1)
        {
            System.out.print("Guess Number between 0 and 50 : ");
            randomGuess = userInput.nextInt();
            guessResult = checkGuess(randomGuess);
        }
        System.out.println("Yes the random number is : " + randomGuess);
    }

    public static int getRandomNum() {
        randomNumber = (int) (Math.random() * 51);
        return randomNumber;
    }

    public static int checkGuess(int guess) {
        if(guess == randomNumber)
        {
            return -1;
        } else {
            return guess;
        }
    }


}
