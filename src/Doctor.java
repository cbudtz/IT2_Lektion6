public class Doctor extends HealthPersonnel {
    String authId;
    Specialty specialty;

    public Doctor() {
    }

    public Doctor(int id, String name, Ward primaryWard, String authId, Specialty specialty) {
        super(id, name, primaryWard);
        this.authId = authId;
        this.specialty = specialty;
    }
    public String getName() {
        return "Dr. " + name;
    }
}
