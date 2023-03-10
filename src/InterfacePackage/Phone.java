package InterfacePackage;

import javax.net.ssl.SNIMatcher;

// This is a whole package of practice of interface
public class Phone {
    public void call(){
        System.out.println("Phone call");
    }
    public void sms(){
        System.out.println("Phone sendig SMS");
    }

}
// interface class which has two abstract method
interface ICamera{
    void click();
    void record();

}
// interface class which has two abstract method
interface IMusicPlayer{
    void play();
    void stop();
}


//SmartPhone class which extand from Phone class and impements two interfaces
class SmartPhone extends Phone implements ICamera ,IMusicPlayer{
    public void vedioCalling(){
        System.out.println("Smart Phone vedio calling");

    }
    public void click(){
        System.out.println("Smarth Phone Clicking Photo");
    }
    public void record(){
        System.out.println("Smarth phone recording vedio");
    }
    public void play(){
        System.out.println("Smart Phone playing Music");
    }
    public void stop(){
        System.out.println("Smart Phone Stop playing musice");
    }
}


// main method
 class SmartPhoneDriver{
     public static void main(String[] args) {

         // using same refernce name and object
         SmartPhone sm = new SmartPhone();
         sm.call();
         sm.click();
         sm.play();


         // can use other class or interfaces

         Phone sp = new SmartPhone();
         // only can use the methods that avaliable in Phone class


         // we can use interface as refeence but object create by implemnation class
         ICamera cn = new SmartPhone();





     }

}
