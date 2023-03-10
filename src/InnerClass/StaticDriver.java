package InnerClass;

class Otter{
    int x =10;
    static int y =20;

    static class    Myy{
        public void show(){
//            System.out.println(x ); // can not access other then static data type from static class
            System.out.println(y);
        }
    }
}




public class StaticDriver {
    public static void main(String[] args) {
//        Otter.Myy m = new Otter.Myy();
//        m.show();

        int num =8;

        switch (1){
            case 1:
                if(num == 1){
                    System.out.println("1");
                }
                else if(num == 2){
                    System.out.println("2");

                }
                else if(num == 3){
                    System.out.println("3");
                }
                else if(num == 4){
                    System.out.println("4");
                }

                break;


        }


        System.out.println("I am defult value");

    }

    }
