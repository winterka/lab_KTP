class Praxe3{
    /* Квадратное уравнение ax² + bx + c = 0 имеет либо 0, либо 1,
       либо 2 различных решения для действительных значений x.
       учитывая a, b и c, вы должны вернуть число решений в уравнение. */
    public static int solutions(int a, int b, int c){
        if (b*b-4*a*c>0)
            return 2;
        if (b*b-4*a*c==0)
            return 1;
        return 0;
    }
    /* Напишите функцию, которая возвращает позицию второго вхождения " zip " в
       строку, или -1, если оно не происходит по крайней мере дважды.
       Ваш код должен быть достаточно общим, чтобы передать все возможные
       случаи, когда "zip" может произойти в строке. */
    public static int findZip(String str){
        int counter = 0;
        for (int i = 0; i<=str.length()-2; i++){
            if (str.charAt(i)=='z' && str.charAt(i+1)=='i' && str.charAt(i+2)=='p'){
                counter++;
                if (counter>=2)
                    return i;
            }
        }
        return -1;
    }
    /* Создайте функцию, которая проверяет, является ли целое число совершенным
       числом или нет. Совершенное число - это число, которое можно записать как
       сумму его множителей, исключая само число.
       
       Например, 6 - это идеальное число, так как 1 + 2 + 3 = 6,
       где 1, 2 и 3 - Все коэффициенты 6.
       
       Точно так же 28 - это совершенное число,
       так как 1 + 2 + 4 + 7 + 14 = 28. */
    public static boolean checkPerfect(int n){
        int sum=0;
        for (int i=1; i<n; i++)
            if (n%i==0)
                sum+=i;
        return (sum==n);
        
    }
    /* Создайте функцию, которая принимает строку и возвращает новую строку с
       заменой ее первого и последнего символов, за исключением трех условий:
        – Если длина строки меньше двух, верните "несовместимо".".
        – Если первый и последний символы совпадают, верните "два-это пара.". */
    public static String flipEndChars(String a){
        if (a.length()>=2){
            if (a.charAt(0)==a.charAt(a.length()-1))
                return "Two is pair";
            return "Incompatible.";
            } 
        return (a.charAt(a.length()-1)+a.substring(1, a.length()-1)+a.charAt(0));
        }
        /* Создайте функцию, которая определяет, является ли строка допустимым
       шестнадцатеричным кодом.
       Шестнадцатеричный код должен начинаться с фунтового ключа #
       и иметь длину ровно 6 символов. Каждый символ должен быть цифрой
       от 0-9 или буквенным символом от A-F.
       все буквенные символы могут быть прописными или строчными. */
    public static boolean isValidHexCode(String str){
        boolean check=false;
        if (str.length()==7 && str.charAt(0)=='#')
            if (str.matches("[a-z-fA-F0-9]{6}"))
                check = true;
        return check;
    }
     /* Напишите функцию, которая возвращает true, если два массива имеют
       oдинаковое количество уникальных элементов, и false в противном случае. */
    public static boolean same(int[] arr1, int[] arr2){
        int c1 = 0; int c2 = 0; int c3 = 0;
        for (int i=0; i<arr1.length;i++){
            c1++;
            c3++;
            for (int j=i+1; i<=arr1.length-1; i++){
                if (arr1[i]==arr1[j] && arr2[i]==arr2[j])
                    c2++;
            }
        }
        return ((c1-c2)==(c3-c2));
    }
    /* Число Капрекара-это положительное целое число, которое после возведения в
       квадрат и разбиения на две лексикографические части равно сумме двух
       полученных новых чисел:
        – Если количество цифр квадратного числа четное, то левая и правая
          части будут иметь одинаковую длину.
        – Если количество цифр квадратного числа нечетно, то правая часть
          будет самой длинной половиной, а левая-самой маленькой или равной
          нулю, если количество цифр равно 1.
        – Учитывая положительное целое число n, реализуйте функцию, которая
          возвращает true, если это число Капрекара, и false, если это не так. */
    public static boolean isKaprekar(int n){
        int p1,p2;
        String del = del.valueOf(n*n);
        if (del.length()==1)
            return n*n;
        p1 = Integer.parseInt(del.substring(0, del.length()/2));
        p2 = Integer.parseInt(del.substring(del.length()/2));
        return p1+p2==n;
    }
     /* Напишите функцию, которая возвращает самую длинную последовательность
       последовательных нулей в двоичной строке */
    public static String longestZero(String str){
        String maxchain="";
        String chain = "";
        for (int i=0;i<=str.length();i++){
            if (str.charAt(i)=='0')
                chain+='0';
            else {
                if (maxchain.length()<chain.length())
                    maxchain=chain;
                chain="";
            }
        }
        return maxchain;
    }
    /* Если задано целое число, создайте функцию, которая возвращает следующее
       простое число. Если число простое, верните само число. */
    public static boolean isPrime(int n){
        for (int i=2; i<=Math.sqrt(n);i++)
            if (n%i==0)
                return false;
        return true;
        
    }
    public static int nextPrime(int n){
        while (!isPrime(n))
            n++;
        return n;
    }
    /* Учитывая три числа, x, y и z, определите, являются ли они ребрами
       прямоугольного треугольника. */
    public static boolean rightTriangle(int x, int y, int z){
        return (x*x+y*y==z*z || y*y+z*z==x*x || x*x+z*z==y*y);
    }
    /* Тестирование */
    public static void main(String[] args) {
        assert solutions(1, 0, -1) == 2;
        assert solutions(1, 0, 0) == 1;
        assert solutions(1, 0, 1) == 0;
        
        assert findZip("all zip files are zipped") == 18;
        assert findZip("all zip files are compressed") == -1;
        
        assert checkPerfect(6) == true;
        assert checkPerfect(28) == true;
        assert checkPerfect(496) == true;
        assert checkPerfect(12) == false;
        assert checkPerfect(97) == false;
        
        assert flipEndChars("Cat, dog, and mouse.").equals(".at, dog, and mouseC");
        assert flipEndChars("ada").equals("Two's a pair.");
        assert flipEndChars("Ada").equals("adA");
        assert flipEndChars("z").equals("Incompatible.");
        
        assert isValidHexCode("#CD5C5C") == true;
        assert isValidHexCode("#EAECEE") == true;
        assert isValidHexCode("#eaecee") == true;
        assert isValidHexCode("#CD5C58C") == false;
        assert isValidHexCode("#CD5C5Z") == false;
        assert isValidHexCode("#CD5C&C") == false;
        assert isValidHexCode("CD5C5C") == false;
        
        assert same(new int[] {1, 3, 4, 4, 4}, new int[] {2, 5, 7}) == true;
        assert same(new int[] {9, 8, 7, 6}, new int[] {4, 4, 3, 1}) == false;
        assert same(new int[] {2}, new int[] {3, 3, 3, 3, 3}) == true;
        
        assert isKaprekar(3) == false;
        assert isKaprekar(5) == false;
        assert isKaprekar(297) == true;
        
        assert longestZero("01100001011000").equals("0000");
        assert longestZero("100100100").equals("00");
        assert longestZero("11111").equals("");
        
        assert nextPrime(12) == 13;
        assert nextPrime(24) == 29;
        assert nextPrime(11) == 11;
        
        assert rightTriangle(3, 4, 5) == true;
        assert rightTriangle(145, 105, 100) == true;
        assert rightTriangle(70, 130, 110) == false;
    }
    }
