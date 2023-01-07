import java.util.Scanner;

public class Day07 {
    public static void main( String[] args ){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of month: ");
        int m  = sc.nextInt();
        System.out.println("Enter Year: ");
        int y = sc.nextInt();
        sc.close();
        if(m<=12){
            if(m%2 !=0 || m==8){
                System.out.println("31");
            }
            else if(m%2==0 && m!= 8 && m!=2){
                System.out.println("30");
            }
            else if(m==2){
                if(y%4 ==0){
                    System.out.println("29");
                }
                else{
                    System.out.println("28");
                }
            }
        }
        
    }
}