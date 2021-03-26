import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.StringTokenizer;
    public class Praxe4 {
    public static String sevenBoom(int[] arr){
        for (int i = 0; i<=arr.length; i++){
            if (arr[i] == 7)
                return "Boom!";
        }
        return "there is no 7 in the array";
    }
    public static boolean cons(int[] mas){
        Arrays.sort(mas);
        boolean ans = true;
        for (int i = 0; i < mas.length; i++){
            if (a[i]-a[i-1]!=-1){
                ans = false;
                break;
            }
        }
    }
    public static String unmix(String str){
        StringBuffer sbuf = new StringBuffer();
        for (int i = 0; i<str.length()-1;i+=2){
            sbuf.append(str.charAt(i+1));
            sbuf.append(str.charAt(i));
        }
        return sbuf.toString();
    }
    public static String noYelling(String str){
        int counter = 0;
        String res = "";
        for(int i = str.length()-1; i>0;i--){
            if(str.charAt(i)=='!' || str.charAt(i)=='?')
                counter++;
            else
                res = str.substring(0, str.length()-counter+1);
        }
        return res;
    }
    public static String xPronounce(String str){
        String a = str.replaceAll(" x ", " ecks ")
            .replaceAll(" x", " z")
                .replaceAll("x", "cks");
        return a;
    }
    public static int largestGap(int[] mas){
        int mgap=0;
        Arrays.sort(mas);
        for (int i = 1;i<=mas.length;i++){
            if(mas[i]-mas[i-1]>mgap)
                mgap=mas[i]-mas[i-1];
        }
        return mgap;
    }
    public static int revcode(int n){
        char[] num=Integer.toString(n).toCharArray();
        String res ="";
        Arrays.sort(num);
        for(char i:num)
        res+=i;;
        return (n-Integer.parseInt(res));
    }
    
    public static String commonLastVowel(String str){
        StringTokenizer tokenizer = new StringTokenizer(str.toLowerCase(), " ");
        HashMap<Character,Integer> map = new HashMap<>();
        String vowels = "aeiou";
        while (tokenizer.hasMoreTokens()){
            String word = tokenizer.nextToken();
            for(int i = word.length()-1; i>=0;i--){
                char ch = word.charAt(i);
                if (vowels.contains(Character.toString(ch))){
                    if (!map.containsKey(ch))
                        map.put(ch, new Integer(1));
                    else
                        map.put(ch, map.get(ch)+1);
                    break;
                }
            }
        }
        return Collections.max(map.entrySet(),Map.Entry.comparingByValue()).getKey().toString();
    }
    public static String memeSum(int a, int b){
        String res = "";
        int del = 0;
        while (a!=0 || b!=0){
            del = a%10 + b%10;
            res = del + res;
            a/=10;
            b/=10;
        }
        return res;
    }
    public static String unrepeated(String str){
        String alph ="";
        char a;
        for (int i = 0; i < str.length();i++){
            a = str.charAt(i);
            if (a==' ' || alph.indexOf(a)==-1)
                alph+=a;
        }
        return alph;
    }

    public static void main(String[] args){
        String str = "hTsii  s aimex dpus rtni.g";
        String arg = "What went wrong?????????";
        System.out.println(unmix(str));
        System.out.println(noYelling(arg));
    }
}
