import java.util.Scanner;
public class Day19{
    public static int power(int base , int exp){
        int power  = 1;
        for(int i=1;i<=exp;i++){
            power  = power * base;
        }
        return power;

    }
    public static void main( String[] args ){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        int sum  = 0;
        int temp = n;
        sc.close();
        int count = 0;
        while(n !=0){
            n = n/10;
            count++;
        }

        while(temp!=0){
            int rem  = temp%10;
            sum  = sum + power( rem, count);
            System.out.println("rem = "+ rem+"sum = "+sum+"count = "+count);
            temp = temp/10;
            
        }
        System.out.println(sum);
        
        if(sum==temp){
            System.out.println("Armstrong number.");
        }
        else{
            System.out.println("Not an armstrong number.");
        }
    }
}