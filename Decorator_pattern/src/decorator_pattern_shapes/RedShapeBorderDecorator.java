package decorator_pattern_shapes;

public class RedShapeBorderDecorator extends ShapeBorderDecorator {

    public RedShapeBorderDecorator(Shape decoratedShape){
        super(decoratedShape);
    }

    @Override
    public void draw() {
        super.draw();
        setRedBorder(decoratedShape);
    }

    private void setRedBorder(Shape decoratedShape){
        System.out.println("Border Color: Red");
    }
}
