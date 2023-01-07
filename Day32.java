import java.util.Scanner;
public class Day32 {
    public static void main( String[] args ){
        Scanner sc  = new Scanner(System.in);
        System.out.println("Enter a String: ");
        String s = sc.nextLine();
        sc.close();
        String str = "";
        str = s.replaceAll("[a,e,i,o,u]","");
        System.out.println(str);
    }
}