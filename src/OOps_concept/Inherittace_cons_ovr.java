package OOps_concept;

class MyEmployee{
    String EmployeeName;
    int Salary;

    MyEmployee(String name,int sa){
        EmployeeName = name;
        Salary = sa;

    }

}

class Developer extends MyEmployee{
    int bouns = 200;

    Developer(String Name ,int sa ){

        super (Name,sa);
    }

    void CalculateSalary(){
        int TotalSalary = Salary+bouns;
        System.out.println("Employee name = "+EmployeeName);
        System.out.println("Employee Salary = "+Salary);
        System.out.println("employee bouns = "+bouns);
        System.out.println("employee total salary = "+TotalSalary);


    }
}

public class Inherittace_cons_ovr {
    static void main(String[] args) {
        Developer dv1 = new Developer("indra kumar",10000);
        dv1.CalculateSalary();
    }

}
