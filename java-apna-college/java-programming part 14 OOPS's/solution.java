import java.util.*;

class complex{
         int real;
         int img;
         
    
         //..........constructore dont have a any return type
         //..........no need for static bcz its call by default during creatig the object 
         //.........default constructore
         //..........its use during creating object if we dont pass anthing during calling constructore
         public complex(){
    
         }
    
         //..........constructore dont have a any return type
         //..........no need for static bcz its call by default during creatig the object 
         //............parametrized constructore
         //............its use if we pass a parameter during creating the object
         public complex(int r, int i){
            this.real=r;
            this.img=i;
         }
     
         //......public is why so anywhere we can acces to this fun , 
         //......static is why , so dont need to creat its object
         //......complex here show its type means that fun gives a complex type
         //......means is a user defined types now is complex
         //......in each fun we need to creat the objec because at the end we need to store that creal , img part....resultant value is also acomplex so need to store into a object
         public static complex add(complex a , complex b){
            complex c =new complex(0,0);
            c.real=a.real+b.real;
            c.img=a.img+b.img;
            return c;
         }
    
         //......public is why so anywhere we can acces to this fun , 
         //......static is why , so dont need to creat its object
         //......complex here show its type means that fun gives a complex type
         //......means is a user defined types now is complex
         //......in each fun we need to creat the objec because at the end we need to store that creal , img part....resultant value is also acomplex so need to store into a object
         public static complex sub(complex a, complex b){
            complex c =new complex(0,0);
            c.real=a.real-b.real;
            c.img=a.img-b.img;
            return c;
         }
    
         //......public is why so anywhere we can acces to this fun , 
         //......static is why , so dont need to creat its object
         //......complex here show its type means that fun gives a complex type
         //......means is a user defined types now is complex
         //......in each fun we need to creat the objec because at the end we need to store that creal , img part....resultant value is also acomplex so need to store into a object
         public static complex mul(complex a, complex b){
            complex c =new complex(0,0);
            c.real=a.real*b.real-a.img*b.img;
            c.img=a.real*b.img+a.img*b.real;
            return c;
         }
         
          public void printcomplex(){
            if(real==0&&img!=0){
                System.err.println(img+"i");
            }
            else if(real!=0&&img==0){
                System.out.println(real);
            }
            else{
                System.out.println(real +"+"+img+"i");
            }
           
          }
    
      }

public class solution{
    public static void main(String[] args) {
        complex a = new complex(7,8);
        complex b = new complex(2,5);
        complex m = complex.add(a,b);
        m.printcomplex();
        complex n = complex.sub(a,b);
        n.printcomplex();
        complex o = complex.mul(a,b);
        o.printcomplex();
        
    }
}















    

