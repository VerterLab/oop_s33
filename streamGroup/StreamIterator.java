package streamGroup;

import java.util.Iterator;
import java.util.List;

import studentGroup.StudentGroup;
// import student.Student;

public class StreamIterator implements Iterator<StudentGroup> {
    private StreamGroup streamGroup;
    private int index = 0;

    public StreamIterator(StreamGroup streamGroup) {
        this.streamGroup = streamGroup;
    }

    private StudentGroup[] getStream() {

        List<StudentGroup> groups = streamGroup.getStream();
        System.out.println(groups + "groups");

        StudentGroup[] studGroup = new StudentGroup[groups.size()];
        int count = 0;
        for (StudentGroup group : groups) {
            studGroup[count] = new StudentGroup();
            count++;
        }
        return studGroup;

    }

    @Override
    public boolean hasNext() {
        return index < getStream().length;
    }

    @Override
    public StudentGroup next() {
        StudentGroup[] studGroup =getStream();
        return studGroup[index++];
    }

}
