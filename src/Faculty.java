import java.util.ArrayList;
import java.util.List;

public class Faculty {
    private String name;
    private Decan decan;
    private List<Cafedra> cafedr = new ArrayList<>();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Decan getDecan() {
        return decan;
    }

    public void setDecan(Decan decan) {
        if (this.decan == null) {
            this.decan = decan;
        }
    }

    public List<Cafedra> getCafedr() {
        return cafedr;
    }

    public void setCafedr(List<Cafedra> cafedr) {
        this.cafedr = cafedr;
    }

    public Faculty(String name) {
        this.name = name;
        this.decan = decan;
    }

    public void addCafedra(Cafedra cafedra) {
        if (!cafedr.contains(cafedra)) {
            cafedr.add(cafedra);
        }
    }

}
