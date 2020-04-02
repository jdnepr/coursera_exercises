package Chain_of_responsibility;

public class Main {
    public static void main(String[] args) {

        Chain posProc = new PositiveProcessor();
        Chain negProc = new NegativeProcessor();
        Chain zeroProc = new ZeroProcessor();

        posProc.setNext(negProc);
        negProc.setNext(zeroProc);

        posProc.process(new Number(90));
        posProc.process(new Number(-50));
        posProc.process(new Number(0));
        posProc.process(new Number(91));
    }
}
