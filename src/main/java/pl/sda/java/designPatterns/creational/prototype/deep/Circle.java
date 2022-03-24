package pl.sda.java.designPatterns.creational.prototype.deep;

public class Circle extends Shape{
    public int radius;

    public Circle() {
    }

    public Circle(Circle target) {
        super(target);
        if (target != null) {
            this.radius = target.radius;
        }
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    @Override
    public Circle clone() {
        return new Circle(this);
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                "Point=" + centralPoint +
                "color=" + color +
                '}';
    }
}