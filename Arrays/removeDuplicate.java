
import java.util.Arrays;

public class removeDuplicate{
  public static void main(String[] args) {
    int[] arr = {0,0,1,1,1,1,2,2,3,4,4,4,5};
    int[] brr ={1,2,3,4,5};
    removeDuplicate rm = new removeDuplicate();
    System.out.println(Arrays.toString((rm.remove(arr))));
    System.out.println(Arrays.toString(rm.remove(brr)));
    
  }
  public int[] remove(int[] arr){
   int i =0,size=arr.length;

   for(int j =0;j<size;j++){
    if(arr[i]!=arr[j]){
      i++;
      arr[i]=arr[j];
    }

   }
   return arr;
  }
}