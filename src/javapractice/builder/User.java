package javapractice.builder;

import java.util.Objects;

public class User {
    private final String name;
    private final String email;
    private final String phone;
    private final int age;
    private final String userId;
    private final String address;
    private final String city;
    private final String state;
    private final String zip;
    private final String country;
    private final String company;
    private final String position;
    private final String department;
    private final String manager;
    private final String createdAt;
    private final String updatedAt;
    private final boolean active;
    private final String role;
    private final double salary;
    private final String birthDate;

    private User(Builder b) {
        this.name = b.name;
        this.email = b.email;
        this.phone = b.phone;
        this.age = b.age;
        this.userId = b.userId;
        this.address = b.address;
        this.city = b.city;
        this.state = b.state;
        this.zip = b.zip;
        this.country = b.country;
        this.company = b.company;
        this.position = b.position;
        this.department = b.department;
        this.manager = b.manager;
        this.createdAt = b.createdAt;
        this.updatedAt = b.updatedAt;
        this.active = b.active;
        this.role = b.role;
        this.salary = b.salary;
        this.birthDate = b.birthDate;
    }

    public static Builder builder(String userId) {
        return new Builder(userId);
    }

    public static class Builder {
        private String name;
        private String email;
        private String phone;
        private int age;
        private final String userId;
        private String address;
        private String city;
        private String state;
        private String zip;
        private String country;
        private String company;
        private String position;
        private String department;
        private String manager;
        private String createdAt;
        private String updatedAt;
        private boolean active;
        private String role;
        private double salary;
        private String birthDate;

        public Builder(String userId) {
            this.userId = Objects.requireNonNull(userId, "userId must not be null");
        }

        public Builder name(String name) { this.name = name; return this; }
        public Builder email(String email) { this.email = email; return this; }
        public Builder phone(String phone) { this.phone = phone; return this; }
        public Builder age(int age) { this.age = age; return this; }
        public Builder address(String address) { this.address = address; return this; }
        public Builder city(String city) { this.city = city; return this; }
        public Builder state(String state) { this.state = state; return this; }
        public Builder zip(String zip) { this.zip = zip; return this; }
        public Builder country(String country) { this.country = country; return this; }
        public Builder company(String company) { this.company = company; return this; }
        public Builder position(String position) { this.position = position; return this; }
        public Builder department(String department) { this.department = department; return this; }
        public Builder manager(String manager) { this.manager = manager; return this; }
        public Builder createdAt(String createdAt) { this.createdAt = createdAt; return this; }
        public Builder updatedAt(String updatedAt) { this.updatedAt = updatedAt; return this; }
        public Builder active(boolean active) { this.active = active; return this; }
        public Builder role(String role) { this.role = role; return this; }
        public Builder salary(double salary) { this.salary = salary; return this; }
        public Builder birthDate(String birthDate) { this.birthDate = birthDate; return this; }

        public User build() {
            return new User(this);
        }
    }

    // Getters
    public String getName() { return name; }
    public String getEmail() { return email; }
    public String getPhone() { return phone; }
    public int getAge() { return age; }
    public String getUserId() { return userId; }
    public String getAddress() { return address; }
    public String getCity() { return city; }
    public String getState() { return state; }
    public String getZip() { return zip; }
    public String getCountry() { return country; }
    public String getCompany() { return company; }
    public String getPosition() { return position; }
    public String getDepartment() { return department; }
    public String getManager() { return manager; }
    public String getCreatedAt() { return createdAt; }
    public String getUpdatedAt() { return updatedAt; }
    public boolean isActive() { return active; }
    public String getRole() { return role; }
    public double getSalary() { return salary; }
    public String getBirthDate() { return birthDate; }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", phone='" + phone + '\'' +
                ", age=" + age +
                ", userId='" + userId + '\'' +
                ", address='" + address + '\'' +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", zip='" + zip + '\'' +
                ", country='" + country + '\'' +
                ", company='" + company + '\'' +
                ", position='" + position + '\'' +
                ", department='" + department + '\'' +
                ", manager='" + manager + '\'' +
                ", createdAt='" + createdAt + '\'' +
                ", updatedAt='" + updatedAt + '\'' +
                ", active=" + active +
                ", role='" + role + '\'' +
                ", salary=" + salary +
                ", birthDate='" + birthDate + '\'' +
                '}';
    }
}
