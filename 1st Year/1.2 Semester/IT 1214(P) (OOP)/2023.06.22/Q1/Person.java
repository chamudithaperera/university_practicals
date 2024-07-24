/*You have been given the task to design a Java program to represent information about people, specifically students and teachers. Implement the necessary classes to achieve this.
Create an abstract class called "Person" with the following attributes and behaviors:
Attributes:
name (String)

Abstract Method:
getRole(): Returns a String representing the role of the person.

Methods:
getName(): Returns the name of the person.

Create a class called "Student" that extends the "Person" class. The "Student" class should have the following additional attributes and behaviors:

Attributes:
rollNumber (int)
marks (array of int)

Methods:
calculateAverage(): Calculates and returns the average marks of the student.

Implement the necessary constructor and getter methods.

Create a class called "Teacher" that also extends the "Person" class. 
The "Teacher" class should have the following additional attributes and behaviors:

Attributes:
subject (String)

Methods:
Implement the necessary constructor and getter methods.
In the main() method of the "Main" class, create objects of both "Student" and "Teacher" classes with the following details:

For the "Student" object:

Name: John Doe
Roll Number: 12345
Marks: [85, 90, 78, 92, 88]
For the "Teacher" object:

Name: Jane Smith
Subject: Mathematics
Print the following information for the "Student" object:

Student Name: [Student's Name]
Role: [Role of the Student]
Roll Number: [Student's Roll Number]
Average Marks: [Average Marks of the Student]
Print the following information for the "Teacher" object:*/

abstract class Person {
    protected String name;
    
    public Person(String name) {
        this.name = name;
    }
    
    public abstract String getRole();
    
    public String getName() {
        return name;
    }
}

