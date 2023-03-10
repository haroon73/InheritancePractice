package overriding;
class TV{
    public void switchON(){
        System.out.println("TV is Switched ON");

    }
    public void changeChannel(){
        System.out.println("TV channel is Changed");
    }
}

class  SmarthTV extends TV{
    @Override
    public void switchON() {
        System.out.println("Smart TV is Switched ON");
    }
    public void changeChannel(){
        System.out.println("Smart TV Channel is Changed");
    }
    public void browser(){
        System.out.println("Smart TV Browsing");
    }
}


public class Overriding {
    public static void main(String[] args) {

//        Super sup = new Super();
//
//        sup.display();
//
//        Sub sb = new Sub();//
//        sb.display(); // when call display method the method in Super class will be shadow out and
//                     // it will call method of Sub class. this is called overriding


        // lets try different explame

//        Super supe = new Sub(); //  we are using Super class as reference and Sub class as object
//                               // so when we call the display method from which class the method will be called
//
//        supe.display(); // It will be calling object method which is Sub class and it will not call the reference
//                       // which is Super class. this method is call dynmic nethod disptch in java.
//                       // we achive method overrinding we need to use ihertaince.


         ///*************************??????///////

//        TV t = new TV();
//        t.switchON();
//        t.changeChannel();

        // lets create Smart TV object

//        SmarthTV tv = new SmarthTV();
//        tv.switchON();  // this method will ovrriding the TV method
//        tv.browser();

        //  Let s check

        TV tt = new SmarthTV();
         tt.switchON();   // we call the method of obejct which is Smart Tv
//         tt.browser();   we cant call the cub class method that is not avaliabe in Super class









    }
}
