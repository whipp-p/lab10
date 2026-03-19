import java.time.LocalDateTime;
import java.util.Date;

public class Project {
    private String name;
    private LocalDateTime startDate;
    private LocalDateTime endDate;

    public Project(String name, LocalDateTime startDate, LocalDateTime endDate) {
        this.name = name;
        this.startDate = startDate;
        this.endDate = endDate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
