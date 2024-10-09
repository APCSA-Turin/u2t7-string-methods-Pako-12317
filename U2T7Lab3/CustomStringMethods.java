package U2T7Lab3;
public class CustomStringMethods {
 
    public static void main(String[] args) {
       String str = new String("Patryk");
       System.out.println(methods.endUp(str,3)+"\n"+
       methods.funnyString(str, 5)+"\n"+
       methods.halvesReversed(str)+"\n"+
       methods.insertAt(str, "08", "y")+"\n"+
       methods.longerThan(str, 11)+"\n"+
       methods.pigLatin(str)+"\n"+
       methods.removeCharacter(str, 3)+"\n"+
       methods.yellOrWhisper(str)+"\n"+
       methods.starBetween(str)); 
    }
}

