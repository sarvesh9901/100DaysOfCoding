import java.util.Scanner;
public class Day36 {
    public static void main( String[] args ){
        Scanner sc  = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String s = sc.nextLine();
        String str = s;
        sc.close();
        String ans  = "";
        for(int i= 0 ; i<str.length()-1;i++){
            if(i==0 && i== str.length()-1){
                String c = Character.toUpperCase(str.charAt(i));
            }
        }
    }
}