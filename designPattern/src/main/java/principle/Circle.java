package principle;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Circle implements Shape {
    private double radius;

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }
}
