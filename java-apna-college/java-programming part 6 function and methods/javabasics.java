
public class javabasics {

    public static boolean isPrime(int n) {

        // corner case 
        if(n==2){
            return true;
        }

        // boolean isprime=true; // pura hta do isko to frr direct vlaue return krdo n
        for(int i=2; i<n; i++){
         if(n%i == 0){
            // isprime=false; // no neeeds this a lot meams se
            return false;
            // break; // we can directly here return
            // return isprime;
         } ;
        }
    return true;
        
    }

    public static boolean isPrime2(int n) {

         
        if(n==2){
            return true;
        }

        for(int i=2; i<Math.sqrt(n); i++){
         if(n%i == 0){
            return false;
         }

        }

    return true;
        
    }

    public static void checkinrangeprime(int n){
        for ( int i =2; i<=n; i++){
        
            if (isPrime2(i)){
                System.out.print(i);    
        }
        System.out.println();

    }
}

  
  

    
  

   



    



   
   

    








    public static void main(String[] args) {
    //   System.out.println(isPrime(18));
    //   System.out.println(isPrime2(25));
    // checkinrangeprime(10);


    int x=28;
    int y=2;
   
    System.out.println( Math.min(x, y)  );
    System.out.println( Math.max(x, y) );
    System.out.println( Math.sqrt(x)  );
    System.out.println( Math.pow(x, y) );
    System.out.println( Math.log(x) );
    System.out.println( Math.log10(x) );
    System.out.println( Math.log1p(x) );
    System.out.println(Math.exp(y));
    
   
}
}