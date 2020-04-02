package decorator_pattern_web_page;

public abstract class WebPageDecorator implements WebPage {
    protected WebPage page;

    public WebPageDecorator(WebPage webpage){
        this.page = webpage;
    }
    public void display(){
        this.page.display();
        System.out.println("Decorator class display method called");
    }
}
