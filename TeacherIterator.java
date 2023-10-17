import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;

public class TeacherIterator <T extends Teacher> implements Iterator<T> {
    private List<T> Teachers;
    private int counter;

    public TeacherIterator(List<T> Teachers) {
        this.Teachers = Teachers;
        this.counter = 0;
    }

    @Override
    public boolean hasNext() {
        return counter < Teachers.size() - 1;
    }

    @Override
    public T next() {
        if (hasNext()) {
            return Teachers.get(counter++);
        }
        return null;
    }

    @Override
    public void remove() {
        Teachers = new ArrayList<>();
        counter = 0; 
    }
}
