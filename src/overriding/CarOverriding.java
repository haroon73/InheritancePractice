package overriding;

class Car{
    public void start(){
        System.out.println("The car started");
    }
    public void accelert(){
        System.out.println("Car is Accelerated");
    }
    public void changeGear(){
        System.out.println("Car Gear cgnaged");
    }

}

class LuxCar extends Car{
    public void changeGear(){
        System.out.println("Automatic Gear");
    }
    public void openRoof(){
        System.out.println("Sun Roof is Opened");
    }
}







public class CarOverriding {
    public static void main(String[] args) {


        Car cc = new Car();
        LuxCar lc = new LuxCar();

        cc.start();
        cc.accelert();
        lc.changeGear();
        lc.openRoof();




    }
}
