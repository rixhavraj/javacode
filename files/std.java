//Serializable and deserializable

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.io.FileOutputStream;

class student{
    int id;
    String name;
    static int marks=90;

    student(int id, String name){
        this.id=id;
        this.name=name;
    }
}

class student2 implements Serializable{
    int uid;
    String name2;

    student2(int uid, String name2){
        this.uid=uid;
        this.name2=name2;
    }
}

public class std {
    public static void main(String[] args){
        student s1 = new student(001, "Rishav");

        try{
            FileWriter fw = new FileWriter("Student.txt");
        fw.write("This is first file in java ");
        fw.write("\nID: " +s1.id);
        fw.write("\n Name: "+ s1.name);
        fw.write("\n marks: "+s1.marks);
        fw.close();
        System.out.println("File created succesfully\n");

        //read the file in the terminal
        BufferedReader br = new BufferedReader(new FileReader ("student.txt"));
        String line;
        System.out.println("Displaying the file data");
        while((line = br.readLine())!=null){
            System.out.print(line);
        }
        br.close();
        }catch(IOException e){
            System.out.println("Error: "+ e);
        }

        try{
            student2 su = new student2(1, "Rishav");
            FileOutputStream fs = new FileOutputStream("Studen.txt");
            ObjectOutputStream ob = new ObjectOutputStream (fs);
            ob.writeObject(su);
            ob.close();
            fs.close();
        }catch(IOException e){
            System.out.println("error: "+e);
        }
    }
}
