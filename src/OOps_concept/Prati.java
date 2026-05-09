package OOps_concept;

class emp{
    int empid;
    String empName;
    double salary;

    void Display(){
        System.out.println("emp name = " +empName);
        System.out.println("emp Name = " +empid);
        System.out.println("salery = " +salary);

        System.out.println();
    }
}

public class Prati {
    static void main(String[] args) {

        emp emp1 = new emp();
        emp emp2 = new emp();

        System.out.println("empl1 information");

        emp1.empid = 100;
        emp1.empName = "indra";
        emp1.salary = 6000;


        emp2.empid = 200;
        emp2.empName = "rahul";
        emp2.salary = 70000;

        emp1.Display();
        System.out.println("emp2 information");
        emp2.Display();
    }
}
