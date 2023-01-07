import java.util.*;
public class Day40 {
    public static void main( String[] args ){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string : ");
        String str1 = sc.nextLine();
        System.out.println("Enter a SubsString to be removed: ");
        String str2 = sc.nextLine();
        System.out.println("Enter a New String: ");
        String str3 = sc.nextLine();
        str1 = str1.replace(str2, str3);
        System.out.println(str1);
        sc.close();
        
    }
}