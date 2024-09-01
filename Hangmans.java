package srujan;
 
import java.util.Scanner;
 
public class Hangmans {
     
    public static void main(String[] args) {
         
        Scanner scanner = new Scanner(System.in);
 
        String[] words = { "programming", "java", "computer", "hangman", "algorithm", "game" };
        String secretWord = words[(int) (Math.random() * words.length)].toLowerCase();
        char[] guessedLetters = new char[secretWord.length()];
        int attempts = 6;
 
        for (int i = 0; i < guessedLetters.length; i++) {
            guessedLetters[i] = '_';
        }
 
        System.out.println("Welcome to Hangman!");
        System.out.println("You have " + attempts + " attempts to guess the word.");
 
        while (attempts > 0) {
            System.out.println("Current word: " + String.valueOf(guessedLetters));
 
            System.out.print("Guess a letter: ");
            char guess = scanner.next().toLowerCase().charAt(0);
 
            if (!isLetter(guess)) {
                System.out.println("Invalid input. Please enter a letter.");
                continue;
            }
 
            boolean found = false;
            for (int i = 0; i < secretWord.length(); i++) {
                if (secretWord.charAt(i) == guess) {
                    guessedLetters[i] = guess;
                    found = true;
                }
            }
 
            if (!found) {
                attempts--;
                System.out.println("Incorrect guess. You have " + attempts + " attempts left.");
            }
 
            if (String.valueOf(guessedLetters).equals(secretWord)) {
                System.out.println("Congratulations! You guessed the word: " + secretWord);
                break;
            }
        }
 
        if (attempts == 0) {
            System.out.println("Sorry, you ran out of attempts. The word was: " + secretWord);
        }
 
        scanner.close();
    }
 
    private static boolean isLetter(char c) {
        return (c >= 'a' && c <= 'z');
    }
}