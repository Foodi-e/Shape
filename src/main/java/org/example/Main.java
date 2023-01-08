package org.example;

abstract class Shape{
    public void displayName(){
        System.out.println(this.getClass().getSimpleName());
    }

}
class Circle extends Shape{

}
class Triangle extends Shape{

}
class Trapeze extends Shape{

}
class Rectangle extends Shape{

}
class Square extends Shape{

}

class DisplayShapeName{
    public void display(Shape shape){
        shape.displayName();
    }
}

public class Main {
    public static void main(String[] args) {
        DisplayShapeName displayShapeName = new DisplayShapeName();
        Circle circle = new Circle();
        Trapeze trapeze = new Trapeze();
        Square square = new Square();
        Rectangle rectangle = new Rectangle();
        Triangle triangle = new Triangle();

        displayShapeName.display(circle);
        displayShapeName.display(trapeze);
        displayShapeName.display(square);
        displayShapeName.display(rectangle);
        displayShapeName.display(triangle);
    }
}