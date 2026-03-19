import java.util.ArrayList;
import java.util.List;

public class ScientificWorkers extends Employee {
    private List<Cafedra> cafedr = new ArrayList<>();
    private List<Partaking> partakings = new ArrayList<>();

    public ScientificWorkers(String fio, String email, String phoneNumber, int id) {
        super(fio, email, phoneNumber, id);
    }

    public ScientificWorkers(List<Cafedra> cefardr, List<Partaking> partakings) {
        this.cafedr = cefardr;
        this.partakings = partakings;
    }

    public List<Cafedra> getCafedr() {
        return cafedr;
    }

    public void setCafedr(List<Cafedra> cafedr) {
        this.cafedr = cafedr;
    }

    public List<Partaking> getPartakings() {
        return partakings;
    }

    public void setPartakings(List<Partaking> partakings) {
        this.partakings = partakings;
    }
    public void addCafedr(Cafedra cafedra) {
        if (!cafedr.contains(cafedra)) {
            cafedr.add(cafedra);
            cafedra.addScientificWorkers(this);
        }
    }
    public void addParticipation(Partaking p) {
        if (!partakings.contains(p)) {
            partakings.add(p);
        }
    }
    public void teachCourse(Course course) {
        course.addLecturer(this);
    }
}
