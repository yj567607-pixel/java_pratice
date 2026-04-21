package OOps_concept;

class Employee{
    int id;
    int age;
    String name;
    int salary;
    public void printDetails(){
        System.out.println("my id is = "+id);
        System.out.println("my age is = "+age);
        System.out.println("and my name is = "+name);

    }
    public int getsalary(){
        return salary;

    }
}

public class Create_Obj_Clss {
   public static void main(String[] args) {
       Employee indrakumar=new Employee();
       Employee chandan = new Employee();

       indrakumar.id = 29;
       indrakumar.age = 22;
       indrakumar.name = "yadav";

       chandan.id = 12;
       chandan.age = 32;
       chandan.name = "chutiya lora";
       chandan.salary = 21000;

       indrakumar.printDetails();
       chandan.printDetails();
       int salary=chandan.getsalary();
       System.out.println(salary);

    }

}
