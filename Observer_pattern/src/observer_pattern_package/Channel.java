package observer_pattern_package;

import java.util.ArrayList;

public class Channel implements Subject {

    ArrayList<Observer> observerList = new ArrayList<Observer>();
    String channelName;
    String status;

    public Channel(String name){
        this.channelName = name;
        this.status = "update_0";
    }

    public void registerObserver(Observer observer){
        this.observerList.add(observer);
    };
    public void removeObserver(Observer observer){
        this.observerList.remove(observer);
    };
    public void notifyObservers(){
        observerList.forEach(observer -> observer.update(channelName, status));
    };

    public String getStatus(){
        return this.status;
    }

    public void setStatus(String newStatus){
        this.status = newStatus;
        notifyObservers();
    }
}
