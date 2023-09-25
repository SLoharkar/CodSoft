package Task_1;
//NUMBER GAME

import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		
		// Generate a random number between 1 and 100
		        int randomNumber = (int) (Math.random() * 100) + 1;

		        // Create a Scanner object to read user input
		        Scanner scanner = new Scanner(System.in);

		        // Start the game loop
		        boolean guessedCorrectly = false;
		        int numberOfAttempts = 0;
		        System.out.println("Guess a number between 1 and 100: "
		        		+ "\nSystem Generated Number is "+randomNumber);

		        
		        while (!guessedCorrectly && numberOfAttempts < 3) 
		        {
		            // Prompt the user to guess a number
		           
		            // Get the user's guess
		            int userGuess = scanner.nextInt();

		            // Check if the user guessed correctly
		            if (userGuess == randomNumber) 
		            {
		                guessedCorrectly = true;
		            } 
		            else 
		            {
		                numberOfAttempts++;
		                if (userGuess > randomNumber) 
		                {
		                    System.out.println("Your guess is too high.");
		                } else 
		                {
		                    System.out.println("Your guess is too low.");
		                }
		            }
		        }

		        // Close the Scanner object
		        scanner.close();

		        // If the user guessed correctly, congratulate them. Otherwise, tell them the correct answer.
		        if (guessedCorrectly) 
		        {
		            System.out.println("Congratulations! You guessed correctly! The number was " + randomNumber);
		        } else 
		        {
		            System.out.println("Sorry, you ran out of guesses. The correct answer was " + randomNumber);
		        }
		    
		

		
		
	}

}
