package ru.fronto1000;

public class Program {
    public static void main(String[] args) {
        Areable square = new Square();
        Areable circle = new Circle();
        Areable rectangle = new Rectangle();
        Areable[] arrayFigure = new Areable[3];
        arrayFigure[0] = square;
        arrayFigure[1] = circle;
        arrayFigure[2] = rectangle;

        for(int i = 0; i < arrayFigure.length; i++){
            System.out.println(arrayFigure[i].getArea());
        }
    }
}
