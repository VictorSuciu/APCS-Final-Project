import java.util.*;

public class RandomGuessingGame {

	public static void main(String[] args) {
		Random rand = new Random();
		int number = rand.nextInt(101);
		
		@SuppressWarnings("resource")
		Scanner console = new Scanner(System.in);
		int x = 0;
		int numberOfGuesses = 0;
		
		System.out.println("Welcome, let's play a guessing game. I'll think of a number between 1 and 100 and you try and guess it.");
		System.out.println("If your guess is too low then I'll say Higher! If your guess it too high I'll say Lower!");
		System.out.println();
		while (x != number) {
			System.out.print("Guess a number: ");
			int guess = console.nextInt();
			x = guess;
			numberOfGuesses++;
			if (guess < number) {
				System.out.println("Higher!");
			} else if (guess > number) {
				System.out.println("Lower!");
			}
		}
		if (numberOfGuesses == 1) {
			System.out.println("Good job! It took you " + numberOfGuesses + " try to guess the right number");
		} else {
		System.out.println("Good job! It took you " + numberOfGuesses + " tries to guess the right number");
	
		}
	}
}
