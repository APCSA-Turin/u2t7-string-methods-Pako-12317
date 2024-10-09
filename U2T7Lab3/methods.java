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

    public static String pigLatin(String str1){
        char c = str1.charAt(0);
        str1 = str1.replaceFirst(""+c, "");
        return str1+c+"ay";
    }

    public static String yellOrWhisper(String string){
        char c = string.charAt(0);
        if(Character.isUpperCase(c)==true){
            
        }else{

        }
    }
}
