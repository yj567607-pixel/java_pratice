package OOps_concept;

class SalaryCalculator{

    void CalculateSalary(double Salary){
        System.out.println("Basic salary = "+Salary);
    }

    void CalculateSalary(double Salary,double bouns){
        System.out.println("bouns = "+bouns);
       double  Finalsalary = Salary+bouns;
        System.out.println("final salary = "+Finalsalary);
    }

    void CalculateSalary(double Salary,double bouns,double Tax){
        System.out.println("tax = "+ Tax);
        double actualsalary = Salary+bouns-Tax;
        System.out.println("actual Salary = "+actualsalary);
    }
}

public class Polymorphism {
    static void main(String[] args) {

        SalaryCalculator sa1= new SalaryCalculator();
        sa1.CalculateSalary(10000);
        sa1.CalculateSalary(10000,500);
        sa1.CalculateSalary(10000,500,300);
    }

}
