package streamGroup;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import student.Student;
import studentGroup.StudentGroup;

public class StreamGroup implements Iterable<StudentGroup> {

    public ArrayList<StudentGroup> stream = new ArrayList<>();

    public void groupAddStream(StudentGroup group){
        stream.add(group);

    }

    public ArrayList<StudentGroup> getStream() {
        return stream;
    }


    public void setStream(ArrayList<StudentGroup> stream) {
        this.stream = stream;
    }

    @Override
    public Iterator<StudentGroup> iterator() {
        return new StreamIterator(this);
    }

}
