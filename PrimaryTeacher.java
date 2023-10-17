public class PrimaryTeacher extends Teacher {
    String degree;
    int experience;

    public PrimaryTeacher(String firstName, String lastName, int age, String subject, String degree,  int experience) {
        super(firstName, lastName, age, subject);
        this.degree = degree;
        this.experience = experience;
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

    public int getExperience() {
        return experience;
    }

    @Override
    public String toString() {
        return "Teacher Primary School{" +
                "name='" + firstName + '\'' +
                "name='" + lastName + '\'' +
                ", age=" + age + '\'' +
                ", subject=" + subject + '\'' +
                ", degree=" + degree + '\'' +
                ", experience=" + experience +
                '}';
    }     
    
}
