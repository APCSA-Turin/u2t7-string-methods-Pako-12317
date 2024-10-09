package U2T7Lab3;
public class CustomStringMethods {
 
    public static void main(String[] args) {
        boolean bool = methods.longerThan("apple", 4);
        System.out.println(bool);
        bool = methods.longerThan("apple", 5);
        System.out.println(bool);
        bool = methods.longerThan("apple", 2);
        System.out.println(bool);
        bool = methods.longerThan("apple", 7);
        System.out.println(bool);
        
        String str = methods.funnyString("computer", 3);
        System.out.println(str);
        str = methods.funnyString("computer", 0);
        System.out.println(str);
        str = methods.funnyString("computer", 7);
        System.out.println(str);
        str = methods.funnyString("apples", 1);
        System.out.println(str);
        
        String str1 = methods.halvesReversed("computer");  //even # of letters
        System.out.println(str1);
        str1 = methods.halvesReversed("computers");        //odd # of letters
        System.out.println(str1);
        str1 = methods.halvesReversed("sky");
        System.out.println(str1);
        str1 = methods.halvesReversed("weekend");
        System.out.println(str1);
        str1 = methods.halvesReversed("an");
        System.out.println(str1);
        str1 = methods.halvesReversed("I");
        System.out.println(str1);
        str1 = methods.halvesReversed("see you soon");
        System.out.println(str1);
        str1 = methods.halvesReversed("see you later!");
        System.out.println(str1);
        
    }
}

