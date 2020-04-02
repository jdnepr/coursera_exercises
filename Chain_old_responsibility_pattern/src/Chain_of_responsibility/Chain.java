package Chain_of_responsibility;
/*
Handler interface
This can be an interface which will primarily recieve the request and dispatches the request to chain of handlers.
It has reference of only first handler in the chain and does not know anything about rest of the handlers.
 */
public interface Chain {
    public abstract void setNext(Chain nextInChain);
    public abstract void process(Number request);
}
