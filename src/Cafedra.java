import java.util.ArrayList;
import java.util.List;

public class Cafedra {
    String name;
    private List<ScientificWorkers> scientificWorkersList = new ArrayList<>();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<ScientificWorkers> getScientificWorkersList() {
        return scientificWorkersList;
    }

    public void setScientificWorkersList(List<ScientificWorkers> scientificWorkersList) {
        this.scientificWorkersList = scientificWorkersList;
    }

    public Cafedra(String name) {
        this.name = name;
    }
    public void addScientificWorkers(ScientificWorkers worker) {
        if (!scientificWorkersList.contains(worker)) {
            scientificWorkersList.add(worker);
        }
    }
}
//