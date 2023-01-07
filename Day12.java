import java.util.*;
public class Day12{
    public static void main( String[] args ){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n  = scanner.nextInt();
        scanner.close();
        int sum = 0;
        while(n>0){
            int rem = n%10;
            sum  = sum + rem;
            n = n/10;
        }
        System.out.println(sum);
    }
}