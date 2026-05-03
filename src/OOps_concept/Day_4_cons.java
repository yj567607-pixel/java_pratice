package OOps_concept;

class Student{
    int age;
    String name;

     Student(int a,String n){
         age = a;
         name = n;

    }
    void display(){
        System.out.println("age = "+age);
        System.out.println("name= " + name);
    }
}

public class Day_4_cons {
    public static void main(String[] args) {

        Student s1 = new Student(12,"indra kumar");

        s1.display();

    }
}
