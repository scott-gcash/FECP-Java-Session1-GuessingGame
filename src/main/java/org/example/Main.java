package org.example;

import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int secretNumber = (int) (Math.random() * 5) + 1;
        int guess;

        System.out.println("I'm thinking of a number between 1 and 5");
        for (int i = 1; i < 4; i++) {
            System.out.printf("Guess %d: ", i);
            guess = scanner.nextInt();

            if (guess == secretNumber){
                System.out.println("You guessed it!");
                System.out.println("You win!");
                break;
            }
            else{
                if (i < 3)
                    System.out.println("Wrong guess.");
                else
                    System.out.printf("You lose. Correct number was %d", secretNumber);
            }
        }
    }
}