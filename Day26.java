import java.util.Scanner;
public class Day26 {
    static int handshake(int n){
        if(n==1 || n==0){
            return 0;
        }
        else{
            return (n-1)+handshake(n-1);
        }
    }
    public static void main( String[] args ){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();
        int num = n;
        sc.close();
     System.out.println(handshake(num));   
    }
}