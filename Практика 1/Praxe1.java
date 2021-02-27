public class Praxe1 {
    public static int ost(int a, int b){
        return a%b;
    }
    public static double triArea(int a, int h){
        return (a*h)/2;
    }
    public static int animals(int chickens, int cows, int pigs){
        return ((chickens*2)+(cows*4)+(pigs*4));
    }
    public static boolean profitableGamble(double prob, double prize, double pay){
        if (prob*prize>pay){
            return true;
        }
        else
            return false;
    }
    public static int operation(int a,int b, int N){
        if (a+b==N)
            return "added";
        if (a-b==N)
            return "subtracted";
        if (a*b==N)
            return "multiplied";
        if (a/b==N)
            return "divided";
        return "none";
        
    }
    public static int ctoa(char a){
        return (int) c;
    }
    public static int addupto(int a){
        int lsum=0;
        for (int i=1;i<a;i++){
            lsum+=i;
        }
        return lsum;
    }
    public static int nextEdge(int a, int b){
        return a+b-1;
    }
    public static int sumOfCubes(int[] array){
        int soc = 0;
        for (int i=0; i<=array.length;i++){
            soc+=Math.Pow(array[i],3);
        }
        return soc;
    }
    public static boolean abcmath(int a, int b, int c){
        for (int i=1; i<=b;i++){
            a+=a;
        }
        return a%c==0;
    }
    
}
