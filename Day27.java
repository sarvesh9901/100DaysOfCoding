import java.util.Scanner;
public class Day27{
    public static void main( String[] args ){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = sc.nextInt();
        sc.close();
        System.out.println(num<<1);
    }
}