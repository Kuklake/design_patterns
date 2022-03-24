package pl.sda.java.designPatterns.creational.prototype.deep;

import pl.sda.java.designPatterns.creational.prototype.Point;

public abstract class Shape {
    protected Point centralPoint;
    protected String color;

    public Point getCentralPoint() {
        return centralPoint;
    }

    public void setCentralPoint(Point centralPoint) {
        this.centralPoint = centralPoint;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Shape() {
    }

    public Shape(Shape target) {
        if (target != null) {
            this.centralPoint = new Point(target.centralPoint.getX(), target.centralPoint.getY());
            this.color = target.color;
        }
    }

    public abstract Shape clone();
}
