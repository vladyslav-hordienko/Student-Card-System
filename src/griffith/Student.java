package griffith;

// Academic project by Vladyslav Hordiienko
// stores student info and creates a linked StudentCard object.

//attributes
public class Student {

    private String firstname;
    private String lastname;
    private String email;
    private int id;
    private StudentCard studentCard;

    // Constructor
    public Student(String firstname, String lastname, int id, String dateOfBirth, String courseName) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.id = id;
        this.email = firstname.toLowerCase() + "." + lastname.toLowerCase() + "@student.griffith.ie";

// make new studentcard with student  name, date of birth, and course
        this.studentCard = new StudentCard(
                firstname + " " + lastname, dateOfBirth, courseName
        );
    }


    // Getters/Setters
    public String getFirstname() {
        return firstname;
    }
    public String getLastname() {
        return lastname;
    }
    public String getEmail() {
        return email;
    }
    public int getId() {
        return id;
    }
    public StudentCard getStudentCard() {
        return studentCard;
    }

    //method for updating email and card
    private void updateEmailAndCard() {
        this.email = firstname.toLowerCase() + "." + lastname.toLowerCase() + "@student.griffith.ie";
        this.studentCard.setStudentName(firstname + " " + lastname);
    }

    //setters/getters continued
    public void setFirstname(String firstname) {
        this.firstname = firstname;
        updateEmailAndCard();
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
        updateEmailAndCard();
    }



    // Display method for all
    public void display() {
        System.out.println("Student ID: " + id);
        System.out.println("Firstname: " + firstname);
        System.out.println("Lastname: " + lastname);
        System.out.println("Email: " + email);
        System.out.println("--- Student Card Info ---");
        studentCard.display();
    }
}
