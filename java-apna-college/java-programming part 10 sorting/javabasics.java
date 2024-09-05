import java.util.*;

public class javabasics {
    
    // public static void printarray(int arr[]) {
    //     for(int i=0;i<arr.length;i++){
    //         System.out.println(arr[i]);
    //     }
        
    // }
    
    public static void bubbleshort(int arr[]){
        // for tracking the turn ---outerloop
        for(int i=0;i<arr.length-1;i++){
            // for upto which index go @ turn = swap ---inner loop
            for(int j=0;j<arr.length-1-i;j++){
                int temp;
                if(arr[j]>arr[j+1]){
                     // swap
                    temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }  
            }
        }   
    }

    public static void selectionshort(int arr[]){
        for(int i=0;i<arr.length;i++){
            int minposition=i;

            for(int j=i+1;j<arr.length;j++){
                if(arr[minposition]>arr[j]){
                    minposition=j;
                }

            }
            int temp=arr[minposition];
            arr[minposition]=arr[i];
            arr[i]=temp;
        }

    }
    
















    public static void main(String[] args) {
       
        Scanner scnobj = new Scanner(System.in);
        // int num = scnobj.nextInt();

        Integer arr[]={2,5,3,7,9,1,8,23};

        // Integer arr[]=new Integer[7];
        // for(int i=0;i<arr.length;i++){
        //     arr[i]=i;
        // }

        // selectionshort(arr);.........1
        // bubbleshort(arr);.............2
        //...............................3 ....?
        //sorted inbuild...........................4
        // Arrays.sort(arr,1,7,Collections.reverseOrder());
        // for(int i=0;i<arr.length;i++){
        //     System.out.print(arr[i]+" ");
        // }


        //count............................5

        

























    }
}