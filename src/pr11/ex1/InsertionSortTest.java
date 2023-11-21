package pr11.ex1;

public class InsertionSortTest {
    public static void main(String[] args) {
        Student[] students = {
                new Student(345, "Vika"),
                new Student(1231, "Mathew"),
                new Student(1, "Diana"),
                new Student(2124, "Danil"),
                new Student(98346, "Egor")
        };

        System.out.println("Before sorting:");
        printStudents(students);
        insertionSort(students);

        System.out.println("After sorting by IDNumber:");
        printStudents(students);
    }

    public static void insertionSort(Comparable[] array) {
        int n = array.length;
        for (int i = 1; i < n; i++) {
            Comparable key = array[i];
            int j = i - 1;
            while (j >= 0 && array[j].compareTo(key) > 0) {
                array[j + 1] = array[j];
                j--;
            }
            array[j + 1] = key;
        }
    }

    public static void printStudents(Student[] students) {
        for (Student student : students) {
            System.out.println("ID: " + student.getIDNumber() + ", Name: " + student.getName());
        }
    }
}