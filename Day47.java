import java.util.Scanner;
public class Day47 {
    static int isrev(int n){
        int rev = 0;
        while(n!=0){
            int rem = n%10;
            rev = rev*10+rem;
            n = n/10;
        }
            return rev;
       
    }
    static int ispalindrome(int n ){
        if(isrev(n)==1){
            return n;
        }
        else{return 0;}
    }
    public static void main( String[] args ){
        Scanner sc  =  new Scanner(System.in);
        System.out.println("Enter length of array : ");
        int n = sc.nextInt();
        int [] arr = new int[n];
        System.out.println("Enter elements in array : ");
        for(int i =0 ;i<n ;i++){
            arr[i] = sc.nextInt();
        }
        sc.close();
         int big= 0;
        for(int i=0 ;i<arr.length ;i++){
            int reverse = isrev(arr[i]);
            if(reverse==arr[i]&& reverse>big){
                big = arr[i];
            }   
    }
    System.out.println(big);
}}