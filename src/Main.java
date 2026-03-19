import java.time.LocalDateTime;
import java.util.Date;
//
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // Регистрация сотрудников
        ScientificWorkers admin = new ScientificWorkers("Алена Свиридова", "alsv@univ.edu", "899231239123", 1);
        University.addEmployee();

        ScientificWorkers ra1 = new ScientificWorkers("Анна Сидорова", "anna@univ.edu", "8934241424", 2);
        University.addEmployee();

        Project javaProject = new Project("Java Enterprise", LocalDateTime.of(2014, 2, 2, 23, 2, 42, 24), LocalDateTime.of(2026, 2, 2, 23, 2, 42, 24));

        new Partaking(ra1, javaProject, 20);

        Cafedra cafedra = new Cafedra("Кафедра ИТ");
        Faculty faculty = new Faculty("ФКН");
        Decan decan = new Decan("Декан Деканов", "ererr@bk.ru", "8805553535", 3, faculty);
        faculty.setDecan(decan);
        faculty.addCafedra(cafedra);

        // Привязка научного сотрудника к кафедре
        ra1.addCafedr(cafedra);

        // Университет
        University uni = new University("ВГУ");
        uni.addFaculty(faculty);

        // Курс
        Course course = new Course(501, "Машинное обучение", 4);
        ra1.teachCourse(course);

        // Вывод информации
        System.out.println("Университет: " + uni.getName());
        System.out.println("Всего сотрудников: " + University.getEmployeeCount());
        System.out.println("Факультет: " + faculty.getName() + ", Декан: " + faculty.getDecan().getFio());
        System.out.println("Кафедра: " + cafedra.getName() + ", Название: " + cafedra.getName());
        System.out.println("Научный сотрудник: " + ra1.getFio() + ", Почта: " + ra1.getEmail());
        System.out.println("Участвует в проекте: " + javaProject.getName() + " (" + ra1.getPartakings().get(0).getHours() + " ч/нед)");
        System.out.println("Ведёт курс: " + course.getName() + " (ID: " + course.getId() + ", " + course.getHours() + " ч/нед)");
    }
}