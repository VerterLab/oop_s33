import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import student.Student;
import studentGroup.StudentGroup;
import streamGroup.StreamGroup;

/**
 * ProgramT
 */
public class ProgramT {

    public static void main(String[] args) {

        StreamGroup streamGroup = new StreamGroup();
        StudentGroup studentGroup1 = new StudentGroup();
        Student ivan = new Student("Ivan", 1);
        Student petr = new Student("Petr", 2);
        Student don = new Student("Djon", 3);
        Student bim = new Student("Bimbo", 4);
        studentGroup1.addStudent(ivan);
        studentGroup1.addStudent(petr);
        studentGroup1.addStudent(don);
        studentGroup1.addStudent(bim);
        streamGroup.groupAddStream(studentGroup1);
        // ---------------------------------------------
        StudentGroup studentGroup2 = new StudentGroup();
        Student alfe = new Student("Alfe", 1);
        studentGroup2.addStudent(alfe);
        streamGroup.groupAddStream(studentGroup2);
        // ---------------------------------------------
        StudentGroup studentGroup3 = new StudentGroup();
        Student ola = new Student("Olga", 1);
        Student lena = new Student("Elena", 2);
        studentGroup3.addStudent(ola);
        studentGroup3.addStudent(lena);
        streamGroup.groupAddStream(studentGroup3);

        ArrayList<Student> arrayList = new ArrayList<>(List.of(ivan, petr, don, bim));
        System.out.println(arrayList + " - until sort");
        Collections.sort(arrayList);
        System.out.println(arrayList + " - after sort");

        List<StudentGroup> arrList = new ArrayList<>(List.of(studentGroup1, studentGroup2, studentGroup3));
        System.out.println();
        System.out.println(arrList + " - until streamGroup sort");
        // Collections.sort(arrList); // dont work
        Collections.reverse(arrList);
        System.out.println(arrList + " - after revers, it works");
    }
}
