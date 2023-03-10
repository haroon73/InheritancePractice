package abstractPackage;

 abstract class SuperAb {

    public SuperAb(){
        System.out.println("Super Constructor");
    }
    public void meth1(){
        System.out.println("Meth1 of Super");
    }

    abstract void meth2();
}

class Sub extends SuperAb{
     public void meth2(){
         System.out.println("Meth2 of sub class");
     }
}
class AbstrctImp{
    public static void main(String[] args) {


        SuperAb s = new Sub();
        s.meth1();
        s.meth2();


    }
}
