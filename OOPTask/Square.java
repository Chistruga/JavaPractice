package OOPTask;

import Utils.FiguresWithSides;

public class Square extends FiguresWithSides {
    private String name = "OOPTask.Square";
    private int sideLength;
    final int NUMBER_OF_SIDES = 4;

    public int getNumberOfSides() {
        return NUMBER_OF_SIDES;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSideLength() {
        return sideLength;
    }

    public void setSideLength(int sideLength) {
        this.sideLength = sideLength;
    }

    public Square(int sideLength) {
        this.sideLength = sideLength;
    }

    @Override
    public void showFigureName() {
        System.out.println("Figure is a " + getName());
    }

    @Override
    public void calculateFigureArea() {
        int area = sideLength * sideLength;
        System.out.println("OOPTask.Square Area is " + area);
    }

    @Override
    public void calculateFigurePerimeter() {
        int perimeter = 2 * sideLength;
        System.out.println("OOPTask.Square Perimeter is " + perimeter);
    }

    @Override
    public void displaySideNumbers() {
        System.out.println("OOPTask.Square has " + getNumberOfSides() + " sides");
    }
}
