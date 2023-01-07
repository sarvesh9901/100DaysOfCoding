import java.util.Scanner;
public class Day20{
    static void prime(int n){
        int flag  = 0;
        if (n>0){
            for(int i = 2;i<=n;i++){
                if(n%i==0){
                    flag = 1;
                    break;
                }
            }
        }
        if(flag ==1){
            System.out.println("Prime number");
        }
        else{
            System.out.println("Not a Prime number");
        }
    }
    public static void main( String[] args ){
        Scanner sc  = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();
        sc.close();
        prime(num);
        
    }
}