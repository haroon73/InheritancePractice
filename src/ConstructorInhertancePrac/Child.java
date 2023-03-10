package ConstructorInhertancePrac;

public class Child extends Parent{

    public Child(){
        System.out.println("I am non param child constructor");
    }
    public Child(int y){
        System.out.println("I am 1 param child constructor " + y);
    }
    public Child(int x , int y){
        super(x);
        System.out.println("I am 2 param child constructor " + y);
    }
}
