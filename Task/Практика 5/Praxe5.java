import java.util.HashMap;
public class Praxe5 {
    public static boolean sameLetterPattern(String str1, String str2){
        HashMap<Character, Character> map = new HashMap<Character,Character>();
        StringBuilder sb1 = new StringBuilder(str1);
        StringBuilder sb2 = new StringBuilder(str2);
        if (sb1.length()!=sb2.length())
            return false;
        for (int i = 0; i<sb1.length();i++){
            if (map.get(sb1.charAt(i)) == null)
                map.put(sb1.charAt(i), sb2.charAt(i));
            else
                if (map.get(sb1.charAt(i))!=sb2.charAt(i))
                    return false;

        }
        return true;
    }
}
