package InnerClass;
interface Mmy{
    public void show();
}

abstract class My{
    abstract public void show();
}
class Outter{
    public void display(){
//        class INnner{ // This is local class which created inside method display in Outter class
//            public void show(){
//                System.out.println("Hello");
//            }
//        }
//        INnner i = new INnner(); // creating object of Inner class
//        i.show(); // calling a method
//        new INnner().show(); // anonymous class object it will work too

        ////*************///

        // implmenting the abstract method of my class or anonymous class
//        My n = new My(){public void show(){
//            System.out.println("Hello");
//        }};
//        n.show();

        // creating object interfce anonymou
        My n = new My(){public void show(){
            System.out.println("Hello");
        }};
        n.show();
    }
}



public class LocalInner {
    public static void main(String[] args) {
        Outter o = new Outter(); // create the object of Outter class
        o.display(); // calling method but the message of local Inner class will be print it
    }
}
