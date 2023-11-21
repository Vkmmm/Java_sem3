package pr15.ex1;

public class StudentController {
    private Student model;
    private StudentView view;

    public StudentController() {
        this.model = new Student();
        this.view = new StudentView();
    }

    public void setStudentName(String name) {
        model.setName(name);
    }

    public String getStudentName() {
        return model.getName();
    }

    public void setStudentRollNo(String rollNo) {
        model.setRollNo(rollNo);
    }

    public String getStudentRollNo() {
        return model.getRollNo();
    }

    public void updateView() {
        String studentName = model.getName();
        String studentRollNo = model.getRollNo();
        view.printStudentDetails(studentName, studentRollNo);
    }
}

