package observer_pattern_package;

public class Main {

    public static void main(String[] args) {
        Channel funnyCatsYoutubeChannel = new Channel("FUNNY CAT VIDEO");
        Follower monica = new Follower("Monica");
        Follower peter = new Follower("Peter");
        Follower silvia = new Follower("Silvia");

        funnyCatsYoutubeChannel.registerObserver(monica);
        funnyCatsYoutubeChannel.registerObserver(peter);
        funnyCatsYoutubeChannel.registerObserver(silvia);

        funnyCatsYoutubeChannel.setStatus("update_1");

        funnyCatsYoutubeChannel.removeObserver(silvia);

        funnyCatsYoutubeChannel.setStatus("update_2");




    }
}
