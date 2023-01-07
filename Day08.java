/*FIND ROOTS OF QUADRATIC EQUATION */
import java.util.*;
import static java.lang.Math.sqrt;
public class Day08{
    public static void main( String[] args ){
        Double a,b,c,root1,root2;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value for 'a': ");
        a = sc.nextDouble();
        System.out.println("Enter value for 'b': ");
        b = sc.nextDouble();
        System.out.println("Enter value for 'c': ");
        c = sc.nextDouble();
        sc.close();
        Double d = b*b - 4*a*c;
        if(d>0){
            root1 = -b + Math.sqrt(a)/2*a;
            root2 = -b - Math.sqrt(a)/2*a;
            System.out.println("Root1 = " + root1 + "Root2  = " + root2);
            if (root1==root2){
                System.out.println("Roots are same");
            }
        }
        else if(d==0){
            root1=root2= -b / (2*a);
            System.out.println("Root1 = " + root1 + "Root2  = " + root2);
            if (root1==root2){
                System.out.println("Roots are same");
            }
        }
        
    }
}