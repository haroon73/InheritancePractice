package overriding;

public class DySuper {

    public void meth1(){
        System.out.println("Super meth1");
    }
    public  void meth2(){
        System.out.println("Super Meth2");
    }
}

class DySub extends DySuper{
    public  void meth2(){
        System.out.println("Sub Meth2");
    }
    public void meth3(){
        System.out.println("Sub Meths3");
    }
}

class DyImp{
    public static void main(String[] args) {

        DySuper sup = new DySub();

        // when it will run only call DySuper methods
        sup.meth1();
        sup.meth2();

        DySub s= new DySub();
        s.meth1(); // this method will be take from Dysuper class
        s.meth2();  // this method will be take from DySub class and DySuper class meth2 wiul be shadow out
        s.meth3();


    }
}
