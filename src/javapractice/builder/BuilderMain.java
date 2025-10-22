package javapractice.builder;

import java.util.ArrayList;
import java.util.List;

public class BuilderMain {

    static List<User> userList = new ArrayList<>();

    public static void main(String[] args) {
        String name  =  "Siddhant"; // coming from UI
        String email = "test@gmail.com"; // coming from UI
        String phone  = "1312321312"; // optional
        int age = 50;
        String userId = "sidhello"; // unique


        String name2  =  "Toni"; // coming from UI
        String email2 = "toni@gmail.com"; // coming from UI
        int age2 = 50;
        String userId2 = "tonisecret"; // unique
        String company = "TCS";


        // Create User objects using the Builder API (userId is mandatory)
        User user1 = User.builder(userId)
                .name(name)
                .email(email)
                .phone(phone)
                .age(age)
                .build();


        // Create Builder object with mandatory fields
        // Now set optional fields and return Builder instance
        // Call build which returns a user object wrapped with builder object
        // User constructor unwraps the builder object and get the actual field values and set in the USer class


        // Builder (userId, name, email, age)
        // USer ( Builder (userId, name, email, age) )

        User user2 = User.builder(userId2)
                .name(name2)
                .email(email2)
                .age(age2)
                .company(company)
                .build();

        User user3 = new User.Builder("saurabh723").name("Saurabh").build();

        userList.add(user1); // DB
        userList.add(user2);
        userList.add(user3);



        System.out.println(userList);
    }
}

