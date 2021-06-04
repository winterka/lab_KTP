public class Praxe2 {
    public static string repeat(String s, int n){
        String str="";
        for (int i=0; i<=s.length; i++){
            for (int j=0; j<=n; j++){
                str+=s.charAt(i);
            }
            return str;
        }
    }
    public static int differenceMaxMin(int[] array){
        int min=a[0];
        int max=a[0];
        for (int i=0; i<=array.length; i++){
            if (a[i]<min){
                min=a[i];
            }
            if (a[i]>max){
                max=a[i];
            }
        }
        return max-min;
    }
    public static boolean isAvgWhole(int[] array){
        int sum=0;
        for (int i=0; i<array.length; i++){
            sum+=a[i];
        }
        return (sum%array.length==0);
    }
    public static int cumulativeSum(int[] array){
        for (int i=0; i<=array.length;i++){
            array[i]=array[i]+array[i-1];
        }
        return array;
    }
    public static int getDecimalPlaces(String str){
        if (str.indexOf('.')!=-1)
            return (str.length()-str.indexOf('.')-1);
        return 0;
    }
    public static int Fibonacci(int n){
        if (n<=1)
            return 1;
        return Fibonacci(n-1) + Fibonacci(n-2);
    }
    public static boolean isValid(String str){
        int count = 0;
        if (str.length()==5)
            for(int i=0; i<=str.length();i++){
                if (str.charAt(i)>=((int)'0') && (str.charAt(i)<=((int)'9')))
                    count+=1;
            }
        return (count == 5);
    }
    public static boolean isStrangePair(String a, String b){
        return (a.charAt(0)==b.charAt(b.length()-1) && (b.charAt(0)==a.charAt(a.length()-1)));
    }
    public static boolean isPrefix(String a, String b){
        b = b.substring(0, b.length()-1);
        return (a.startsWith(b));
        
    }
    public static boolean isSuffix(String a, String b){
        b = b.substring(1);
        return(a.endsWith(b));
    }
    public static int boxSeq(int n){
        int counter = 0;
        for (int i=0;i<step;i++){
            if (n%2!=0)
                counter--;
            else
                counter+=3;
        }
        return counter;
    }
}