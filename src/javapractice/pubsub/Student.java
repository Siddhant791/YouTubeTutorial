package javapractice.pubsub;

public class Student implements Subscriber{

    String name;

    public Student(String name){
        this.name = name;
    }

    @Override
    public boolean subscribeTopic(Topic topic) {
        return topic.getSubscribers().add(this);
    }

    @Override
    public boolean unsubscribeTopic(Topic topic) {
        return topic.getSubscribers().remove(this);
    }

    @Override
    public void update(String message) {
        System.out.println("Student " + name + " received message: " + message);
    }
}
