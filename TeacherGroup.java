import java.util.ArrayList;
import java.util.List;

public class TeacherGroup <T extends Teacher> implements Iterable<T> {
    private String groupName;
    private List<T> Teachers;

    public TeacherGroup(String groupName, List<T> Teachers) {
        this.groupName = groupName;
        this.Teachers = new ArrayList<>();
    }
 
    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public void setTeachersList(List<T> Teachers) {
        this.Teachers = Teachers;
    }

    public int getSize() {
        return Teachers.size();
    }
    
    public String getGroupName() {
        return groupName;
    }

        public List<T> getTeachersList() {
        return Teachers;
    }

    @Override
    public String toString() {
        return "TeacherGroup{" +
                "groupName= '" + groupName + '\'' +
                ", TeachersList= " + Teachers +
                '}';
    }

    @Override
    public TeacherIterator iterator() {
        return new TeacherIterator(Teachers);
    }
}
