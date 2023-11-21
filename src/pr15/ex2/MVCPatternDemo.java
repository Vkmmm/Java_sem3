package pr15.ex2;

public class MVCPatternDemo {
    public static void main(String[] args) {
        // Создаем объекты модели, представления и контроллера
        Employee employee = new Employee("Vika", 15.0, 120);
        EmployeeView view = new EmployeeView();
        EmployeeController controller = new EmployeeController(employee, view);

        // Обновляем представление, чтобы отобразить заработную плату сотрудника
        controller.updateView();
    }
}

