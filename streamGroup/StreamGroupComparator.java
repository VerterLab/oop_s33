package streamGroup;

import java.util.Comparator;

/**
 * StreamComparator dont work
 */
public class StreamGroupComparator implements Comparator<StreamGroup> {

    @Override
    public int compare(StreamGroup o1, StreamGroup o2) {
        int a1 = o1.stream.size();
        System.out.println(a1);
        int a2 =o2.stream.size();
        System.out.println(a2);
        return a1-a2;
    }


}
