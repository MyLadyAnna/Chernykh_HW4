import java.util.Comparator;

public class TeacherComparator<T extends Teacher> implements Comparator<T> {

    /*@Override
    public int compare(T o1, T o2) {
        return o1.firstName.length() - o2.firstName.length();
    */

    public int compare(T one, T two) {
        if (one.getAge() == two.getAge())
            return 0;
         else if (one.getAge() > two.getAge())
            return 1;
        else
            return -1;
    }
}
