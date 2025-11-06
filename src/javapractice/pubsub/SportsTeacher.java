package javapractice.pubsub;

public class SportsTeacher implements Publisher{

    String name;

    public SportsTeacher(String name){
        this.name = name;
    }

    @Override
    public void publish(Topic topic, String message) {
        topic.publish(message);
    }
}
