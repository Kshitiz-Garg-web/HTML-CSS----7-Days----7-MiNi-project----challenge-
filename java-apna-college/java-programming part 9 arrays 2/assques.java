import java.util.*;
public class assques {


    //...................ass ques 1
    //exp 1
    // public static boolean repeat(int nums[]){
    //     boolean result;
    //     for(int i=0;i<nums.length;i++){
    //         for(int j=i+1;j<nums.length;j++){
    //             if(nums[i]==nums[j]){
    //                 result=true;
    //                 return result;
    //             }
    //         }
    //     }
    //     result=false;
    //     return result;
    // }

    //...................ass ques 1
    // //exp 2
    // public static boolean repeat(int nums[]){
    //     boolean result;
    //     for(int i=0;i<nums.length;i++){
    //         for(int j=i+1;j<nums.length;j++){
    //             if(nums[i]==nums[j]){
    //                 result=true;
    //                 return result;
    //             }
    //         }
    //     }
    //     result=false;
    //     return result;
    // }

     //...................ass ques 1
    // //exp 3
    // public static boolean repeat(int nums[]){
    //     boolean result;
    //     for(int i=0;i<nums.length;i++){
    //         for(int j=i+1;j<nums.length;j++){
    //             if(nums[i]==nums[j]){
    //                 result=true;
    //                 return result;
    //             }
    //         }
    //     }
    //     result=false;
    //     return result;
    // }


    //.........ques-2
    // ex - 1,2,3
    // public static int findkeyindex(int nums[],int key){
    //     int s=0;
    //     int e=nums.length-1;
    //     while (s<=e) {
    //         int m=(s+e)/2 ;

    //     if(nums[m]==key){
    //         return m;
    //     }
    //     if(nums[m]<key){
    //         s=m+1;   
    //     }else{
    //         e=m-1; 
    //     }
    // }
    //     return -1; 
    // }

    //..............ques-3
    // ex -- 1,2
    public static int maxprofit(int price[]){
        int p;
        int mp=Integer.MIN_VALUE;
        int bp=price[0];

        for(int i=0;i<price.length;i++){  
            int cp=price[i];
            if(bp<=cp){
                p=cp-bp;
                mp=Math.max(mp,p);      
            }
            else{
                bp=cp;
            }
        }
        if(mp>0){
            return mp;

        }
        
        return -1;
        

    }
    

    public static void main(String[] args) {
       
        Scanner scnobj = new Scanner(System.in);
        // int num = scnobj.nextInt();

    // //...................ass ques 1
    // //exp 1
    // int nums[]={1,2,3,1};
    // System.out.println(repeat(nums));

    // //...................ass ques 1
    // //exp 2
    // int nums[]={1,2,3,4};
    // System.out.println(repeat(nums));

    //...................ass ques 1
    //exp 3
    // int nums[]={1,1,1,3,3,4,3,2,4,2};
    // System.out.println(repeat(nums));


    //...................ass ques 2
    // // exp-1
    // int nums[]={4,5,6,7,0,1,2};
    // int key=4;

    // exp-2,3
    // int nums[]={1};
    // int key=0;
    // Arrays.sort(nums);
    // for(int i=0;i<nums.length;i++){
    //     System.out.print(nums[i]+" ");
    // }
    // System.out.println();
    // System.out.println(findkeyindex(nums,key));


    //..........problem 3
    // //example 1
    // int price[]={7,1,5,3,6,4};
    // System.out.println(maxprofit(price));

    //example 1
    int price[]={3,2,1,0};
    System.out.println(maxprofit(price));

    
    
    









































  }
}


   