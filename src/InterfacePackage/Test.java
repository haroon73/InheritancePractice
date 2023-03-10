package InterfacePackage;

// defination of interface of Test
public interface Test {
    void meth1();
    void meth2();
}

// this is implemts of interfce Test where you must define each methods
class My implements Test{

    @Override
    public void meth1() {
        System.out.println("My implemnt  Meth1");
    }

    @Override
    public void meth2() {
        System.out.println("My implemnt Meth2");

    }
    public void meth3(){
        System.out.println("My implemnt Meth3");
    }
}


class InterfaceImpl{
    public static void main(String[] args) {

//        Test t = new Test(); you can create reference of interface but you can not create object of it.


        Test tt = new   My();
        tt.meth1();
        tt.meth2();
        // we can find the third method which is declare and define in My implemnt to find that we
        // must create refercne of my
        My m = new My();
        m.meth3();

    }
}
