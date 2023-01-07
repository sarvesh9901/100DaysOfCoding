import java.util.Scanner;
public class Day29{
    public static void main( String[] args ){
        Scanner sc = new Scanner( System.in);
        System.out.println("Enter a string s1: ");
        String s1 = sc.nextLine();
        System.out.println("Enter a string s2: ");
        String s2 = sc.nextLine();
        sc.close();
        System.out.println("String after Concat is: ");
        System.out.println(s1.concat(s2));
        
    }
}