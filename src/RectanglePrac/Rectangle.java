package RectanglePrac;

public class Rectangle {
    public int length;
    public int breath;
    public int x =90;

    public Rectangle(){
        length=breath=1;
    }


    public Rectangle(int length , int breath){
       this.length = length;
        this.breath= breath;
    }
    public void display(){
        System.out.println("length : " + this.length);
        System.out.println("Breath :" + this.breath);
    }



}
