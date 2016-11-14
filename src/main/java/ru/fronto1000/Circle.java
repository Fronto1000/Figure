package ru.fronto1000;

public class Circle extends Figure implements Areable{
    private int radius;

    public Circle() {
        super();
        this.radius = this.DEFAULT_VALUE_1;
    }

    public Circle(int startDrawY, int startDrawX, int radius) {
        super(startDrawY, startDrawX);
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public double getArea() {
        return Math.PI*this.radius*this.radius;
    }
}
