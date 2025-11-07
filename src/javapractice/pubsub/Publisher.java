package javapractice.pubsub;

public interface Publisher {
    void publish(String message, Topic topic);
}
