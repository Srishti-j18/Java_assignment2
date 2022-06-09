package academic.mangement;

//  This class is responsible for keeping the track of faculty's name, id, salary.

import java.util.List;
abstract class exam{
    abstract void facultyIntroduce();
}
class check extends exam{
    public void facultyIntroduce(){
        System.out.println("We the faculty is responsible for grading the students's performance");
    }
}
public class Faculty extends College{

    private int id;
    private String name;
    private int salary;
    private int salaryEarned;

//    Creates a new Faculty objects like id for the Faculty ,name of the faculty and salary of the faculty.
    public Faculty(List<String> faculties, List<String> students, int id, String name, int salary){
        super(faculties, students);
        this.id=id;
        this.name=name;
        this.salary=salary;
        this.salaryEarned=0;
    }

//     return the id of the faculty.

    public int getId(){
        return id;
    }
    //     return name of the faculty.

    public String getName(){
        return name;
    }


//     return the salary of the faculty.

    public int getSalary(){
        return  salary;
    }

//      set the salary.

    public void setSalary(int salary){
        this.salary=salary;
    }


//     Adds  to salaryEarned.
//     Removes from the total money earned by the college.
    public void receiveSalary(int salary){
        salaryEarned+=salary;
        College.updateTotalMoneySpent(salary);
    }


    @Override
    public String toString() {
        return "Name of the Teacher: " + name
                +" \nTotal salary earned so far Rs."
                + salaryEarned +" \n-------------------------------\n";
    }
}