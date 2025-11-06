package javapractice.pubsub;

import java.util.ArrayList;
import java.util.List;

public class Topic {

    List<Subscriber> subscribers;
    String name;

    public Topic(String name){
        this.name = name;
        subscribers = new ArrayList<>();
    }

    public List<Subscriber> getSubscribers() {
        return subscribers;
    }

    public String getName() {
        return name;
    }

    public void publish(String message){
        for(Subscriber subscriber : subscribers){
            subscriber.update(message);
        }
    }
}
