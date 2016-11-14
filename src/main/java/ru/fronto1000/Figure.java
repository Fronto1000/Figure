package ru.fronto1000;

abstract class Figure {

    protected final int DEFAULT_VALUE_1 = 10;
    protected final int DEFAULT_VALUE_2 = 20;

    protected int startDrawX;
    protected int startDrawY;

    public Figure(){
        this.startDrawX = 0;
        this.startDrawY = 0;
    }
    public Figure(int startDrawY, int startDrawX) {
        this.startDrawY = startDrawY;
        this.startDrawX = startDrawX;
    }

    public int getStartDrawX() {
        return startDrawX;
    }

    public void setStartDrawX(int startDrawX) {
        this.startDrawX = startDrawX;
    }

    public int getStartDrawY() {
        return startDrawY;
    }

    public void setStartDrawY(int startDrawY) {
        this.startDrawY = startDrawY;
    }
}
