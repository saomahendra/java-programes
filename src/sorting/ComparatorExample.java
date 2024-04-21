package sorting;
import domain.Student;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorExample {
    public static void main(String[] args) {
        List<Student> studentList = getStudentList();

        Collections.sort(studentList, new StudentComparator());
        for (Student student : studentList) {
            System.out.println(student.getFname());
        }

    }

    static List<Student> getStudentList() {
        List<Student> studentList = new ArrayList<Student>();
        Student st = new Student(1, "Mahi", 65.7);
        Student st2 = new Student(2, "Manu", 65.7);
        Student st3 = new Student(3, "other", 64.7);
        studentList.add(st);
        studentList.add(st2);
        studentList.add(st3);
        return studentList;
    }
}

class StudentComparator implements Comparator<Student> {

    @Override
    public int compare(Student s1, Student s2){

        if(s1.getCgpa() != s2.getCgpa()){
            return Double.compare(s2.getCgpa(), s1.getCgpa());
        }
        else if(!s1.getFname().equals(s2.getFname())){
            return s2.getFname().compareTo(s1.getFname());
        }
        else {
            return Integer.compare(s2.getId(), s1.getId());
        }

    }
}