public class Nurse extends Employee {
    private String shift;

    public Nurse(String name, double salary, String shift) {
        super(name, salary);
        this.shift = shift;
    }

    public String getShift() {
        return shift;
    }

    public void setShift(String shift) {
        this.shift = shift;
    }
}