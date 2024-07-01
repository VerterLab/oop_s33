package studentGroup;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import student.Student;

public class StudentGroup implements Iterable<Student> {
    public List<Student> students = new ArrayList<>();
    // public StringBuilder students = new StringBuilder();

    public void addStudent(Student student) {
        // students.append(student).append(" ");
        students.add(student);
    }

    @Override
    public Iterator<Student> iterator() {
        return new StudentGroupIterator(this);
    }

    @Override
    public String toString() {
        return this.students.toString();
    }

    public int compareTo() {
        System.out.println(students.size()+ " ---- hgh studGroup");
        return students.size();
    }
}
