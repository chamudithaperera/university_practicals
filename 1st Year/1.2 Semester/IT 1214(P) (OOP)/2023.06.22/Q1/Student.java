class Student extends Person {
    private int rollNumber;
    private int[] marks;
    
    public Student(String name, int rollNumber, int[] marks) {
        super(name);
        this.rollNumber = rollNumber;
        this.marks = marks;
    }
    
    public int getRollNumber() {
        return rollNumber;
    }
    
    public int[] getMarks() {
        return marks;
    }
    
    public double calculateAverage() {
        int sum = 0;
        for (int mark : marks) {
            sum += mark;
        }
        return (double) sum / marks.length;
    }
    
    @Override
    public String getRole() {
        return "Student";
    }
}