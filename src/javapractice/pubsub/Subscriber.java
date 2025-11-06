package javapractice.pubsub;

public interface Subscriber {
    boolean subscribeTopic(Topic topic);
    boolean unsubscribeTopic(Topic topic);
    void update(String message);
}
