public class Doctor extends Employee {
    private String specialization;

    public Doctor(String name, double salary, String specialization) {
        super(name, salary);
        this.specialization = specialization;
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }
}
