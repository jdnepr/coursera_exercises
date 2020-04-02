package decorator_pattern_web_page;

public class Main {

    public static void main(String[] args){
        WebPage mainPage = new BasicWebPage();
        mainPage.display();

        WebPage authPage = new AuthorizationWebPage(mainPage);
        WebPage settingsPage = new SettingsWebPage(mainPage);

        authPage.display();

        settingsPage.display();
    }
}
