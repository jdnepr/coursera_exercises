package decorator_pattern_web_page;

public class SettingsWebPage extends WebPageDecorator {

    public SettingsWebPage(WebPage decoratedPage){
        super(decoratedPage);
    }

    public void userSettings(){
        System.out.println("Displaying user settings");
    }

    public void display(){
        super.display();
        this.userSettings();
    }
}
