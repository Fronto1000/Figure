package ru.fronto1000;

public class Square extends Figure implements Areable{
    private int side;

    public Square() {
        super();
        this.side = this.DEFAULT_VALUE_1;
    }

    public Square(int startDrawY, int startDrawX, int side) {
        super(startDrawY, startDrawX);
        this.side = side;
    }

    public int getSide() {
        return side;
    }

    public void setSide(int side) {
        this.side = side;
    }

    public double getArea() {
        return this.side*this.side;
    }
}
