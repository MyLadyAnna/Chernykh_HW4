public class HightTeacher extends Teacher {
    String degree;

    public HightTeacher(String firstName, String lastName, int age, String subject, String degree) {
        super(firstName, lastName, age, subject);
        this.degree = degree;
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

    public String getDegree() {
        return degree;
    }

    @Override
    public String toString() {
        return "Teacher Hight School{" +
                "name='" + firstName + '\'' +
                "name='" + lastName + '\'' +
                ", age=" + age + '\'' +
                ", subject=" + subject + '\'' +
                ", degree=" + degree + '\'' +
                '}';
    }
}
