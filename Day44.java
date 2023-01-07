
public class Day44 {
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
       System.out.println("Total even elements are " + flag_even);
       System.out.println("Total odd elements are " + flag_odd);
    }
}