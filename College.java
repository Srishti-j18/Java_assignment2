package academic.mangement;

import java.util.List;


 //This class  contains all the information of students and Faculties.

public class College {

    private List<String> faculties;
    private List<String> students;
    private static int  totalMoneyEarned;
    private static int totalMoneySpent;

//     new college object is created.
//     teachers list of Faculties in the school.
//     students list of students in the school.
    public College(List<String> faculties, List<String> students) {
        this.faculties = faculties;
        this.students = students;
        totalMoneyEarned=0;
        totalMoneySpent=0;
    }


//     return the list of teachers int the school.
    public List<String> getFaculties() {

        return faculties;
    }


//     Adds a faculty to the college.
//       The Faculty to be added.
    public void addFaculty(String faculty) {

        faculties.add(faculty);
        System.out.println(faculty +" is admitted in IITBHU.");
    }

//     return the list of students in the school.
    public List<String> getStudents() {
        return students;
    }


//         Adds a student to the school
//      student the student to be added.
    public void addStudent(String student) {
        students.add(student);
        System.out.println(student +" is admitted in IITBHU.");
    }


//     return the total money earned by the school.

    public int getTotalMoneyEarned() {
        return totalMoneyEarned;
    }

    //      Adds the total money earned by the school.
//       MoneyEarned money that is supposed to be  added.
    public static void updateTotalMoneyEarned(int MoneyEarned) {
        totalMoneyEarned += MoneyEarned;
    }


//     return the total money spent by the school.

    public int getTotalMoneySpent() {
        return totalMoneySpent;
    }


//   update the money that is spent by the school which is the salary given by the school to its teachers.moneySpent the money spent by school.

    public static void updateTotalMoneySpent(int moneySpent) {
        totalMoneyEarned-=moneySpent;
    }
}
