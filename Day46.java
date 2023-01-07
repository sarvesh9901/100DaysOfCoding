import java.util.Scanner;
public class Day46 {
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
        int sum = 0;
        for (int i = 0 ; i<arr.length ;i++){
            sum  = sum + arr[i];

        }
        System.out.println("The sum of all elements in arary=  "+ sum);
    }
}