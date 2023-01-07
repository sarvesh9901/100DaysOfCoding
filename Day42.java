public class Day42{
    public static void main( String[] args ){
        int [] arr1 = {1,2,3};
        int[] arr2 = {1,2,3};
        int flag = 0;
        for(int i = 0;i<arr1.length;i++){
            if(arr1[i]==arr2[i]){
                System.out.println(arr1[i]);System.out.println(arr2[i]);
                flag = 1;
            }
        }
        if(flag==1){
            System.out.println("same");
        }
        else{
            System.out.println("different");
        }
    }
}