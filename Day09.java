import java.util.Scanner;
public class Day09{
    public static void main( String[] args ){
        Scanner sc  = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();
        sc.close();
        String new_str = String.valueOf(n);
        int len = new_str.length();
        System.out.println("Length: " + len);
    }
}