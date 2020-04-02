package Chain_of_responsibility;
/* Concrete Handler
These are actual handlers of the request chained in some sequential order.
 */
public class NegativeProcessor implements Chain {
    private Chain nextInChain;

    public void setNext(Chain chain){
        this.nextInChain = chain;
    }

    public void process(Number request){
        if (request.getNumber() < 0) {
            System.out.println("NegativeProcessor : " + request.getNumber());
        }
        else {
            nextInChain.process(request);
        }
    };
}
