class Circle
{
    double radius;
    double centerX;
    double centerY;

    // constructor
    Circle(double r, double x, double y)
    {
        radius = r;
        centerX = x;
        centerY = y;
    }

    double area()
    {
        return Math.PI * radius * radius;
    }

    double perimeter()
    {
        return 2 * Math.PI * radius;
    }

    boolean isInside(double x, double y)
    {
        double distance = Math.sqrt(
            (x - centerX) * (x - centerX) +
            (y - centerY) * (y - centerY)
        );
        return distance <= radius;
    }

    public static void main(String[] args)
    {
        Circle c = new Circle(5, 0, 0);

        System.out.println("Area of circle = " + c.area());
        System.out.println("Perimeter of circle = " + c.perimeter());

        if (c.isInside(3, 4))
            System.out.println("Point is inside the circle");
        else
            System.out.println("Point is outside the circle");
    }
}