public class Palindrome {
    public static void main(String[] args) {
        //реализация ввода с клавиатуры
    for (int i = 0; i < args.length; i++) {
         String s = args[i];
        System.out.println(s + " " + isPalindrome(s));
       }
    } 
    //Метод для реверса строки
    public static String reverseString(String s) {
        String t = "";
        for (int i = 0; i<s.length(); i++){
            t = s.charAt(i)+t;
        }
        return t;
    }
    //Проверка слова
    public static boolean isPalindrome(String s){
        boolean re=false;
        String s2 = reverseString(s);
        if(s.equals(s2))
            re = true;
        return re;
    }
}