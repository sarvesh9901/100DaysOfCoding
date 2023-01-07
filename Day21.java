import java.util.Scanner;
public class Day21{
    public static void main( String[] args ){
     Scanner sc = new Scanner(System.in);   
     System.out.println("Enter a new number: ");
     int n = sc.nextInt();
     int temp = n;
     int ans  = 0;
     while(n != 0){
        int rem  = n%10;
        ans  = ans*10+rem ;
        n = n/10;
     }
    
     if(temp==ans){
        System.out.println("Palindrome");
     }
     else{
        System.out.println("Not a palindrome");
     }
    }
}