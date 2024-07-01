package studentGroup;

import java.util.Comparator;

public class StudentGroupComparator implements Comparator<StudentGroup> {

    @Override
    public int compare(StudentGroup o1, StudentGroup o2) {
        return o1.students.size() - o2.students.size();
    }

}
