import java.util.*;
public class javabasics{

    //.....................................qies 1 paridrom

    //..................app 1 
    // public static boolean checkparidrom(String str3){
    //     for(int i=0;i<str3.length()/2;i++){
    //      if(str3.charAt(i) != str3.charAt(str3.length()-1-i) ){
    //         System.out.println("given string is not a paradrom");
    //         return false;
    //      }
    //     }
    //     return true;
    // }

    //..................app 2 my app
    // public static boolean checkpara2(String str3){
    //     int start = 0;
    //     int end = str3.length()-1-start;
    //     while (start<end){
    //         if(str3.charAt(start) != str3.charAt(end)){
    //             System.out.println("given string is not a paradrom");
    //             return false;
    //         }
    //         start++;
    //         end--;
    //     }
    //     System.out.println("given string is a paradrom");
    //     return true;
    // }

    //.............................QUES-2
    // public static float shortestpath(String path){
    //     int x=0;
    //     int y=0;
    //     for(int i=0;i<path.length();i++){
    //         if(path.charAt(i)=='E'){
    //             x++;
    //         }
    //         else if(path.charAt(i)=='W'){
    //             x--;
    //         }
    //         else if(path.charAt(i)=='N'){
    //             y++;
    //         }
    //         else{
    //             y--;
    //         }
    //     }
    //     int x2=x*x;
    //     int y2=y*y;
    //     return (float)Math.sqrt(x2+y2);
    // }


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        // int arra = sc.nextInt();
        
    //     char cha[]={'a','b','c'};
    //     String str1="kshitiz";
    //     String str2=new String("xonam");
    //     System.out.println(str1);
    //     System.out.println(str2);

    //     System.out.println(str1.length());
    //     System.out.println(str2.length());

    //    System.out.println( str1.charAt(0));
    //    System.out.println( str2.charAt(0));

    //    System.out.println(str1 +" & "+ str2);

    //    for(int i=0;i<str1.length();i++){
    //     System.out.println("string character present at index value is : " + str1.charAt(i));
    //    }


    //.....................................qies 1 paridrom
    //    String str3=new String("iti");
    //    System.out.println(checkparidrom(str3));
    // System.out.println(checkpara2(str3));
       
    //........................................ques-2
    // String path = new String("WNEENESENNN");
    // String path = ("WNEENESENNN");
    // System.out.println(shortestpath(path));

    String s1="kshitiz";
    String s2="kshitiz";
    String s3=new String("kshitiz");
    String s4=new String("kshitiz");

    // if(s1==s2){
    //     System.out.println("its are equal");
    // };
    // if(s1!=s3){
    //     System.out.println("its are not equal");
    // }
    // if(s3!=s4){
    //     System.out.println("its are not equal");
    // }

     
    //..........................see java compare string function
    // int arr1[]={1,2,3,4,5};
    // int arr2[]={1,2,3,4,5};
    // int arr3[]=new int[5];
    // arr3[0]= 1;
    // arr3[1]= 2;
    // arr3[2]= 3;
    // arr3[3]= 4;
    // arr3[4]= 5;

    // if(arr1!=arr2){
    //     System.out.println("its are not equal-----nothing ;like point to older 1 like string");
    // };
    // if(arr1!=arr3){
    //     System.out.println("its are not equal");
    // }


    //.............................see java substgring function
    //   String str="kshitiz";
    //   int st=1;
    //   int en=6;
    //...........w/o using func , use code by own self
    // for(int i=st;i<en;i++){
    //     System.out.print(str.charAt(i));
    // }
    //................ny usi g a function
    // System.out.println(str.substring(1,6));


    //............................ques 3, 2 diff compare fun also see
    // String arr[]={"apple","mango","lichi","banana"};
    // String largest=arr[0];
    // String smallest=arr[0];
    // String equal1=arr[0];
    // for(int i=0;i<arr.length;i++){
    //     if(largest.compareTo(arr[i])<0){
    //         largest=arr[i];
    //     }
    //     if(smallest.compareTo(arr[i])>0){
    //         smallest=arr[i];
    //     } 
    // }
    // System.out.println("largest is "+largest);
    // System.out.println("smallest is "+smallest);


    //............................string builder
    // StringBuilder sb= new StringBuilder()
    // for(char chart='A';chart<'z';chart++){
    //     sb.append(chart);
    // }
    // System.out.println(sb);

    //..........................convert to upper case ??





    //...................string compression................??
    // StringBuilder sb = new StringBuilder("aaabbcccdd");
    // System.out.print(sb.charAt(0));
    // int count=0;
    // for(int i=0;i<sb.length();i++){
    //     System.out.print(sb.charAt(0));
    //     if(sb.charAt(i)!=sb.charAt(i-1)){
    //         System.out.print(sb.append(i));
    //         count++;
    //     }
    //     if(sb.charAt(i)==sb.charAt(i-1)){
    //         count++;
    //     }
    //     if(sb.charAt(i)==sb.charAt(i+1)){
    //         System.out.print(count);
    //         count=0;
    //     }

    // }
    
















    }


  


}