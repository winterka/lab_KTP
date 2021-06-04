public class Primes {
    public static void main(String[] args) { 
        for (int j=2; j<=100; j++){
            if (isPrime(j)== true)
                System.out.print(j + "  ");    
        }
    }
    public static boolean isPrime(int n) {
        boolean pr = false;
        for (int i = 2; i<n;i++){
            if (n%i==0){
                pr = false;
                break;
            }
            else {
                pr = true;  
            }
        }
        return pr;
    }
    }