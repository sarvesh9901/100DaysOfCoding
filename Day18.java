import java.util.*;
public class Day18{
    public static void main( String[] args ){
        Scanner sc = new Scanner(System.in);
        System.out.println("x1: ");
        int x1 = sc.nextInt();
        System.out.println("y1: ");
        int y1 = sc.nextInt();
        System.out.println("x2: ");
        int x2 = sc.nextInt();
        System.out.println("y2: ");
        int y2 = sc.nextInt();
        sc.close();
        int x3 = (x1*y2) + (x2*y1); int y3 = (y1*y2);
        float ans = x3/y3;
        System.out.println(ans);
    }
}