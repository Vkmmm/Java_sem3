package pr11.ex2;

import pr11.ex2.SortingStudentsByGPA;
import pr11.ex2.Student;

import java.util.List;
import java.util.ArrayList;


public class Test {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Vika", 4.8));
        students.add(new Student("Mathew", 3.8));
        students.add(new Student("Diana", 5.0));
        students.add(new Student("Danil", 3.5));
        students.add(new Student("Egor", 2.6));
        SortingStudentsByGPA sorter = new SortingStudentsByGPA();
        sorter.quickSort(students, 0, students.size() - 1);
        for (Student student : students) {
            System.out.println("Name: " + student.getName() + ", GPA: " + student.getGPA());
        }
    }
}

