import java.util.*;
public class sorting {
    public static void printArray(int [] arr){
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String args []){
        int arr[]={4,6,1,8,0,9};

        //bubble sort
        for(int i=0; i<arr.length;i++){
            for(int j=0; j<arr.length-i-1; j++){
                if(arr[j]> arr[j+1]){
                    int temp = arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;

                }
            }
        }
        System.out.println("Bubble sort:");
        printArray(arr);

        //selection sort
        for(int i=0;i<arr.length-1;i++){
            int imin=i;
            for(int j=i+1; j<arr.length; j++){
                if(arr[imin]>arr[j]){
                    imin=j;
                }   
            } int tmp=arr[imin];
            arr[imin]=arr[i];
            arr[i]=tmp;
        }
        System.out.println("Selection sort:");
        printArray(arr);
        //insertion sort
        System.out.println("Insertion sort");
        for(int i=1;i<arr.length;i++){
            int current=arr[i];
            int j =i-1;
            while(j>=0 && current<arr[j]){
                arr[j+1]=arr[j];
                j--;
            }
            //placement
            arr[j+1]=current;
        }
        printArray(arr);
    }
}