import java.util.Scanner;
public class Day16{
    public static void main( String[] args ){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n  = sc.nextInt();
        int ans = n;
        sc.close();
        int sum  = 0;
        for(int i =1;i<n;i++){
            if(n%i==0){
                System.out.println(i);
                sum  = sum+i;
            }
        }
        if(ans == sum){
            System.out.println("Perfect number");
        }
        else{
            System.out.println("Not a perfect number");
        }
    }
}