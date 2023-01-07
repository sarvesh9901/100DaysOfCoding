import java.util.Scanner;
public class Day34{
    public static void main( String[] args ){
        Scanner sc  = new Scanner(System.in);
        System.out.println("Enter a equation: ");
        String str = sc.nextLine();
        sc.close();
        String s = "";
        s = str.replaceAll("[( , )]","");
        System.out.println(s);
    }
}