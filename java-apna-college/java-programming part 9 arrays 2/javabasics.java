import java.util.*;

public class javabasics {



//.......................................................SUM FOR ALL SUB ARRAY , MAX SUM ALSO BY APPROACH 1 

//     public static void subarraysum(int array[]){
//         int MS=Integer.MIN_VALUE;
//         int CS=0;
     

//         for(int i=0;i<array.length;i++){
//             for(int j=i;j<array.length;j++){
//                 CS=0;
//                 for(int k=i;k<=j;k++){
//                 CS=CS+array[k];
//             }
//             System.out.print(CS);
//             if(MS<CS){
//                 MS=CS;
//             }
//             System.out.println();
//         }
//         System.out.println();

//         System.out.println(MS);
//     }
// }


//.......................................................SUM FOR ALL SUB ARRAY , MAX SUM ALSO BY APPROACH 2 

// public static void subarraysum(int array[]){

// // varible dec
//     int ms=Integer.MIN_VALUE;
//     int cs=0;
//     int prarr[]=new int[array.length];

// // to create a prefix arraty
//     prarr[0]=array[0];
//     for(int i=1;i<prarr.length;i++){
//         prarr[i]=prarr[i-1]+array[i];
//     }

// // for start , 1st loop ....for end , 2nd loop
//     for(int i=0;i<array.length;i++){
//         int start=i;
//         for(int j=i;j<array.length;j++){
//             int end =j;

// // to cal a current sum for each sub array        
//             cs = start == 0 ? prarr[end] : prarr[end]-prarr[start-1];
//             System.out.println(cs);
// // to cal a max sum out of all cs of sub array        
//             if(ms<cs){
//                 ms=cs;
//             }
//         }
//         System.out.println();
       
        
//     }
//     System.out.println(ms);

    

// }

//..............................................trpped water
// public static int watervolumetrpeed(int height[]){

// int n = height.length;    
// //auxlery array for max left boundary
// int mlb[]= new int[n];
// mlb[0]=height[0];
// for(int i=1;i<n;i++){
//    mlb[i]= Math.max(height[i-1],height[i]);
// }

// //auxlery array for max left boundary
// int mrb[]= new int[n];
// mrb[n-1]=height[n-1];
// for(int i=n-2;i>=0;i--){
//    mrb[i]= Math.max(height[i],height[i+1]);
// }

// //for loop into a main height array
// int trpwtr=0;
// for(int i=0;i<n;i++){
//     int wl=Math.min(mlb[i],mrb[i]);
//     trpwtr=trpwtr + (wl-height[i]);

// }

// return trpwtr;
// }



//.......................................................SUM FOR ALL SUB ARRAY , MAX SUM ALSO BY APPROACH 3
//      public static void subarraysum(int array[]){

// // valrible dec
//         int cs=0;
//         int ms=Integer.MIN_VALUE;

// // one only loop for interate each value        
//         for(int i=0;i<array.length;i++){
//             cs=cs+array[i];

// // -hona s acha ki 0 hoja bhia tu cs            
//             if(cs<0){
//                 cs=0;
//             }

// // jonsa higher ho value m uss hisab s assign krlo ms bhia            
//             ms=Math.max(cs,ms);
//         }
//         System.out.println(ms);
//      }



//.....................................................stock wli problem.....
public static int maxprofit(int price[]){
    int maxpro=0;
    int bp=Integer.MAX_VALUE;
    for(int i=0;i<price.length;i++){
        if(bp<price[i]){
            int pft=price[i]-bp;
            maxpro=Math.max(maxpro,pft);
        }
        else{
            bp=price[i];
        }
    }
    return maxpro;
}


    

    public static void main(String[] args) {
       
        Scanner scnobj = new Scanner(System.in);
        // int num = scnobj.nextInt();


        //.......................................................SUM FOR ALL SUB ARRAY , MAX SUM ALSO BY APPROACH 1 
        // int array[]={2,4,6,8,10};
        // subarraysum(array);

        //.......................................................SUM FOR ALL SUB ARRAY , MAX SUM ALSO BY APPROACH 2
        // int array[]={2,4,6,8,10};
        // subarraysum(array);
        

        //.......................................................SUM FOR ALL SUB ARRAY , MAX SUM ALSO BY APPROACH 2 
        // int array[]={2,4,6,8,10};
        // subarraysum(array);


        //............................................trapped water 
        // int height[]={11,22,44,55,1,4,6,77,22,88,33};
        // System.out.println(watervolumetrpeed(height));


        //.....................................................stock wli problem.....
        int price[]={7,1,5,3,6,4};
        System.out.println(maxprofit(price));



































    }
}