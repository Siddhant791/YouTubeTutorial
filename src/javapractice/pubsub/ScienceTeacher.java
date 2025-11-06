package javapractice.pubsub;

public class ScienceTeacher implements Publisher{

    String name;

    public ScienceTeacher(String name){
        this.name = name;
    }

    @Override
    public void publish(Topic topic, String message) {
        topic.publish(message);
    }
}
