package abstractPackage;


// this is abstract class which has undefined abstract methods which doesnt have a body for implrmnation
// so abstract class only provide standardization for implemntation of abstract class we must use concert classess
abstract class Shape {
    abstract double perimeters(); // abstract method which is undefined
    abstract double area(); //  abstract method which is undefined
    public void display(){
        System.out.println("Display from Shape class");
    }

}


// concerte class of sub class of abstract class Shape which must implement all the methods of abstract class otherwise
// it will be also called abastract class.
class Circle extends Shape{
    double radius;  // members feild of sub class

    public Circle(double radius){ // constrcutor of sub class which has one perma
        this.radius = radius;
    }

    public double perimeters(){ // defineing abstract method of abstract class
        return 2.0*Math.PI*radius;
    }
    public double area(){ //  defining of abstract methof of abstract class
        return Math.PI *radius*radius;
    }
    public void display(){
        System.out.println("Display from Circle sub class");
    }
}


// concorter or sub class which inhertance form Shape class which is Super Abstract class
class Rectangle extends Shape{
    double length;
    double breath;
    public Rectangle(double length , double breath){ // constrcutor
        this.length = length;
        this.breath = breath;
    }

    public double perimeters(){ // defining abstract method of abstract class
        return 2*(length +breath);
    }
    public double area(){  // defining abstract method of abstract class
        return length * breath;
    }
}

class ShapeImp{
    public static void main(String[] args) {


        Shape s; // can create the refernce of abstract class but can not create the object
        Shape s1 = new Circle(4.5f); // can use abstract class as refernce then create object from concert or sub class
        System.out.println("The perimeter of the circle is " + s1.perimeters());
        System.out.println("The area of circle is " + s1.area());
        s1.display();

        s1 = new Rectangle(3.4f , 4.5f);
        System.out.println("The perimeter of rectangle is " + s1.perimeters());
        System.out.println("The area of rectangle is " + s1.area());
        s1.display();


    }
}
