package pr17.ex2;

public class LabClass {
    public static void Sort(Student[] students) {
        boolean sorted = false;
        while (!sorted) {
            sorted = true;
            for (int i = 0; i < students.length - 1; i++) {
                if (students[i].getGPA() < students[i + 1].getGPA()) {
                    Student temp = students[i];
                    students[i] = students[i + 1];
                    students[i + 1] = temp;
                    sorted = false;
                }
            }
        }
    }

    public static Student Search(Student[] students, String name) throws StudentNotFoundExeption {
        for (Student student : students) {
            if (student.getName().equalsIgnoreCase(name)) {
                return student;
            }
        }
        throw new StudentNotFoundExeption("Студент с ФИО '" + name + "' не найден.");
    }
}
