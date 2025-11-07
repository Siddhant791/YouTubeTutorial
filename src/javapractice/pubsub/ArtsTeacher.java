package javapractice.pubsub;

public class ArtsTeacher implements Publisher{
    @Override
    public void publish(String message, Topic topic) {
        // Teacher is writing on the notice board
        topic.push(message);
    }
}
