package studentGroup;

import java.util.Iterator;
import student.Student;

public class StudentGroupIterator implements Iterator<Student> {

    private StudentGroup studentGroup;
    private int index = 0;

    public StudentGroupIterator(StudentGroup stGroup) {
        this.studentGroup = stGroup;
    }

    private Student[] getStudents() {

        String[] names = studentGroup.students.toString().split("null");
        Student[] students = new Student[names.length];

        int count = 0;
        for (String name : names) {
            students[count] = new Student(name, count);
            count++;
        }
        System.out.println(students.getClass() + " -- students.getClass() stGrIter");
        return students;

    }

    @Override
    public boolean hasNext() {
        // int lengthStud = getStudents().length;
        return index < getStudents().length;

    }

    @Override
    public Student next() {
        Student[] students = getStudents();
        return students[index++];
    }

}
