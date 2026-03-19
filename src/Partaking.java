public class Partaking {
    private ScientificWorkers employee;
    private Project project;
    private int hours;

    public Partaking(ScientificWorkers employee, Project project, int hours) {
        this.employee = employee;
        this.project = project;
        this.hours = hours;
        employee.addParticipation(this);
    }

    public ScientificWorkers getEmployee() {
        return employee;
    }

    public void setEmployee(ScientificWorkers employee) {
        this.employee = employee;
    }

    public Project getProject() {
        return project;
    }

    public void setProject(Project project) {
        this.project = project;
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }
}