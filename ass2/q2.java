class Pointx {
    int xCo, yCo;
    public Pointx(int xCo, int yCo) {
        this.xCo = xCo;
        this.yCo = yCo;
    }
    public void printPoint() {
        System.out.println("(" + xCo + ", " + yCo + ")");
    }
}
class Circle extends Pointx {
    int radius;

    public Circle(int xCo, int yCo, int radius) {
        super(xCo, yCo);
        this.radius = radius;
    }

    public void printCircle() {
        super.printPoint();
        System.out.println("Radius: " + radius);
    }

    public void printArea() {
        System.out.println("Area: " + (3.1415 * radius * radius));
    }
}

class Cylinder extends Circle{
    int height;

    public Cylinder(int xCo, int yCo, int radius, int height) {
        super(xCo, yCo, radius);
        this.height = height;
    }

    public void printArea() {
        System.out.println("Area: " + ((2 * 3.1415 * radius * height) + (2 * 3.1415 * radius * radius)));
    }
    public void printVolume() {
        System.out.println("Area: " + (3.1415 * radius * radius * height));
    }
}