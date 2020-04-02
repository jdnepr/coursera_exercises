package observer_pattern_package;

public class Follower implements Observer {
    private String FollowerName;

    public Follower(String name){
        this.FollowerName = name;
    }

    public void update(String string, String status){
        System.out.println(this.FollowerName + ": " + "Channel " + string + " has an " + status + "!");
    };

    public void play(){};
}
