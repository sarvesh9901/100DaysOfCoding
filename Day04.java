import java.util.*;
public class Day04 {
    public static void main( String[] args ){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a integer number: ");
        int n = sc.nextInt();
        if (n>0){
            System.out.println("Positive number: ");
        }
        else if (n<0){
            System.out.println("Negative number: ");
        }
        else{
            System.out.println("Neither positive number nor Negative number");
        }
    }
}
