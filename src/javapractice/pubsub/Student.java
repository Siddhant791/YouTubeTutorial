package javapractice.pubsub;

public class Student implements Subscriber{
    private String name;

    public Student(String name) {
        this.name = name;
    }

    @Override
    public void unsubscribe(Topic topic) {
        topic.getListOfSubscribers().remove(this);
    }

    @Override
    public void subscribe(Topic topic) {
        topic.getListOfSubscribers().add(this);
    }

    @Override
    public void update(String message) {
        System.out.println("Notification for " + name + ": " + message);
    }
}
