import java.util.Scanner;
public class Day25{
    static double area(int radius){
        double ans = 3.14 * radius * radius;
        return ans;
    }
    public static void main( String[] args ){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter radius of circle: ");
        int n = sc.nextInt();
        int radius = n;
        sc.close();
        System.out.println(area(radius));
    }
}