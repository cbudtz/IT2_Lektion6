import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class HealthPersonApp {
    List<HealthPersonnel> employees;

    public static void main(String[] args) {
        HealthPersonnel johnny = new HealthPersonnel();
        johnny.name = "Johnny";
        Doctor doc = new Doctor();
        doc.name = "HollyWood";
        HealthPersonnel rachel = new Nurse();
        rachel.name = "Rachel";
        List<HealthPersonnel> healthPersonnel = new ArrayList<>();
        healthPersonnel.addAll(Arrays.asList(johnny, doc, rachel));
        for (HealthPersonnel hp: healthPersonnel) {
            System.out.println(hp.getName());
        }

    }
}