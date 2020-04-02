package composite_pattern_package;

public class Song implements IComponent {
    String SongName;
    String artist;
    float speed;

    public Song(String SongName, String artist){
        this.SongName = SongName;
        this.artist = artist;
    }

    @Override
    public void play(){
        //play song
        System.out.println("Song, Artist:" + this.SongName +", " + this.artist + " played with speed " + this.speed);
    }

    @Override
    public void setPlaybackSpeed(float speed){
        this.speed = speed;
    }

    @Override
    public String getName() {
        return this.SongName; //return song name
    }

    public String getArtist(){
        return this.artist; // return artist
    }
}
