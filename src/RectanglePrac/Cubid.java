package RectanglePrac;

public class Cubid extends Rectangle {
    public int heigth;
    int x = 23;


    public Cubid(){
        heigth =1;
    }

    public  Cubid( int a , int b , int h){
super(a ,b);

        heigth = h;
    }

    public void displayH(){
        System.out.println("Printing x from super class " + super.x);
        System.out.println("Printing x from child class " + this.x);
    }


    public int volume(){
        return heigth * breath * length;
    }



}
