package Chain_of_responsibility;

public class ZeroProcessor implements Chain {
    private Chain nextInChain;

    public void setNext(Chain chain){
        this.nextInChain = chain;
    }

    public void process(Number request){
        if (request.getNumber() == 0) {
            System.out.println("ZeroProcessor : " + request.getNumber());
        }
        else {
            nextInChain.process(request);
        }
    };
}
