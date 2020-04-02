package decorator_pattern_web_page;

public class AuthorizationWebPage extends WebPageDecorator {

    public AuthorizationWebPage(WebPage decoratedPage){
        super(decoratedPage);
    }

    public void authorizeUser(){
        System.out.println("Authorizing user");
    }

    public void display(){
        super.display();
        this.authorizeUser();
    }

}
