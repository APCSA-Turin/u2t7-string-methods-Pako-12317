import java.util.Scanner;

public class CheckIn {
    public static void main(String[] args) {
       Scanner scan = new Scanner(System.in);
        System.out.println("Please enter two words seperated by a comma: ");
        String str = scan.nextLine();
        String str1 = str.substring(0,str.indexOf(","));
        String str2 = str.substring(str.indexOf(",")+1);
        System.out.println("Your words are "+str1+" and "+str2);
        System.out.println("Length of word one: "+str1.length());
        System.out.println("Length of word two: "+str2.length());
        scan.close();
    }
}