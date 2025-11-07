package javapractice.pubsub;

public class PubSubMain {
    public static void main(String[] args) {
        System.out.println("In PubSubMain");

        // Publishers: Teachers
        Publisher sportsTeacher = new SportsTeacher();
        Publisher artsTeacher = new ArtsTeacher();
        Publisher scienceTeacher = new ScienceTeacher();

        // Topics: Notice Boards
        Topic sportsNoticeBoard = new Topic("Sports Notice Board");
        Topic artsNoticeBoard = new Topic("Arts Notice Board");
        Topic scienceNoticeBoard = new Topic("Science Notice Board");

        // Subscribers: Students
        Subscriber student1 = new Student("Student1");
        Subscriber student2 = new Student("Student2");
        Subscriber student3 = new Student("Student3");

        student1.subscribe(sportsNoticeBoard);
        student2.subscribe(scienceNoticeBoard);
        student3.subscribe(artsNoticeBoard);
        student3.subscribe(scienceNoticeBoard);

        // Teachers publish messages
        sportsTeacher.publish("4 o clock there is kho kho practice ", sportsNoticeBoard);
        artsTeacher.publish("Art exhibition on Friday", artsNoticeBoard);
        scienceTeacher.publish("Science quiz next Monday", scienceNoticeBoard);

        student3.unsubscribe(artsNoticeBoard);
        student3.subscribe(sportsNoticeBoard);

        System.out.println(" ------------- ");

        sportsTeacher.publish("4 o clock there is kho kho practice ", sportsNoticeBoard);
        artsTeacher.publish("Art exhibition on Friday", artsNoticeBoard);
        scienceTeacher.publish("Science quiz next Monday", scienceNoticeBoard);


        System.out.println(" -----------");

        artsTeacher.publish("New art supplies have arrived", artsNoticeBoard);

    }

}
