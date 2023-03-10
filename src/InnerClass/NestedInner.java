package InnerClass;

class Outer{
    int x = 10; // outer class memeber

    class Inner{ // inner class start

        int y = 20; // inner class memeber
        public void innerDisplay(){
            // inner class can access the memebr of outer class directlly
            System.out.println(x + " " + y);
        }

    }// inner class end

    // display method for Outer class

    public void outerDisplay(){
        Inner i = new Inner(); // creating a object of inner class
        i.innerDisplay();
        // the only to access the memeber of inner class form outer class will be by the object of inner class
        System.out.println(i.y);
    }

}



// main class
public class NestedInner {
    public static void main(String[] args) {

        Outer o = new Outer(); // object of outer class
        o.outerDisplay();

        // we can not create object of inner class outside of outer class
        // the only way to achiave to create the object of inner class
        // first need to create object of the outer class then from that
        // we create the object inner class

        Outer.Inner in = new Outer().new Inner();



    }
}
