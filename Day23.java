import java.util.Scanner;
public class Day23{
    public static void main( String[] args ){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        String s1 = sc.nextLine();
        sc.close();
        s1 = s1.replace("0", "1");
        System.out.println(s1);
    }
}