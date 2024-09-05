public class Javabasics{

    public static void main(String[] args) {
     
        Pen p1 = new Pen();
        // System.out.println( p1.color);
        // p1.changeColor("red");
        // System.out.println( p1.color);
        // System.out.println(p1.color="green");

        // System.out.println(p1.penShap);
        // p1.changeShape("square");
        
        Banckaccount sbi=new Banckaccount();
        // sbi.pwd=1223344;
        // System.out.println(pwd);
        // System.out.println(sbi.pwd);//..........not workig
        System.out.println(sbi.get());

        sbi.set(1234);
        System.out.println(sbi.get());

        //....check can we do both things by get
        System.out.println(p1.set(5));

        //.............construtcutre
        dbz cartoon = new dbz("goku","vegeta");
        System.out.println(cartoon.hero1);
        System.out.println(cartoon.hero2);
    }
}


class Pen{
    
    String color;
    private int penTip;
    private String penShap;

    void changeColor(String newColor){
        color=newColor;
    }
    int set(int newTip){
        this.penTip=newTip;
        return penTip;
    }
    public void setShape(String newShap){
        penShap=newShap;
    }

}


class Banckaccount{
    String username;
    private int pwd=8954;
//set
    public void set(int num){
        this.pwd=num;
       
    }
//get
    public int get(){
       return this.pwd;
    }
}


class dbz {
    String hero1;
    String hero2;
    
    dbz (String hero1, String hero2){
        this.hero1=hero1;
        this.hero1=hero1;

    }
}