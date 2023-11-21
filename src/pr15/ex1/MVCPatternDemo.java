package pr15.ex1;

public class MVCPatternDemo {
    public static void main(String[] args) {
        // Создаем объекты модели, представления и контроллера
        StudentController controller = new StudentController();

        // Устанавливаем данные студента
        controller.setStudentName("Vika");
        controller.setStudentRollNo("5");

        // Обновляем представление, чтобы отобразить данные студента
        controller.updateView();
    }
    public static Student retrieveStudentFromDatabase() {
        return new Student();
    }
}
