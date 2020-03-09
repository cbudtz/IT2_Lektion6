public class Doctor extends HealthPersonnel {
    private String authId;
    private Specialty specialty;

    @Override
    public String getName() {return "Dr. " + name;}

    public String getAuthId() {return authId;}

    public void setAuthId(String authId) {this.authId = authId;}

    public Specialty getSpecialty() {return specialty;}

    public void setSpecialty(Specialty specialty) {this.specialty = specialty;}
}
