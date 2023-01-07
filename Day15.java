import java.util.Scanner;
public class Day15{
    static int fact(int n){
        if (n== 0 || n== 1){
            return 1;
        }
        return n*fact(n-1);
    }
    public static void main( String[] args ){
        int n ;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
         n = sc.nextInt();
         int a =  n;
        int sum = 0;
        while(n > 0){
            int rem = n%10;
            int ans  = fact(rem);
            sum  = sum+ans;
            n = n/ 10;
        }
        if(sum==a){
            System.out.println("Strong number");

        }
        else{
            System.out.println("Not a Strong number");
        }

        
    }
}
