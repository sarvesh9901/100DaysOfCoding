import java.util.Scanner;
public class Day22{
    static boolean isprime(int n){
        boolean flag = false;
        for (int i=2;i<=n;i++){
            if (n%i==0){
                flag = true;
                break;
            } 
        }
        if (flag==true){
            return true;
        }
        else{
            return false;
        }
    }
    public static void main( String[] args ){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        sc.close();
        boolean flag = false;
        int num  = n;
        for(int i=2;i<=num/2;i++){
            if(isprime(i)){
                if(isprime(num-i)){
                    System.out.printf("%d can be expressed as %d and %d is prime numbers",num,i,num-i);
                    flag = true;
                }
            }
        }
        if (flag==false){
            System.out.printf("%d can't expressed in prime numbers",num);
        }
        System.out.println(isprime(55));
    }
}