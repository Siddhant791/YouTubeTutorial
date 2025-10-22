package javapractice.builderpractice;

public class User {
    private String name;
    private String email;
    private String phone;
    private final String userId;
    private int age;
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

    public User(String userId) {
        this.userId = userId;
    }

    // Getters
    public String getName() { return name; }
    public String getEmail() { return email; }
    public String getPhone() { return phone; }
    public String getUserId() { return userId; }
    public int getAge() { return age; }
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

    // Setters (optional fields)
    public void setName(String name) { this.name = name; }
    public void setEmail(String email) { this.email = email; }
    public void setPhone(String phone) { this.phone = phone; }
    public void setAge(int age) { this.age = age; }
    public void setAddress(String address) { this.address = address; }
    public void setCity(String city) { this.city = city; }
    public void setState(String state) { this.state = state; }
    public void setZip(String zip) { this.zip = zip; }
    public void setCountry(String country) { this.country = country; }
    public void setCompany(String company) { this.company = company; }
    public void setPosition(String position) { this.position = position; }
    public void setDepartment(String department) { this.department = department; }
    public void setManager(String manager) { this.manager = manager; }
    public void setCreatedAt(String createdAt) { this.createdAt = createdAt; }
    public void setUpdatedAt(String updatedAt) { this.updatedAt = updatedAt; }
    public void setActive(boolean active) { this.active = active; }
    public void setRole(String role) { this.role = role; }
    public void setSalary(double salary) { this.salary = salary; }
    public void setBirthDate(String birthDate) { this.birthDate = birthDate; }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", phone='" + phone + '\'' +
                ", userId='" + userId + '\'' +
                ", age=" + age +
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