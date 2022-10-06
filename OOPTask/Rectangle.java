package OOPTask;

import Utils.FiguresWithSides;

public class Rectangle extends FiguresWithSides {
    private String name = "OOPTask.Rectangle";
    private int length;
    private int width;
    final int NUMBER_OF_SIDES = 4;

    public Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getNUMBER_OF_SIDES() {
        return NUMBER_OF_SIDES;
    }

    @Override
    public void showFigureName() {
        System.out.println("Figure is a " + getName());
    }

    @Override
    public void calculateFigureArea() {
        int area = length * width;
        System.out.println("OOPTask.Rectangle Area is " + area);
    }

    @Override
    public void calculateFigurePerimeter() {
        int perimeter = (2 * length) + (2 * width);
        System.out.println("OOPTask.Rectangle Perimeter is " + perimeter);
    }

    @Override
    public void displaySideNumbers() {
        System.out.println("OOPTask.Rectangle has " + getNUMBER_OF_SIDES() + " sides");
    }
}
