package ru.fronto1000;

public class Rectangle extends Figure implements Areable{
    private int lowerSide;
    private int greaterSide;

    public Rectangle() {
        super();
        this.lowerSide = this.DEFAULT_VALUE_1;
        this.greaterSide = this.DEFAULT_VALUE_2;
    }

    public Rectangle(int startDrawY, int startDrawX, int greaterSide, int lowerSide) {
        super(startDrawY, startDrawX);
        this.greaterSide = greaterSide;
        this.lowerSide = lowerSide;
    }

    public int getLowerSide() {
        return lowerSide;
    }

    public void setLowerSide(int lowerSide) {
        this.lowerSide = lowerSide;
    }

    public int getGreaterSide() {
        return greaterSide;
    }

    public void setGreaterSide(int greaterSide) {
        this.greaterSide = greaterSide;
    }

    public double getArea() {
        return this.lowerSide*this.greaterSide;
    }
}
