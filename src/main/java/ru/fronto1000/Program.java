package ru.fronto1000;

public class Program {
    public static void main(String[] args) {
        Square square = new Square();
        Circle circle = new Circle();
        Rectangle rectangle = new Rectangle();
        System.out.println(square.getArea());
        System.out.println(circle.getArea());
        System.out.println(rectangle.getArea());
    }
}
