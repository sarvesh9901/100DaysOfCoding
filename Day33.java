import java.util.Scanner;
public class Day33{
    static boolean isPalindrome(String str)
 {
 int i = 0, j = str.length() - 1;
 while (i < j)
 {
 if (str.charAt(i) != str.charAt(j))
 return false;
 i++;
 j--;
 }
 return true;
 }

    public static void main( String[] args ){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string");
        String str = sc.nextLine();
        sc.close();
        if(isPalindrome(str)){
            System.out.println("Palindrome");
        }
        else{
            System.out.println("not palindrome");
        }
    }
}