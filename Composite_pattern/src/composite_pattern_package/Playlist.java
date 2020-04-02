package composite_pattern_package;

import java.util.ArrayList;

public class Playlist implements IComponent {
    String playlistName;
    public ArrayList<IComponent> playlist = new ArrayList();

    public Playlist(String playlistName){
        this.playlistName = playlistName;
    }

    @Override
    public void play(){
        //play
        System.out.println("Playlist: " + this.playlistName);

        if (playlist.isEmpty()) System.out.println("Playlist " + this.playlistName + "is empty");
        else playlist.forEach(component -> component.play());

        System.out.println("\n");
    }

    @Override
    public void setPlaybackSpeed(float speed){
        //set the speed
        if (playlist.isEmpty() != true) { //check if there are songs in the list
            playlist.forEach(component -> component.setPlaybackSpeed(speed));
        }
    }

    @Override
    public String getName() {
        return this.playlistName;
    }

    public void add(IComponent component){
        //add song/playlist to the current list
        this.playlist.add(component);
    }

    public void remove(IComponent component){
        //remove song/playlist from the current list
        this.playlist.remove(component);
    }
}
