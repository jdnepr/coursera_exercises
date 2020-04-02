package decorator_pattern_shapes;

public class Main {
    public static void main(String[] args) {

        Shape circle = new Circle();

        Shape redCircle = new RedShapeBorderDecorator(new Circle());

        Shape redRectangle = new RedShapeBorderDecorator(new Rectangle());
        System.out.println("Circle with normal border");
        circle.draw();

        System.out.println("\nCircle of red border");
        redCircle.draw();

        System.out.println("\nRectangle of red border");
        redRectangle.draw();
    }
}
