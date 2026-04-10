class Emps{
    int Id;
    String name;
    int salary;
    static String company="STALLERBEE";
    static String objective="Space agency";
    static String owner = "RISHAV RAJ";
    Emps(int Id, String name, int salary){
    this.Id=Id;
    this.name=name;
    this.salary=salary;
    }
    void display(){
    System.out.println("EmpId: "+ Id);
    System.out.println("Emp Name: "+ name);
    System.out.println("Emp salary:"+ salary);
    System.out.println("Emp company name: "+ company);
    System.out.println("Company objective: "+ objective);
    System.out.println("Company owner: "+ owner);
    }
}

public class emp {
    public static void main(String[] args){

        Emps emp1 = new Emps(113, "RISHU", 2000);
        emp1.display();
    }
}
