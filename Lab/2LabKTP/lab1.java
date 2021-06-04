import java.util.Scanner;
public class lab1 {
    public static Point3d GetVal(){
    Scanner scanner = new Scanner(System.in);
    System.out.println("Введите координаты");
    return new Point3d(scanner.nextInt(), scanner.nextInt(), scanner.nextInt());
    }
        /* Ввод и проверка координат */ 
    public static void main(String[] args) {
        Point3d p1,p2,p3;
        p1 = GetVal();
        p2 = GetVal();
        p3 = GetVal();
        if (p1.equals(p2) || p2.equals(p3) || p1.equals(p3)){
            System.out.println("Существуют две равные точки");
            return;
        }
        double area = computeArea(p1,p2,p3);
        System.out.println("Площадь =  " + area);
    }
    public static double computeArea(Point3d p1, Point3d p2, Point3d p3){
        double a,b,c,del;
        a = p1.distanceTo(p2);
        b = p1.distanceTo(p3);
        c = p2.distanceTo(p3);
        del = (a+b+c)/2;
        return Math.sqrt(del * (del - a) * (del - b) * (del - c));
    }
}

