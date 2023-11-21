package pr17.ex2;
import java.util.Scanner;
public class LabClassUI {
    private Student[] students;
    private int count;

    public LabClassUI() {
        count = 0;
    }

    Scanner in = new Scanner(System.in);

    public void InputStudents() {
        System.out.println("Введите количество студентов: ");
        count = in.nextInt();
        students = new Student[count];
        in.nextLine(); // Считываем символ новой строки после ввода числа
        System.out.println("Введите данные " + count + " студентов:");
        for (int i = 0; i < count; i++) {
            System.out.print("ФИО студента (слитно) " + (i + 1) + ": ");
            String name = in.nextLine();
            System.out.print("Средний балл студента (через запятую)  " + (i + 1) + ": ");
            double GPA = in.nextDouble();
            students[i] = new Student(name, GPA);
            in.nextLine(); // Считываем символ новой строки после ввода балла
        }
        }
        public void OutputSortedStudents() {
            System.out.println("Список студентов и их средних баллов (отсортирован по баллам):");
            LabClass.Sort(students);
            for (Student student : students) {
                System.out.println(student.getName() + ": " + student.getGPA());
            }
        }

        public void PrintStudentInfo() {
            System.out.println("Введите ФИО студента для поиска:");
            String name = in.nextLine();
            try {
                Student foundStudent = LabClass.Search(students, name);
                System.out.println("Найден студент: " + foundStudent.getName() + ", GPA: " + foundStudent.getGPA());
            } catch (StudentNotFoundExeption e) {
                System.out.println("Студент не найден. Ошибка: " + e.getMessage());
            }
        }
}

