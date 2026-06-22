package Abstraction;

abstract class Shape {
    private String colour;

   abstract public double getArea();
}

class Circle extends Shape{
    private double radius;

    public Circle(double radius){
        this.radius=radius;
    }

    public double getArea(){
        return Math.PI*radius*radius;
    }
}

class Rectangle extends Shape{
    private double side;

    public Rectangle(double side){
        this.side=side;
    }

    public double getArea(){
        return side*side;
    }
}

class MainX{
    public static void main(String[] args) {
        Circle C = new Circle(7.0);
        Rectangle R1 = new Rectangle(4.0);

        System.out.println("Area os circle is :"+C.getArea());
        System.out.println("Area of rectangle is :"+R1.getArea());
    }
}

