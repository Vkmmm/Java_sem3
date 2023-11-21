package pr15.ex2;

public class EmployeeController {
    private Employee model;
    private EmployeeView view;

    public EmployeeController(Employee model, EmployeeView view) {
        this.model = model;
        this.view = view;
    }

    public void updateView() {
        String name = model.getName();
        double salary = model.calculateSalary();
        view.printEmployeeDetails(name, salary);
    }
}
