import java.util.Scanner;
public class Day13 {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int n = scanner.nextInt();
        int sum = 0;
        scanner.close();
        for(int i =1 ; i<=n; i++){
            sum  = sum + i;
        }
        System.out.println("Sum of numbers till "+n+" is = "+sum);
    }
}
