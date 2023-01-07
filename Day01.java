/* FIND CONSONENT AND VOVEL FROM GIVEN CHARECTER */

public class Day01 {
    public static void main( String[] args ){
        System.out.println("hello");
        int flag = 0;
        char c = 'o';
        char[] arr = {'a', 'e','i','o','u'};
        for( int i = 0; i < arr.length; i++){
            if (arr[i] == c){
                flag = 1;
        }
        
    }
    if (flag == 1){
        System.out.println("vovel");
    }
    else{
        System.out.println("Consonent");
    }
}}