public class Doctor extends HealthPersonnel {
    String authId;
    Specialty specialty;

    public Doctor() {
    }

    public Doctor(int id, String fornavn, Afdeling stamafdeling, String authId, Specialty specialty) {
        super(id, fornavn, stamafdeling);
        this.authId = authId;
        this.specialty = specialty;
    }
}
