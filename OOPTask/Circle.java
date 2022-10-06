package OOPTask;

import Utils.FiguresWithoutSides;

public class Circle implements FiguresWithoutSides {
    private String name = "OOPTask.Circle";
    private double radius = 5;
    final double PI = 3.14;

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void displayFigureName() {
        System.out.println("Figure is a " + getName());
    }

    @Override
    public void calculateFigureArea() {
        double area = PI * radius * radius;
        System.out.println("OOPTask.Circle Area is " + area);
    }

    @Override
    public void calculateFigurePerimeter() {
        double perimeter = 2 * PI * radius;
        System.out.println("OOPTask.Circle Perimeter is " + perimeter);
    }
}
