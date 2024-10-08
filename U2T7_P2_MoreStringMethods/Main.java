package U2T7_P2_MoreStringMethods;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Initialize the game variables
        int score = 0;
        int wordCount = 0;
        String previousWord = "";

        System.out.println("Welcome to the word game! Reach a score of 50 as fast as you can.");
        System.out.println("Please enter your first word: ");

        // Loop until the score reaches 50 or higher
        while (score < 50) {
            String currentWord = scanner.nextLine().toLowerCase();
            wordCount++;

            // First word case
            if (wordCount == 1) {
                previousWord = currentWord;
                System.out.println("Your current score is: " + score);
                continue;
            }

            int points = calculatePoints(previousWord, currentWord);
            score += points;

            // Print details for the current word
            System.out.println("Points awarded for \"" + currentWord + "\": " + points);
            System.out.println("Your current score is: " + score);

            // Update previous word
            previousWord = currentWord;
        }

        // Game ends when score reaches 50
        System.out.println("Congratulations! You've reached a score of 50.");
        System.out.println("It took you " + wordCount + " words to reach 50.");
        System.out.println("Try to improve your score by entering fewer words next time!");

        // Close the scanner
        scanner.close();
    }

    // Method to calculate points based on comparison rules
    public static int calculatePoints(String previousWord, String currentWord) {
        int points = 0;

        // Rule 1: Alphabetically after the previous word -> +2 points
        if (currentWord.compareTo(previousWord) > 0) {
            points += 2;
        }
        // Rule 2: Alphabetically before the previous word -> -5 points
        else if (currentWord.compareTo(previousWord) < 0) {
            points -= 5;
        }
        // Rule 3: Exact same word -> -10 points
        else {
            points -= 10;
        }

        // Rule 4: Last two letters of previous word match first two of current -> +5 points
        if (previousWord.length() >= 2 && currentWord.length() >= 2) {
            String prevLastTwo = previousWord.substring(previousWord.length() - 2);
            String currFirstTwo = currentWord.substring(0, 2);
            if (prevLastTwo.equals(currFirstTwo)) {
                points += 5;
            }
        }

        // Rule 5: First letter of previous word is found in current word -> +3 points
        char firstLetterPrev = previousWord.charAt(0);
        if (currentWord.indexOf(firstLetterPrev) != -1) {
            points += 3;
        }

        if(currentWord.length()==previousWord.length()){
            points += 5;
        }
        return points;
    }
}
