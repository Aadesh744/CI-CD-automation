package com.example;

import java.util.Scanner;
import java.util.Random;

public class GuessTheNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        
        int numberToGuess = random.nextInt(100) + 1; 
        int attempts = 0;
        int guess = 0;
        
        System.out.println("🎉 Welcome to the Guess the Number Game! 🎉");
        System.out.println("I have selected a number between 1 and 100. Can you guess it?");
        
        while (guess != numberToGuess) {
            System.out.print("Enter your guess: ");
            guess = scanner.nextInt();
            attempts++;
            
            if (guess < numberToGuess) {
                System.out.println("📉 Too low! Try again.");
            } else if (guess > numberToGuess) {
                System.out.println("📈 Too high! Try again.");
            } else {
                System.out.println("🎉 Congratulations! You guessed the number in " + attempts + " attempts.");
            }
        }
        
        scanner.close();
        System.out.println("Thanks for playing! 😄");
    }
}

