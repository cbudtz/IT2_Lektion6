public abstract class HealthPersonnel {
    public int id;
    public String name;
    public Ward primaryWard;

    public HealthPersonnel() {
    }

    public HealthPersonnel(int id, String name, Ward primaryWard) {
        this.id = id;
        this.name = name;
        this.primaryWard = primaryWard;
    }

    public String getName() {
        return name;
    }
}
