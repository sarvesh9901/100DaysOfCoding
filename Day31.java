import java.util.Scanner;
public class Day31{
    public static void main( String[] args ){
        
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter a String : ");
            String str = sc.nextLine();
            sc.close();
            String s1 = "";
            for (int i = 0; i < str.length(); i++) {
            if(Character.isUpperCase(str.charAt(i)))
            s1=s1+Character.toLowerCase(str.charAt(i));
            else
            s1=s1+Character.toUpperCase(str.charAt(i));
            }
            System.out.println("Toggle String : "+s1);
             
    }
}