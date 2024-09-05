import java.util.*;

public class javabasics {
    public static void main(String[] args) {


        System.out.println("program is stared now");
        Scanner scnobj = new Scanner(System.in);


        // ques..........................................1
        // System.out.println("please enterd a row no. to which you want to print");
        // int r = scnobj.nextInt();
        // System.out.println("please enterd a column no. to which you want to print");
        // int c = scnobj.nextInt();
        // hollow_pattern(r,c);


        //.............................ques2
        //solu 1
        //  System.out.println("please enterd a no. to which you want to print");
        // int n = scnobj.nextInt();
       
        // inverted_rotated_pyramid(n);

        //solu 2
        //  System.out.println("please enterd a no. to which you want to print");
        // int n = scnobj.nextInt();
       
        // inverted_rotated_pyramid2(n);

        // //solu3
        //   System.out.println("please enterd a no. of row to which you want to print");
        // int n = scnobj.nextInt();
       
        // inverted_rotated_pyramid_number(n);


        // //solu4
        // System.out.println("please enterd a no. of row to which you want to print");
        // int n = scnobj.nextInt();
       
        // inverted_rotated_pyramid_number_diff(n);


          // //solu5
          // System.out.println("please enterd a no. of row to which you want to print");
          // int n = scnobj.nextInt();
         
          // inverted_rotated_pyramid_number_01(n);


            
            // //solu6
            // System.out.println("please enterd a no. of row to which you want to print");
            // int n = scnobj.nextInt();
           
            // butter_fly_pattern(n);

            //solu7
            // //code 1
            // System.out.println("please enterd a no. of row to which you want to print");
            // int n = scnobj.nextInt();
           
            // solid_rhm(n);
       
            //  //code 2...................glt ara h
            //  System.out.println("please enterd a no. of row to which you want to print");
            //  int n = scnobj.nextInt();
            
            //  solid_rhm2(n);


            
            // solu9
            //code 1
            // System.out.println("please enterd a no. of row to which you want to print");
            // int n = scnobj.nextInt();
            //   dia(n);
             


        

    }
// ques 1 fun code
// public static void hollow_pattern(int r, int c){
//     for(int i=1;i<=r;i++){
//         for(int j=1;j<=c;j++){
//             if(i==1 || j==1 || i==r || j==c){
//                 System.out.print("*");
//             }  
//             else{
//                 System.out.print(" ");
//             }
//         }
//         System.out.println();
//     }


   
  //code 1
  // ques 2 code fun solu 1
// public static void inverted_rotated_pyramid(int n){
//     for(int i=1;i<=n;i++){
//         for(int j=1;j<=n;j++){
//             if(i==n || j==n || (i+j > n) ){
//                 System.out.print("*");
//             }  
//             else{
//                 System.out.print(" ");
//             }
//         }
//         System.out.println();
//     }
// }

 //code 2
  // ques 2 code fun solu 2
//   public static void inverted_rotated_pyramid2(int n){
//         for(int i=1;i<=n;i++){
//             for(int j=1;j<=n-i;j++){
//                 System.out.print(" ");
//             } 
//             for(int j=1;j<=i;j++){
//                 System.out.print("*");
//             } 

//             System.out.println();   
            
//         }
//     }

    // ques 3
//    public static void inverted_rotated_pyramid_number(int n){
//     for(int i=1;i<=n;i++){
//         for(int j=1;j<=n;j++){
//             if(i==1 || j==1 || (i+j <= n+1) ){
//                 System.out.print(j);
//             }  
//             else{
//                 System.out.print(" ");
//             }
//         }
//         System.out.println();
//     }
// }

// //ques 4 

// public static void inverted_rotated_pyramid_number_diff(int n){
//     int value =1;
//     for(int i=1;i<=n;i++){
        
//         for(int j=1;j<=i;j++){
//             System.out.print(value+" ");
//             value=value+1;
//         }

       
//        System.out.println();
//     }
// }

//ques 5 

// public static void inverted_rotated_pyramid_number_01(int n){

//     for(int i=1;i<=n;i++){
        
//         for(int j=1;j<=i;j++){

//           if( (i+j)%2==0 ){
//             System.out.print("1");}
//             else{
//                 System.out.print("0");
//             }
            
//           }         
//             System.out.println();
//         }
       
//     }


// ques 6..buter fly

//  public static void butter_fly_pattern(int n){
//   // 1st half
//   // outer loop
//   for(int i =1; i<=n; i++){
//     // inner loop
//     for(int j =1; j<=i; j++){
//       System.out.print("*");
//     }
//     for(int j =1; j<=2*(n-i);j++){
//       System.out.print(" ");
//     }
//     for(int j =1; j<=i; j++){
//       System.out.print("*");
//     }
//     System.out.println();
//   }

//   // 2nd half 
//   for(int i=n; i>=1; i--){
//     // inner loop
//     for(int j =1; j<=i; j++){
//       System.out.print("*");
//     }
//     for(int j =1; j<=2*(n-i);j++){
//       System.out.print(" ");
//     }
//     for(int j =1; j<=i; j++){
//       System.out.print("*");
//     }
//     System.out.println();


//   }
// }




//.......solu 7
//code 1
// public static void solid_rhm(int n){
//   // outer loop
//   for(int i=1;i<n;i++){
//     //inner loop
//     // to print spaces
//     for(int j=1;j<(n-i);j++){
//       System.out.print(" ");
//     }
//     // to print star
//     for(int j=1;j<n;j++){
//       System.out.print("*");
//     }
//     System.out.println();
//   }
// }


//.......solu 7
//code 1///////////////////////////////////////////glt ara h
// public static void solid_rhm2(int n){
//   // outer loop
//   for(int i=1;i<n;i++){
//     //inner loop is now conditon
//     for(int j=1;j<n;j++){
//       if((i+j)<n){
//         System.out.print(" ");
//       } 
//       if((i+j)>5 && (i+j)<(2*n-1)){
//         System.out.print("*");
//       }
    
//     }
//     System.out.println();
    

//  }
// }










// splu8........?

// solu....9.......?
int sum=0;
public static int assques5(int num ){
  for(int i=num;i>=0;num/=10){
    int value=num%10;
     num = num/10;
     sum = sum + num;
     
  }
}


}

 
 

 






 











