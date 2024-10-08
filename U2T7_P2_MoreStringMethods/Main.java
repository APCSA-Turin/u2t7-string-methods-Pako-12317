package U2T7_P2_MoreStringMethods;
import java.util.Scanner;
public class Main {
   public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);  
// score starts at 0 (and can potentially become negative).
// Here are the rules for awarding points:
// Except for the first word, each entered word is compared to the previously entered word.
// If the current word is alphabetically after the previous word, award 2 points.
// If the current word is alphabetically before the previous word, deduct 5 points.
// If the current word is the exact same word as the previous word, deduct 10 points.
// If the last two letters of the previous word match the first two letters of the current word, award 5 points.  (e.g. previous word: blame, current word: meta)
// If the first letter of the previous word is found somewhere in the current word, award 3 points.  (e.g. previous word: batches, current word: habit)

    int score = 0;
    System.out.print("Enter your first word: ");
    String str1 = scan.nextLine();
    while(score!=50){
        System.out.print("Enter a word: ");
        String strCurrent = scan.nextLine();
        switch(str1 , strCurrent)
        case(str1=strCurrent):
    }

    scan.close();
    }
}
