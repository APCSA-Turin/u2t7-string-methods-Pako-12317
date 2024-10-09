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
            return string.toUpperCase();
        }else{
            return string.toLowerCase();
        }
    }

    public static String removeCharacter(String string, int i) {
       if(i<string.length()){
        string = string.replaceFirst(""+string.charAt(i),"");
       } 
        return string;
    }

    public static String insertAt(String string, String string2, String string3) {
        int dex1 = string.indexOf(string3);
        if(!string.contains(string3)){
            string = string+string2;
        }else{
            string = string.substring(0,dex1)+string2+string.substring(dex1);
        }
        return string;
    }

    public static String endUp(String string, int i) {
       if(i>string.length()) {
        i=string.length();
       }else{
        i=string.length()-i;
       }
       String str = string.substring(i);
       string = string.substring(0,i)+str.toUpperCase();
       return string;
    }

    public static String starBetween(String string) {
        char[] array=new  char[string.length()];

        for(int count=0;count<array.length;count++){
               array[count] = string.charAt(count);
        }
        string = "";
        for(int count=0;count<array.length;count++){
            string+=("*"+array[count]);
        }
        string = string.replaceFirst("\\*","");
        return string;
    }
}
