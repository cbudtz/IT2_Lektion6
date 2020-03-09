public class HealthPersonnel {
    public int id;
    public String fornavn;
    public Afdeling stamafdeling;

    public HealthPersonnel() {
    }

    public HealthPersonnel(int id, String fornavn, Afdeling stamafdeling) {
        this.id = id;
        this.fornavn = fornavn;
        this.stamafdeling = stamafdeling;
    }
}
