package Inhertance;

import Inhertance.Circle;

public class Cylinder extends Circle {

    public double height;

    public double volume(){return area() * height;}
}
