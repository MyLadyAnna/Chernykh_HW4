import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
       /*List<User> students = new ArrayList<>();
        User student1 = new User("Ivan", "Ivanov");
        User student2 = new User("Vladimir", "Petrov");
        User student3 = new User("Kitty", "Monson");

        students.add(student1);
        students.add(student2);
        students.add(student3);


        students.sort(new UserComparator<>());
        System.out.println(students);

        for (User user : students) {
            System.out.println(user.getLastName());
        } */

        /*
        Dog dog1 = new Dog("Sharik", 5);
        Dog dog2 = new Dog("Bobik", 3);
        Dog dog3 = new Dog("Jassy", 4);

        List<Dog> dogs = new ArrayList<>(List.of(dog1, dog2, dog3));

        dogs.sort(new UserComparator<Dog>());
        System.out.println(dogs);*/

        Teacher TeacherOne = new Teacher("Anna", "Koroleva", 40, "Mathematics");
        Teacher TeacherTwo = new Teacher("Vasiliy", "Ivanov", 27, "Physics");
        Teacher TeacherThree = new Teacher("Elena", "Petrova", 35, "Russian language");
        Teacher TeacherFour = new Teacher("Nikita", "Romanov", 38, "Physics");
        Teacher TeacherFive = new Teacher("Irina", "Vasnecova", 29, "Chemistry");

        ArrayList<Teacher> Teachers = new ArrayList<>(List.of(TeacherOne, TeacherTwo, TeacherThree, TeacherFour, TeacherFive));

        Teachers.sort(new TeacherComparator<Teacher>());
        //System.out.println(Teachers);

        System.out.println();
        for (Teacher t: Teachers) {
            System.out.println(t.getAge() + " " + t.getName() + " " + t.getLastName());
        }

        System.out.println();
        HightTeacher HightTeacher1 = new HightTeacher("Bogdan", "Novikov", 40, "Mathematics", "postgraduate");
        HightTeacher HightTeacher2 = new HightTeacher("Nikita", "Romanov", 38, "Physics", "master");
        HightTeacher HightTeacher3 = new HightTeacher("Artem", "Pentrov", 30, "Chemistry", "master");
        List<HightTeacher> HightTeachers = new ArrayList<>(List.of(HightTeacher1, HightTeacher2, HightTeacher3));
        HightTeachers.sort(new TeacherComparator<HightTeacher>());
        System.out.println(HightTeachers);

        System.out.println();
        PrimaryTeacher PrimaryTeacher1 = new PrimaryTeacher("Bogdan", "Novikov", 25, "Mathematics", "bachelor", 3);
        PrimaryTeacher PrimaryTeacher2 = new PrimaryTeacher("Nikita", "Romanov", 29, "Physics", "specialist", 5);
        PrimaryTeacher PrimaryTeacher3 = new PrimaryTeacher("Artem", "Pentrov", 24, "Chemistry", "bachelor", 2);
        List<PrimaryTeacher> PrimaryTeachers = new ArrayList<>(List.of(PrimaryTeacher1, PrimaryTeacher2, PrimaryTeacher3));
        PrimaryTeachers.sort(new TeacherComparator<PrimaryTeacher>());
        System.out.println(PrimaryTeachers);
    }
}
