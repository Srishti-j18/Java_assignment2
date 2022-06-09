package academic.mangement;

import java.util.ArrayList;
import java.util.List;

public class runfile {
    public static void main(String[] args) {

        List<String> facultyList = new ArrayList<>();
        List<String> studentList = new ArrayList<>();  

        Faculty Aarav = new Faculty(facultyList,studentList,5677,"Aarav",55000);
        Faculty Pallavi= new Faculty(facultyList, studentList,5678,"Pallavi",60500);
        Faculty Harsh = new Faculty(facultyList, studentList,5679,"Harsh",75000);
        facultyList.add("Faculties are :- Aarav and Id : 5677" );
        facultyList.add("Pallavi and Id : 5678");
        facultyList.add("Harsh and Id :5679");

        Student Srishti = new Student(facultyList,studentList,"srishti.jaiswal.abc12@itbhu.ac.in","Srishti Jaiswal","1st year");
        Student Aditi = new Student(facultyList,studentList,"aditi.mittal.efg34@itbhu.ac.in","Aditi Mittal","2nd year");
        Student Riya = new Student(facultyList, studentList,"riya.singh.hij56@itbhu.ac.in","Riya Singh","3rd year");
//        List<Student> studentList = new ArrayList<>();

        studentList.add("Students are:- Srishti and InstiId : srishti.jaiswal.abc12@itbhu.ac.in");
        studentList.add("Aditi and Instiid : aditi.mittal.efg34@itbhu.ac.in ");
        studentList.add("Riya and InstiId : riya.singh.hij56@itbhu.ac.in");
        College IITBHU = new College(facultyList,studentList);
        System.out.println(facultyList +"\n"+studentList);


        System.out.println("//------------Making SCHOOL PAY SALARY-------------//");


        Faculty Anshika= new Faculty(facultyList,studentList,5680,"Anshika", 70000);

        IITBHU.addFaculty("Anshika");
        Student Akshansh =new Student(facultyList,studentList,"akshansh.abc12@itbhu.ac.in","Akshansh","1st Year");
        IITBHU.addStudent("Akshansh");

        exam professor= new check();
        professor.facultyIntroduce();

        Srishti.payFees(100000);
        Aditi.payFees(150000);
        Riya.payFees(200000);
        System.out.println("IITBHU has earned from three students Rs."+ IITBHU.getTotalMoneyEarned());

        Aarav.receiveSalary(Aarav.getSalary());
        System.out.println("IITBHU has spent for salary to " + Aarav.getName()
                +" and now has Rs." + IITBHU.getTotalMoneyEarned());

        Pallavi.receiveSalary(Pallavi.getSalary());
        System.out.println("IITBHU has spent for salary to " + Pallavi.getName()
                +" and now has Rs." + IITBHU.getTotalMoneyEarned());


        System.out.println(Pallavi);

        Harsh.receiveSalary(Harsh.getSalary());

        System.out.println(Harsh);


    }
}