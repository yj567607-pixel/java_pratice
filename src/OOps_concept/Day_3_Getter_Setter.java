package OOps_concept;

class My_Employee{
    private int Id;
    private String name;

    public int getId(){
        return Id;

    }
    public void setId(int i){
        Id = i;
    }
    public String getName(){
        return name;

    }
    public void setName( String n){
        name = n;
    }



}

public class Day_3_Getter_Setter {
   public static void main(String[] args) {

       My_Employee pankaj = new My_Employee();
           pankaj.setId(323);
           pankaj.setName("pankaj sah");
       System.out.println("My Employee pankaj Id is = " +pankaj.getId());
       System.out.println("My Employee name is = " +pankaj.getName());



    }
}
