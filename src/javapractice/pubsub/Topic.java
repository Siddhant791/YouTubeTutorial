package javapractice.pubsub;

import java.util.ArrayList;
import java.util.List;

public class Topic {
    private String name;
    List<Subscriber> listOfSubscribers;

    public Topic(String name) {
        this.name = name;
        this.listOfSubscribers = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public List<Subscriber> getListOfSubscribers() {
        return listOfSubscribers;
    }

    public void push(String message) {
        for(Subscriber subscriber : listOfSubscribers) {
            subscriber.update(message);
        }

    }
}
