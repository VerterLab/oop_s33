package streamGroup;
import java.util.ArrayList;
import java.util.Iterator;
import studentGroup.StudentGroup;

public class StreamGroup implements Iterable<StudentGroup>, Comparable<StreamGroup> {

    public ArrayList<StudentGroup> stream = new ArrayList<>();

    public void groupAddStream(StudentGroup group) {
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
        // Dont work :(
    @Override
    public int compareTo(StreamGroup o) {
        return o.stream.size() - this.stream.size();
    }

}
