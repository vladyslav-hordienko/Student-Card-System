package griffith;
// Academic project by Vladyslav Hordiienko
// we create a list of students, show their info, change one student's name and show info again after all


import java.util.ArrayList;
import java.util.List;


public class Test {

    public static void main(String[] args) {

        List<Student> students = new ArrayList<>();

        students.add(new Student("Jahnn", "Booo", 23443, "15/12/2013", "Computer Science"));
        students.add(new Student("Bobre", "lLly", 13484, "20/07/2003", "Marketing"));
        students.add(new Student("Boris", "Melcn", 174783, "05/11/1978", "Mathematics/Pysics"));


        //display all  the info about student
        System.out.println("      Students Info        ");
        for (Student s : students) {
            s.display();
            System.out.println();
        }


//updating student name
        students.get(1).setFirstname("Jack");
        students.get(1).setLastname("Mpolll");

        //displaying updated students names
        System.out.println("       After Name Updates      ");
        for (Student s : students) {
            s.display();
            System.out.println();
        }
    }
}
