package decorator_pattern_shapes;

public abstract class ShapeBorderDecorator implements Shape{
    protected Shape decoratedShape;
    public ShapeBorderDecorator(Shape shape){
        this.decoratedShape = shape;
    }

    public void draw(){
        decoratedShape.draw();
    }
}
