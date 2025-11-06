package javapractice.pubsub;

public interface Publisher {
    void publish(Topic topic, String message);
}
