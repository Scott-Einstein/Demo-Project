
public class Circle {
    // Modification1: Today is Friday
    private double radius;
    private double x;
    private double y;


    public double area() {
        return radius * radius * Math.PI;
    }

    public double perimeter() {
        return 2 * Math.PI * radius;
    }

    public void position() {
        System.out.printf("Position of the circle is (%.1f,%.1f)\n", x, y);
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        if (radius > 0) {
            this.radius = radius;
        }
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public Circle(double x, double y, double radius) {
        setX(x);
        setY(y);
        setRadius(radius);
    }


    @Override
    public String toString() {
        return String.format("radius = %.2f, x = %.2f, y = %.2f\n", getRadius(), getX(), getY());
    }

    public double distanceToOrigin() {
//        return Math.sqrt(getX() * getX() + getY() * getY());
        return Math.sqrt(x * x + y * y);
    }

    public void printHelloWorld() {
        System.out.println("Hello world!");
    }
}
