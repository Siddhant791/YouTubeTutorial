package javapractice.pubsub;

public interface Subscriber {
    public void subscribe(Topic topic);
    public void unsubscribe(Topic topic);
    public void update(String message);
}
