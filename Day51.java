public class Day51 {
    public static void main( String[] args ){
        int [] arr = {2,1,4,3};
        int temp;
        for(int i=0; i<arr.length; i++){
            for(int j=1; j<arr.length; j++){
                if(arr[j]<arr[j-1]){
                    temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                }
            }
        }
        System.out.println("Sorting Done using Bubble sort: ");
        for(int j=0; j<arr.length;j++) {
            System.out.println(arr[j]);
        }
    }
}