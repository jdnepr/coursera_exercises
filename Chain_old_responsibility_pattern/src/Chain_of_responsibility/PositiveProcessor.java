package Chain_of_responsibility;

public class PositiveProcessor implements Chain {
    private Chain nextInChain;

    public void setNext(Chain chain){
        this.nextInChain = chain;
    }

    public void process(Number request){
        if (request.getNumber() > 0) {
            System.out.println("PositiveProcessor : " + request.getNumber());
        }
        else {
            nextInChain.process(request);
        }
    };
}
