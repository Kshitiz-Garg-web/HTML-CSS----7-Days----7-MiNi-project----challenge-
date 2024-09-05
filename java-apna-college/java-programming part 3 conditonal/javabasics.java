// import java.util.*;

// public class javabasics {
//     public static void main(String[] args) {

//         // Scanner scnobj = new Scanner(System.in);
//         // String input1 = scnobj.next();

//         // //..........ques 1
//         // int a = 10 ;
//         // int b = 3;
//         // if( a>=b ){
//         //     System.out.println("a is the largest " +a);
//         //     System.out.println("hello world if");
//         // }
//         // else{
//         //     System.out.println("b is the largest "+b);
//         //     System.out.println("hellow world else");
//         // }

//         //...............ques 2
//         // Scanner scnobj = new Scanner(System.in);
//         // int num = scnobj.nextInt();
//         // if ( num%2==0){
//         //     System.out.println("given number is a even no. is "+num);
//         // }
//         // else{
//         //     System.out.println("given number is a not even no. is "+num);
//         // }

//         //...............my own ques for pratice
//         // Scanner scnobj = new Scanner(System.in);
//         // int age = scnobj.nextInt();
//         // if ( age >= 15 && age<=18){
//         //     System.out.println("school going student");
//         // }
//         // else if ( age >= 19 && age <=24 ){
//         //     System.out.println("student is college going");
//         // }
//         // else if ( age >= 25 && age <=55){
//         //     System.out.println("working professinal in its life");
//         // }
//         // else if ( age >= 56 ){
//         //     System.out.println("retired 1 and now enjoying a life");
//         // }
//         // else {
//         //     System.err.println("student is primary or secondry till now");
//         // }

//         //.................ques 3
//         // Scanner scnobj = new Scanner(System.in);
//         // float income = scnobj.nextFloat();
//         // int tax;
//         // if( income<500000 ){
//         //     tax = 0;
//         // }
//         // else if (income>500000 && income<1000000){
//         //      tax = (int)(income*(.2f));
//         //     }
//         // else{
//         //     tax = (int)(income*(.3f));
//         //     }
//         //     System.out.println("your tax is ="+tax);  
        
        
//         //.................ques 4
//         // Scanner scnobj = new Scanner(System.in);
//         // int a = scnobj.nextInt();
//         // int b = scnobj.nextInt();
//         // int c = scnobj.nextInt();
//         // if(a>b && a>c){
//         //     System.out.println("a is largest "+a);
//         // }
//         // else if(b>c && b>a){
//         //     System.out.println("b is largest "+b);
//         // }
//         // else {
//         //     System.out.println("c is largest "+c);
//         // }

//         //...............own ques for ternery operatpre
//         // Scanner scnobj = new Scanner(System.in);
//         // int num = scnobj.nextInt();
//         // String final_number = ((num%2)== 0) ? "its a even number is " : "its not a even number is ";
//         // System.err.println(final_number +num);

//         //.....................ques5
//         //  Scanner scnobj = new Scanner(System.in);
//         // float marks = scnobj.nextFloat();
//         // String decsion = (marks>=33)?"student is pass and its marks is " :"student is fail and its marks is ";
//         // System.out.println(decsion+marks);

//         //..................for switch statement
//         //  Scanner scnobj = new Scanner(System.in);
//         //  int num = scnobj.nextInt();
//         //  switch (num) {
//         //     case 1: {
//         //               System.out.println("1st class m hai");
//         //     }
//         //     break;
//         //     case 2: {
//         //         System.out.println("2nd class m hai");
//         //     }
//         //     break;
//         //     case 3: {
//         //         System.out.println("3rd class m hai");
//         //     }
//         //     break;
         
//         //     default:{
//         //         System.out.println("tu bhr nikl ja class s");
//         //     }


//         //........................calculatore switch problem ...ques6
//         //  Scanner scnobj = new Scanner(System.in);
//         //  System.out.println(" Enter Value of A : ");
//         //  int A = scnobj.nextInt();
//         //  System.out.println(" Enter Value of B : ");
//         //  int B = scnobj.nextInt();
//         //  System.out.println(" Enter Value of C : ");
//         //  int C = scnobj.nextInt();
//         //  System.out.println(" Enter Which Operaotr you want to use Now : ");
//         //  char Operatore = scnobj.next().charAt(0);
//         //  switch (Operatore) {
//         //     case '+' : {
//         //         System.out.println(A+B+C);
//         //     }   
//         //     break;

//         //     case '-' : {
//         //         System.out.println(A-B-C);
//         //     }   
//         //     break;

//         //     case '*' : {
//         //         System.out.println(A*B*C);
//         //     }    
//         //     break;

//         //     case '/' : {
//         //         System.out.println(A+B/C);
//         //     }    
//         //     break;

//         //     case '%' : {
//         //         System.out.println((A+B)%C);
//         //     }   
//         //     break;
         
//         //     default: {
//         //         System.out.println("Till Now  Calculatore is not that advance");
//         //     }
                
//         //  }
                
//          }
        
        
//......................................................................................................pass ques


import java.util.*;

public class javabasics {
    public static void main(String[] args) {

        // //..........ques-1
        // Scanner scnobj = new Scanner(System.in);
        // System.out.println("entered a num to check its positive or not here now");
        // float num = scnobj.nextFloat();
        // if(num>0){
        //     System.out.println("num is positive and its is : "+num);
        // }
        // else if (num<0){
        //     System.out.println("num is nagative and its is : "+num);
        // }
        // else if (num==0){
        //     System.out.println("num is on middle path means num is : "+num);
        // }
        // else{
        //     System.out.println("you eneterd something wrong means only +/- integer is allow to eneterd here");
        // }


        //.......ques--2
        // Scanner scnobj = new Scanner(System.in);
        // System.out.println("enterd a thermometer reading");
        // float tempreature_reading = scnobj.nextFloat();
        // if(tempreature_reading>100){
        //     System.out.println("You have a fewer");
        // }
        // else if(tempreature_reading<=100 && tempreature_reading>=96){
        //     System.out.println("You dont have a fewer");
        // }
        // else if(tempreature_reading<96){
        //     System.out.println("something is wrong with thermometer");
        // }
        // else {
        //     System.out.println("enterd correct range value to check ");
        // }

        //.........ques--3
        // Scanner scnobj = new Scanner(System.in);
        // System.out.println("Please a enerted a week number here OUT OF 1 TO 7 : ");
        // int week_number = scnobj.nextInt();
        // switch (week_number) {
           
        //     case 1:{
        //         System.out.println("Today is MONDAY");

        //     }    
        //     break;

        //     case 2:{
        //         System.out.println("Today is TUSDAY");
        //     }    
        //     break;

        //     case 3:{
        //         System.out.println("Today is WEDNESDAY");
        //     }    
        //     break;

        //     case 4:{
        //         System.out.println("Today is THRUSDAY");
        //     }    
        //     break;

        //     case 5:{
        //         System.out.println("Today is FRIDAY");
        //     }    
        //     break;

        //     case 6:{
        //         System.out.println("Today is SATURDAY");
        //     }    
        //     break;

        //     case 7:{
        //         System.out.println("Today is SUNDAY");
        //     }    
        //     break;
        
        //     default:{
        //         System.out.println("YOU ENTERD A WRONG / UNACCEPTABLE NUMBER");
        //     }
        
        // }


        //............QUES 4
        // int a=63,b=36;
        // boolean x= (a<b)?true:false;
        // int y= (a>b)?a:b;
        // System.out.println(x);
        // System.out.println(y);
        

        //............ques--5
        
    


    }
}





    

