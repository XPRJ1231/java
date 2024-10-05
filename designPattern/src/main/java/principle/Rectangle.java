package principle;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Rectangle implements Shape {

    private double width;
    private double height;

    @Override
    public double getArea() {
        return width * height;
    }

    @Override
    public double getPerimeter() {
        return 2 * (width + height);
    }
}
