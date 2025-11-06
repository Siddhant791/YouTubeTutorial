package javapractice.pubsub;

public class ArtsTeacher implements Publisher{

    String name;

    public ArtsTeacher(String name){
        this.name = name;
    }

    @Override
    public void publish(Topic topic, String message) {
        topic.publish(message);
    }
}
