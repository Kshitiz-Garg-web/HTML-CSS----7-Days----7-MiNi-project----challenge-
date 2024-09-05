// import java.util.*;

public class javabasics {

    //.......................................................
    // public static void update(int marks[]){
    //     for(int i=0;i<marks.length;i++){
    //         marks[i]=marks[i]+1;
    //     }
    // }

    //.........................................................
    // public static int linearserach(int numgrp[],int value) {

    //     for(int i=0;i<numgrp.length;i++){
    //         if(numgrp[i] == value){
    //             return i;
    //         }
    //     }
    //     return -1;
    //  }

    //.........................................................
    // public static int linearserach(int canteenmenu[],int value) {

    //     for(int i=0;i<canteenmenu.length;i++){
    //         if(canteenmenu[i] == value){
    //             return i;
    //         }
    //     }
    //     return -1;
    //  }

    //....................bineary search problem 1

    // public static int sortedarray(int numvers[],int key){
    //     int start=0;
    //     int end=numvers.length-1;
    //     int mid=(start+end)/2;
    //     while(start<=end){
    //         if(numvers[mid]==key){
    //             return mid;
    //         }
    //         else if(numvers[mid]>key){
    //             end=mid-1;
    //             mid=(start+end)/2;   
              
    //         }
    //         else {
    //             start=mid+1;
    //             mid=(start+end)/2;
              
    //         }
           
    //     } 
    //     return -1;
        
    // }

    //.................................revers of array....?????????????????????????????????????????????

    //.................................paires in array
    // public static void reversarray(int nums[]){
    //     for(int i=0;i<=nums.length;i++){
    //         for(int j=i+1;j<nums.length;j++){
    //             System.out.print("("+nums[i]+","+nums[j]+") ");
    //         }
    //         System.out.println();
    //     }
    // }

    //...................................print subarray
    public static void subarray(int nums[]){
        int ts=0;
        for(int i =0;i<nums.length;i++){
            for(int j=i;j<nums.length;j++){
                for(int k=i;k<=j;k++){
                    System.out.print(nums[k]);
                    
                }
                ts++;
                System.out.println();
            }
            System.out.println();
        }
            
        System.out.println(ts);

    }

    
          
            
       
   



  


     


    

    public static void main(String[] args) {
    // System.out.println("program is started now");


    // Scanner scnobj = new Scanner(System.in);
    // String input1 = scnobj.next();


    //.......................................................
    // int marks[]=new int[3];
    // marks[0]=scnobj.nextInt();
    // marks[1]=scnobj.nextInt();
    // marks[2]=scnobj.nextInt();
   
    // update(marks);

    // for(int i=0;i<marks.length;i++){
    //     System.out.println(marks[i]+" " );
    // }

    // System.out.println("program is ended now");




    //.........................................................
    // int numgrp[]={1,2,3,4,5,6,7,8,9};
    // System.out.println("enterd a no. @ to which you want know the index value is :");
    // int value = scnobj.nextInt();
    // int index=linearserach(numgrp, value);
    // if(index==-1){
    //     System.out.println("no. was not found");}
    // else{
    //     System.out.println(index);
    //     }


    //.........................................................hw
    // int canteenmenu[]={"patize","samosa","tea","coffe","coldrink","juice","chips","biscute","pizza"};
    // System.out.println("enterd a no. @ to which you want know the index value is :");
    // int value = scnobj.next();  
    // int index=linearserach(canteenmenu, value);
    // if(index==-1){
    //     System.out.println("no. was not found");}
    // else{
    //     System.out.println(index);
    //     }


    //................bineary search problem 1
    // System.out.println("program is started now");
    // int numvers[]={2,4,6,8,10,11,12};
    // System.out.println("please enterd a key value to find in sorted array here :");
    // int key = scnobj.nextInt();
    // int result = (sortedarray(numvers,key));
    // System.err.println("the key value of "+key+" is present at index of numbers array is : "+result);
    // System.out.println("programe is ended now");


    //    ....................problem of revers array...............................................................????????????????????????????????????????????????????????????????????????
  


    // //.................................paires in array
    // int nums[]={1,2,3,4,5,6,7,8,9,10};
    // reversarray(nums);


    //.................................print all sab array
    int nums[]={1,2,3,4};
    subarray(nums);



}
   


}
















    






   