package decorator_pattern_web_page;

public class BasicWebPage implements WebPage {
    public String HTML = "";
    public String StyleSheet = "";
    public String Script = "";
    @Override
    public void display() {
        System.out.println("Render the HTML");
    }
}
