public class javabasics {

    // ..................ques no.1
    // ..................print no. in decreasing order
    // public static void printno(int n){
    // if(n==1){
    // System.out.println(n);
    // return ;
    // }
    // System.out.print(n+" ");
    // printno(n-1);
    // }

    // ..................ques no.2
    // ..................print no. in icreasing order
    // public static void printno(int n){
    // if(n==1){
    // System.out.print(n+" ");
    // return ;
    // };
    // printno(n-1);
    // System.err.print(n+" ");
    // }

    // ..................ques no.3
    // ..................print factorial of number n
    // public static int fct(int n){
    // if(n==1){
    // return 1;
    // }
    // int x= n*fct(n-1);
    // return x;
    // }

    // ..................ques no.4
    // ..................print sum of number n
    // public static int sum(int n){
    // if(n==1){
    // return 1;
    // }
    // int num=sum(n-1);
    // int x= n+num;
    // return x;
    // }

    // ..................ques no.5
    // ..................print fabnico series
    // public static int fbnth(int n){
    // if(n==0 || n==1){
    // return n;
    // }
    // return fbnth(n-1) + fbnth(n-2);
    // }

    // ..................ques no.6
    // ..................get confirmd is given array is sorted or not
    // public static boolean checksorted(int num[], int i){
    // if(i==num.length-1){
    // return true;
    // }
    // if(num[i]>num[i+1]){
    // return false;
    // }
    // return checksorted(num, i+1);
    // }
    // public static boolean checksorted(int num[], int i){
    //     if(i==num.length-1){
    //     return true;
    //     }
    //     if(num[i]<num[i+1] ||num[i]==num[i+1] ){
    //     return checksorted(num, i+1);
    //     }
    //     return false;
    //     }
    



    // ..................ques no.7
    // ..................find a key in array
    // public static int check(int arr[],int key,int i){
    // if(i==arr.length-1 && arr[i]!=key){
    // return -1;

    // }
    // if(arr[i]==key){
    // return i;
    // }
    // return check(arr, key, i+1);
    // }

    // ..................ques no.8
    // ..................find a key in array
    // ..................way 1st
    // public static int check(int arr[],int key,int i){
    // if(i==0 && arr[i]!=key){
    // return -1;
    // }
    // if(arr[i]==key){
    // return i;
    // }
    // return check(arr, key, i-1);
    // }

    // ..................ques no.8
    // ..................find a key in array
    // ..................way 2nd
    // public static int check(int arr[], int key, int i) {
    //     if (i == arr.length) {
    //         return -1;
    //     }
    //     int isfound = check(arr, key, i + 1);// .....1st go last till to catch -1 means now from last we start to check
    //                                          // like
    //     if (isfound == -1 && arr[i] == key) {
    //         return i;
    //     }
    //     return isfound;
    // }

    // ..................ques no.9
    // ..................find a^b now
    // public static int cal(int a, int b){
    // if(b==0){
    // return 1;
    // }
    // return a*cal(a,b-1);
    // }

    // ..................ques no.10
    // ..................find a^b now again
    // ..................way 1
    // public static int check(int b, int p) {
    //     if (p == 0) {
    //         return 1;
    //     }

    //     int halfpowersq = check(b, p / 2);
    //     halfpowersq = halfpowersq * halfpowersq; // ........now tc is log base 2 power n

    //     // if power p is odd
    //     if (p % 2 != 0) {
    //         halfpowersq = b * halfpowersq;
    //     }
    //     return halfpowersq;

    // }

    // ..................ques no.10
    // ..................find a^b now again
    // ..................way 2
    // public static int check(int b, int p) {
    //     if (p == 0) {
    //         return 1;
    //     }

    //     int halfpowersq = check(b, p / 2)*check(b, p / 2);// ........now tc is still linear

    //     // if power p is odd
    //     if (p % 2 != 0) {
    //         halfpowersq = b * halfpowersq;
    //     }
    //     return halfpowersq;

    // }

    // ..................ques no.11
    // ..................find tilling problem

    // trika 1
    // public static int tlb(int n){
    // if(n==0||n==1){
    // return 1;
    // }

    // //vertical chose
    // int fn1=tlb(n-1);
    // //hrz chose
    // int fn2=tlb(n-2);

    // int tlc=fn1+fn2;
    // return tlc;
    // }

    // trika2
    // public static int tlb(int n){
    // if(n==0||n==1){
    // return 1;
    // }
    // return tlb(n-1)+tlb(n-2);
    // }

    // ..................ques no.12
    // ..................remove duplicate from string
    // public static void reomve(String str,StringBuilder newstr,int i,boolean
    // arr[]){

    // if(i==str.length()){
    // System.out.println(newstr);
    // return ;
    // }
    // char cc=str.charAt(i);
    // if(arr[cc-'a']==true){
    // reomve(str,newstr,i+1,arr);
    // }
    // else{
    // arr[cc-'a']=true;
    // newstr=newstr.append(cc);
    // reomve(str,newstr,i+1,arr);
    // }
    // }

    // ..................ques no.13
    // ..................count ways

    // trika 1
    public static int count(int n){
    if(n==1||n==2){
    return n;
    }
    //choice
    //single choice
    int sc=count(n-1);
    //double choice
    int dc=(n-1)*count(n-2);//.......n sai ek [paire] + call for remn f(n-2) per wo ek pair bhi n-1 s possib;e h n 
    return sc+dc;
    }

    // trika2
    // public static int count(int n){
    // if(n==1||n==2){
    // return n;
    // }
    // return count(n-1)+(n-1)*count(n-2);
    // }

    // ...............ass ques 1
    // public static void fk(int arr[], int i,int key){
    // if(i==arr.length){
    // return ;
    // }
    // if(arr[i]==key){
    // System.out.print(i+" ");
    // }
    // fk(arr,i+1,key);
    // }

    // ................ass ques2
    // public static void spell(StringBuilder sb ,String arr[],String num,int i){
    // if(num==""){
    // return ;
    // }
    // if(i==num.charAt(i)){
    // System.out.print(sb.append(arr[num.charAt(i)])+" ");
    // }
    // spell(sb,arr,num,i+1);

    // }

    public static void main(String[] args) {

        // ..................ques no.1
        // ..................print no. in decreasing order
        // int n=10;
        // printno(n);

        // ..................ques no.2
        // ..................print no. in icreasing order
        // int n=10;
        // printno(n);

        // ..................ques no.3
        // ..................print factorial of number n
        // int n=4;
        // System.out.println(fct(n));

        // ..................ques no.4
        // ..................print sum of number n
        // int n=10;
        // System.out.print(sum(n));

        // ..................ques no.5
        // ..................print fabnico series
        // System.out.println(fbnth(0));
        // System.out.println(fbnth(1));
        // System.out.println(fbnth(2));
        // System.out.println(fbnth(3));
        // System.out.println(fbnth(4));
        // System.out.println(fbnth(5));
        // System.out.println(fbnth(6));
        // System.out.println(fbnth(7));
        // System.out.println(fbnth(8));
        // System.out.println(fbnth(9));

        // ..................ques no.6
        // ..................get confirmd is given array is sorted or not
        // int arr1[]={-34,-121,1,3,4,5,5,7,55,55,88};
        // System.out.println(checksorted(arr1,0));

        // ..................ques no.7
        // ..................find key from array
        // int arr1[]={9,1,3,7,1,1,2,2};
        // System.err.println(check(arr1, 9, 0));

        // ..................ques no.8
        // ..................find key from array
        // ..................way1
        // int arr[]={1,2,3,4,5,6,7,8,4,5,6,77,88};
        // System.out.println(arr.length);
        // System.err.println(check(arr, 5,arr.length-1));

        // ..................ques no.8
        // ..................find key from array
        // ..................way1
        // int arr[]={0,1,2,3,4,4,6,7};
        // System.out.println(arr.length);
        // System.err.println(check(arr, 4,0));

        // ..................ques no.9
        // ..................find key from array
        // System.out.println(cal(2, 5));

        // ..................ques no.10
        // ..................find a^b now again

        // ..................ques no.11
        // ..................find tilling problem
        // int n;
        // System.out.println(tlb(0));
        // System.out.println(tlb(1));
        // System.out.println(tlb(2));
        // System.out.println(tlb(3));
        // System.out.println(tlb(4));
        // System.out.println(tlb(5));

        // ..................ques no.12
        // ..................remove duplicate from string
        // String str="xxxxxxxxxyyyyyyyyyzzzzzzzzzzzz";
        // reomve(str,new StringBuilder(""),0,new boolean[26]);

        // ..................ques no.13
        // ..................ways prb
        // System.out.println(count(1));
        // System.out.println(count(2));
        System.out.println(count(3));
        // System.out.println(count(4));
        // System.out.println(count(5));

        // ...........ass ques1
        // int arr[]={1,2,3,3,4,4,7,6,8,9,22,45,22,11,4,3,5,4};
        // fk(arr, 0, 4);

        // ............ass ques2
        // String
        // arr[]={"zero","one","two","three","four","five","six","seven","eight","nine"};
        // String num= "2024";
        // spell(new StringBuilder(""),arr,num,0);

        // System.out.println(check(2, 10));
        

    }

}