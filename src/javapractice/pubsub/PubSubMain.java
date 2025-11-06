package javapractice.pubsub;

public class PubSubMain {
    public static void main(String[] args) {
        System.out.println("In Pub sub main method");

        Publisher scienceTeacher = new ScienceTeacher("Mr. Smith");
        Publisher artsTeacher = new ArtsTeacher("Ms. Johnson");
        Publisher sportsTeacher = new SportsTeacher("Coach Brown");

        Topic scienceTopic = new Topic("Science");
        Topic artsTopic = new Topic("Arts");
        Topic sportsTopic = new Topic("Sports");

        Subscriber student1 = new Student("student1");
        Subscriber student2 = new Student("student2");
        Subscriber student3 = new Student("student3");

        student1.subscribeTopic(sportsTopic);
        student2.subscribeTopic(scienceTopic);
        student3.subscribeTopic(scienceTopic);
        student3.subscribeTopic(artsTopic);

//        sportsTeacher.publish(sportsTopic, "Sports event on Friday!");
        scienceTeacher.publish(scienceTopic, "Science fair next week!");
//        artsTeacher.publish(artsTopic, "Art exhibition this weekend!");

        student3.unsubscribeTopic(scienceTopic);
        student2.unsubscribeTopic(scienceTopic);
//        student1.subscribeTopic(scienceTopic);

        scienceTeacher.publish(scienceTopic, "New science project assigned.");


    }
}
