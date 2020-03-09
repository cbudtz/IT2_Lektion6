import java.util.List;

public class Nurse extends HealthPersonnel {
    public List<Integer> beds;

    public Nurse() {
    }

    public Nurse(int id, String fornavn, Ward stamafdeling, List<Integer> beds) {
        super(id, fornavn, stamafdeling);
        this.beds = beds;
    }
}
