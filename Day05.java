import java.util.Scanner;
public class Day05{
    public static void main( String[] args ){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        sc.close();
        if (n%2==0){
            System.out.println("Even");
        }
        else{
            System.out.println("Odd");
        }
    }
}