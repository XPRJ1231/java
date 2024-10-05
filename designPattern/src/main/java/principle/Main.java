package principle;

public class Main {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(5, 3);
        Circle circle = new Circle(5);
        Square square = new Square(5);

        AreaCalculator areaCalculator = new AreaCalculator();
        PerimeterCalculator perimeterCalculator = new PerimeterCalculator();

        double rectangleArea = areaCalculator.calculateArea(rectangle);
        double perimeterArea = perimeterCalculator.calculatePerimeter(rectangle);
        System.out.printf("Rectangle area and perimeter: %.2f, %.2f\n", rectangleArea, perimeterArea);

        double circleArea = areaCalculator.calculateArea(circle);
        double circlePerimeter = perimeterCalculator.calculatePerimeter(circle);
        System.out.printf("Circle area and perimeter: %.2f, %.2f\n", circleArea, circlePerimeter);

        double squareArea = areaCalculator.calculateArea(square);
        double squarePerimeter = perimeterCalculator.calculatePerimeter(square);
        System.out.printf("Square area and perimeter: %.2f, %.2f\n", squareArea, squarePerimeter);
    }
}
