import java.util.Scanner;
public class Day30 {
    public static void main( String[] args ){
        Scanner sc  = new Scanner(System.in);
        System.out.println("Enter a String: ");
        String s = sc.nextLine();
        int cnt = 0;
        for(int i = 0; i<=s.length();i++){
            cnt = i;
        }
        System.out.println(cnt);
        sc.close();
    }
}