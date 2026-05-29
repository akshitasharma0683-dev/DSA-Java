import java.util.Arrays;

public class reverse {
    public static void main(String[] args) {
    int [] arr= {13,4,6,7,8,43,9};
        System.out.println(Arrays.toString(arr));
       // swap(arr[0],arr[6],arr);
       reverseArray(arr);
        System.out.println(Arrays.toString(arr));

    }

   static int [] reverseArray(int []arr){
    int start =0;
    int end= arr.length-1;

    while(start<end){
        swap(start, end, arr);
        start++;
    end--;
    }
    
return arr;
    }

    static int [] swap(int index1,int  index2 , int[] arr){
      int temp=  arr[index1];
      arr[index1] = arr[index2];
      arr[index2] = temp;
      return arr;
    }
}
