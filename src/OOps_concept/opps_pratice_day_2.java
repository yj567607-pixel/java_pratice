package OOps_concept;

class Employee1{
    int salary;
    String name;

    public int getSalary(){
        return salary;
    }
    public String getName(){
        return name;
    }
    public void setName(String n){
        name = n;

    }



}

public class opps_pratice_day_2 {
    static void main(String[] args) {
        Employee1 pankaj = new Employee1();
        pankaj.setName  ("pankaj with harry");
        System.out.println(pankaj.getName()); 


    }


}
