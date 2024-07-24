public class Main {
    public static void main(String[] args) {
        int[] studentMarks = {85, 90, 78, 92, 88};
        Student student = new Student("John Doe", 12345, studentMarks);
        
        Teacher teacher = new Teacher("Jane Smith", "Mathematics");
        
        System.out.println("Student Name: " + student.getName());
        System.out.println("Role: " + student.getRole());
        System.out.println("Roll Number: " + student.getRollNumber());
        System.out.println("Average Marks: " + student.calculateAverage());
        
        System.out.println();
        
        System.out.println("Teacher Name: " + teacher.getName());
        System.out.println("Role: " + teacher.getRole());
        System.out.println("Subject: " + teacher.getSubject());
    }
}