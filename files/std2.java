//Serializable and deserializable

import java.io.*;
class student implements Serializable{
    int id;
    String name;
    
    student(int id, String name){
        this.id=id;
        this.name=name;
    }
    void display(){
        System.out.println("ID: "+ id);
        System.out.println("Name: "+name);
    }
}

public class std2 {
    public static void main (String[] args){
        student s1 = new student(01, "Rishav Raj");
        s1.display();

        try{
            student s2 = new student(0, "Ryan");
              FileOutputStream r1 = new FileOutputStream("r1.set");
              ObjectOutputStream r2 = new ObjectOutputStream(r1);
              System.out.print("Serialization:\n");
              r2.writeObject(s2);
              r2.close();

              System.out.println("Deserialization: \n");
              FileInputStream r3 = new FileInputStream("r1.set");
              ObjectInputStream r4 = new ObjectInputStream(r3);
              student s3 = (student) r4.readObject();
               s2.display();
              s3.display();
              r4.close();
        }catch(IOException | ClassNotFoundException e){
            System.out.println("error found : "+ e);
        }
    }
}
