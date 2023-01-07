import java.util.*;
public class Day43 {
    public static void main( String[] args ){
        int [] arr = {1,2,5};
        int flag_odd = 0;
        int flag_even  = 0;
        for(int i = 0;i<arr.length;i++){
            if(arr[i]%2==0){
                flag_even ++;
            }
            else{
                flag_odd++;
            }
        }
        if(flag_odd == arr.length){
            System.out.println("odd");
        }
        else if (flag_even == arr.length){
            System.out.println("Even");
        }
        else{
            System.out.println("Mixed");
        }
    }
}