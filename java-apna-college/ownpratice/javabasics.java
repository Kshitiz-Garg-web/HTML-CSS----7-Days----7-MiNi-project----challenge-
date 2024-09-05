import java.util.*;

public class javabasics {

//................revers of array

//........brust force ny using another space
// public static void revers(int A[]){
//     int n = A.length;
//     int NA[]=new int[n];
//     for(int i=0;i<n;i++){
//         NA[n-1-i]=A[i];
//     }
//     for(int i=0;i<A.length;i++){
//         System.out.print(NA[i]+" ");
//     }
// }

//.........better approach by using swap method
// public static void reversg(int A[]){
//     int first=0;
//     int last=A.length-1;
//     while (first<last) {
//         int temp=A[first];
//         A[first]=A[last];
//         A[last]=temp;
//         first++;
//         last--; 
//     }
// }

//.......................print all possible sub array,sum of each array,max sum also
//....app1
// public static int subarray(int A[]){
//     int n=A.length;
//     int maxsum=0;
//     for(int i=0;i<n;i++){
//         for(int j=i;j<n;j++){
//             int currsum=0;
//             for(int k=i;k<=j;k++){
//                 currsum=currsum+A[k];
//                     }
//             System.err.println(currsum);
            
//             maxsum=Math.max(currsum,maxsum);
//     }   
//   }
//   return maxsum;
// }

//.......app2
// public static int subarray(int A[]){
//     int n=A.length;
//     int maxsum=Integer.MIN_VALUE;
//     int ps=0; // like current sum for each upcoming prefix array
//     int na[]=new int[n];
//     for(int i=0;i<n;i++){  
//         ps=ps+A[i];
//         na[i]=ps;     
//     }  
//     int sum=0;
//     for(int i=0;i<n;i++){
//         for(int j=i;j<n;j++){
//          sum = i==0 ? na[j] : na[j]-na[i-1];
//                 }
//                 maxsum=Math.max(maxsum,sum);
//             }  
//     return maxsum;
// }   

//.......app3
// public static void sumsubarrays(int A[]){
//     int cs=0;
//     int maxs=Integer.MIN_VALUE;
//     int mins=Integer.MAX_VALUE;
//     for(int i=0;i<A.length;i++){
//         cs=cs+A[i];
//         if(cs<0){
//             cs=0;
//         }
//         maxs=Math.max(maxs,cs);
//     }
//     for(int i=0;i<A.length;i++){
//         cs=cs+A[i];
//         if(cs>0){
//             cs=0;
//         }
//         mins=Math.min(maxs,cs);
//     }
//     System.out.println(maxs);
//     System.out.println(mins);
// }

//...............trapped rain water 

// public static void trapedrainwater(int h[]){
//     int n=h.length;
// // auxleray of max left boundary
//    int ala[]=new int[n];
//    ala[0]=h[0];
//    for(int i=1;i<n;i++){
//    ala[i]=Math.max(ala[i-1],h[i]);
//    }
// // auxleray of max right boundary
//    int ara[]=new int[n];
//    ara[n-1]=h[n-1];
//    for(int i=n-2;i>=0;i--){
//    ara[i]=Math.max(ara[i+1],h[i]);
//    }
// //........calculation now
// int wl;
// int ttp=0;
//   for(int i=0;i<n;i++){
//     wl=Math.min(ala[i],ara[i]);
//    int trp=(wl-h[i])*1;
//    ttp=ttp+trp;
//   }
//   System.out.println(ttp);
//   System.out.println();
//   for(int i=0;i<n;i++){
//     System.out.println(ala[i]);
//   }
//   System.out.println();
//   for(int i=0;i<n;i++){
//     System.out.println(ara[i]);
//   }
// }

// ...................sail stock profit
public static void maxprofit(int a[]){
    int bp=a[0];
    int p;
    int mp=Integer.MIN_VALUE;
    
    for(int i=1;i<a.length;i++){
        int cp=a[i];
        bp=Math.min(bp,cp);
        if(cp>=bp){
            p=cp-bp;
            mp=Math.max(mp,p);

        }

    }
    System.out.println(mp);

 

}

 





    
    public static void main(String[] args) {
        // Scanner scnobj = new Scanner(System.in);
        // String input1 = scnobj.next();

//.........revser of array
// int A[]={2,4,6,8,10};
// reversg(A);
// for(int i=0;i<A.length;i++){
//     System.out.print(A[i]+" ");
// }

//.............sum , max sum of subarray
// int A[]={-1,-2,-3,-4};
// sumsubarrays(A);


//...........trapped rain water
// int h[]={4,2,0,6,3,2,5};
// trapedrainwater(h);

//............sail stock profit
int a[]={7,6,5,4,3,1};
maxprofit(a);


















    }
}
    
