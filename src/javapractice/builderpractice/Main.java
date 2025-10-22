package javapractice.builderpractice;

import java.util.ArrayList;
import java.util.List;

public class Main {

    static List<User> db = new ArrayList<>();

    public static void main(String[] args) {
        System.out.println("In Main");

        String name = "Siddhant"; // coming from UI
        String email = "test@gmail.com"; // coming from UI
        String phone  = "1312321312";
        int age = 50;
        String userId = "sidhello";
        String gender = "Male"; //optional
        String company = "TCS";

         // if phone is not present the pass phone no. as empty string or null

        String name2 = "Toni"; // coming from UI
        String email2 = "toni@gmail.com"; // coming from UI
        String userId2 = "sidhello"; // mandatory field
        int age2 = 40;

//        User user = new User(name,email,phone,userId,age,null,null,null,null,null,company,null,null,null,null,null,null,null,null,null,null,null,null,null);
        // Builder design pattern
        // When we're creating object then only required fields are passed in the constructor
        // User user1 = new User(userId);
        // user1 -> set Name -> set email -> setAge;

        User user2 = new User(userId2);
        user2.setName(name2);
        user2.setEmail(email2);
        user2.setAge(age2);
        user2.setCompany(company);

//        db.add(user);
        db.add(user2);


        System.out.println(db);

    }
}
