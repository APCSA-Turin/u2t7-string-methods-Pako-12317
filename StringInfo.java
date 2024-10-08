import java.util.Scanner;
public class StringInfo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Please enter a word: ");
        String wrd1 = scan.nextLine();
        System.out.print("Please enter another word: ");
        String wrd2 = scan.nextLine();
        if(wrd1.length()>wrd2.length()){
            System.out.println(wrd1 + " is longer.");
        }else if(wrd1.length()<wrd2.length()){
            System.out.println(wrd2 + " is longer.");
        }else{
            System.out.println("Both words are of equal length.");
        }
        int halves = wrd1.length()/2;
        System.out.println("First half: "+ wrd1.substring(0, halves)+"\n"+"Second half: "+wrd1.substring(halves));
        halves = wrd2.length()/2;
        System.out.println("First half: "+ wrd2.substring(0, halves)+"\n"+"Second half: "+wrd2.substring(halves));
        if(wrd1.contains(wrd2)){
            System.out.println(wrd2 + " is found in " + wrd1 + " at index " + wrd1.indexOf(wrd2));
        }else{
            System.out.println(wrd2 + " is not found in " + wrd1);
        }
        scan.close();
    }
}
