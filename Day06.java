import java.util.Scanner;
public class Day06{
    public static void main( String[] args ){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value of x: ");
        int x = sc.nextInt();
        System.out.println("Enter value of y: ");
        int y = sc.nextInt();
        if(x>=0 && y>=0){
        System.out.println("The point lies in First Quadrant");
    }
    else if(x<=0 && y>=0){
        System.out.println("The point lies in Second Quadrant");
    }
    else if(x<=0 && y<=0){
        System.out.println("The point lies in Third Quadrant");
}
    else if(x>=0 && y<=0){
        System.out.println("The point lies in Fourth Quadrant");
    }
  sc.close();  
}}
    