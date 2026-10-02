package griffith;

import java.time.LocalDate;

// Academic project by Vladyslav Hordiienko
// Stores student card info: name, course creation and expiry date


//attributes
public class StudentCard {

    private String studentName;
       private String dateOfBirth;
    private String courseName;
    private LocalDate creationDate;
    private int expiryYear;

    // Constructor
    public StudentCard(String studentName, String dateOfBirth, String courseName) {
        this.studentName = studentName;
        this.dateOfBirth = dateOfBirth;
        this.courseName = courseName;
        this.creationDate = LocalDate.now();
        this.expiryYear = creationDate.getYear() + 1;
    }

    // Getters
    public String getStudentName() {
        return studentName;
    }
    public String getDateOfBirth() {
        return dateOfBirth;
    }
             public String getCourseName() {
        return courseName;
    }
         public LocalDate getCreationDate() {
        return creationDate;
    }
    public int getExpiryYear() {
        return expiryYear;
    }

    // Setters
    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

                 public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    // method display
    public void display() {
        System.out.println("Student Name: " + studentName);
        System.out.println("Date of Birth: " + dateOfBirth);
        System.out.println("Course Name: " + courseName);
        System.out.println("Creation Date: " + creationDate);
        System.out.println("Expiry Year: " + expiryYear);
    }
}
