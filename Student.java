package academic.mangement;


//I have make Student class here so that I can collect all the information of student in one place.

import java.util.List;

public class Student extends College{

    private String InstiId;
    private String name;
    private String grade;
    private int feesPaid;
    private int feesTotal;


//    To create a new student by initializing.
//    Fees for every student is 100000 Rs.
//    Fees paid initially is  50000.
//    then we take Id,name and grades of student.

    public Student(List<String> faculties, List<String> students, String InstiId, String name, String grade){
        super(faculties, students);
        this.feesPaid=0;
        this.feesTotal=100000;
        this.InstiId=InstiId;
        this.name=name;
        this.grade= grade;

    }
    //Student's Id and name cannot change in any case.
    // And Student's grades can be update as per student progress.
    public void setGrade(String grade){
        this.grade=grade;
    }
    //     Keep adding the fees to feesPaid Field.
//     Add the fees to the fees paid.
//     The school is going receive the funds.
    public void payFees(int fees){
        feesPaid+=fees;
        College.updateTotalMoneyEarned(feesPaid);
    }


//   return id of the student.
    public String getId() {
        return InstiId;
    }


//     return name of the student.
    public String getName() {
        return name;
    }


//    return the grade of the student.

    public String getGrade() {
        return grade;
    }

//     return fees paid by the student.
    public int getFeesPaid() {
        return feesPaid;
    }

//     return the total fees of the student.
    public int getFeesTotal() {
        return feesTotal;
    }
//     return the remaining fees.
    public int getRemainingFees(){
        return feesTotal-feesPaid;
    }

    public String toString() {
        return "Student's name :"+name+
                " \nTotal fees paid so far Rs."+ feesTotal +"\n-----------------------------------\n";
    }
}