package State_pattern_package;
//https://howtodoinjava.com/design-patterns/behavioral/state-design-pattern/
public class Main {

    public static void main(String[] args)
    {
        DeliveryContext ctx = new DeliveryContext(null, "Test123");

        ctx.update();
        ctx.update();
        ctx.update();
        ctx.update();
        ctx.update();
    }
}
