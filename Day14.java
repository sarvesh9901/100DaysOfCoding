import java.util.Scanner;
public class Day14 {
    public static void main(String[] args){
        int rev = 0;
        Scanner sc  = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        sc.close();
        while(n != 0 ){
            int rem  = n%10;
            rev = rev*10+rem;
            n = n/10;
        }
        System.out.println(rev);
    }
}
