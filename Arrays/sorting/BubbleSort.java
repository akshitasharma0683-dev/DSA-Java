package sorting;
import java.util.Arrays;
public class BubbleSort{
    public static void main(String[] args) {
          int [] arr = {656, 67, 42, 6, 76,88};
          bubble(arr);
          System.out.println(Arrays.toString(arr));
    }

    static void selection(int [] arr){

        for(int i=0; i<arr.length-1; i++){
           int last= arr.length -i -1;
            int max = maxElement(arr, 0, last);
            swap(arr, last, max);
        }
    }

    static int maxElement(int []arr, int start, int end ){
        int max=start;
        for (int index = start; index < end; index++) {
            if (arr[max]>arr[index]) {
                max=index;
                
            }
        }
        return max;
    }

    static void swap(int [] arr, int first, int second){

        int temp = arr[first];
        arr[first] = arr[second];
        arr[second]=temp;
    }

    static void bubble(int[] arr){
        boolean swapped;
        for(int i=0; i<arr.length; i++){
            swapped = false;
            for(int j=0; j<arr.length-1; j++){

                if(arr[j] > arr[j+1]){
                        //swap

                        int temp = arr[j];
                        arr[j]= arr[j+1];
                        arr[j+1] = temp;
                        swapped = true;
                }
            }
            if(!swapped){
                break;
            }
        }
    }
}