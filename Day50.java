import java.util.Scanner;
public class Day50 {
    static int square(int n){
        int ans  = n*n;
        return ans;
    }
    public static void main( String[] args ){
        int sum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size for array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the array elements : ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        sc.close();
        for(int i = 0; i < n; i++) {
            int ans_sq = square(arr[i]);
            sum = sum + ans_sq;
        }
        System.out.println("sum of positive square elements = "+sum);
    }
}