package U2T7Lab3;

public class methods {
    public static boolean longerThan(String str1, int x){
        boolean tf = false;
        if(str1.length()>x){
            tf = true;
        }
        return tf;
    }

    public static String funnyString(String string, int i) {
        String fun = string.substring(i, i+1);
        return fun+string+fun;
    }

    public static String halvesReversed(String string) {
        int len = string.length();
        String str1 = string.substring(0,len/2);
        String str2 = string.substring(len/2);
        return str2+str1;
    }
}
