public class Teacher extends User {
    int age;
    String subject;

    public Teacher(String firstName, String lastName, int age, String subject) {
        this.firstName = firstName;
        this.lastName =  lastName;
        this.age = age;
        this.subject = subject;
    }
    public String getName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public String getSubject() {
        return subject;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "name='" + firstName + '\'' +
                "name='" + lastName + '\'' +
                ", age=" + age + '\'' +
                ", subject=" + subject + 
                '}';
    }
}
