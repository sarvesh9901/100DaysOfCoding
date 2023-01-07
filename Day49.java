import java.util.Scanner;
public class Day49 {
    public static void main( String[] args ){
        int n;
        int sum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size for both the arrays: ");
        n = sc.nextInt();
        int[] arrX = new int[n];
        int [] arrY = new int[n];
        System.out.println("Enter the array elements For X: ");
        for (int i = 0; i < n; i++) {
            arrX[i] = sc.nextInt();
        }
        System.out.println("Enter the array elements For Y: ");
        for (int i = 0; i < n; i++) {
            arrY[i] = sc.nextInt();
        }
        sc.close();
        int j = arrY.length-1;
        for(int i=0;i<arrX.length;i++) {
            sum = sum+ (arrX[i]*arrY[j]);
            j--;
        }
        System.out.println("Dot product  = "+ sum);
    }
}