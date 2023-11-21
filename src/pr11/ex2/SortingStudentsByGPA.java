package pr11.ex2;

import java.util.List;
import java.util.Collections;
public class SortingStudentsByGPA {
    // Метод для сортировки списка студентов по GPA с использованием быстрой сортировки
    public void quickSort(List<Student> students, int low, int high) {
        if (low < high) {
            int pivotIndex = partition(students, low, high);
            quickSort(students, low, pivotIndex - 1);
            quickSort(students, pivotIndex + 1, high);
        }
    }

    private int partition(List<Student> students, int low, int high) {
        Student pivot = students.get(high);
        int i = low - 1;
        for (int j = low; j < high; j++) {
            if (students.get(j).getGPA() >= pivot.getGPA()) {
                i++;
                Collections.swap(students, i, j);
            }
        }
        Collections.swap(students, i + 1, high);
        return i + 1;
    }
}

