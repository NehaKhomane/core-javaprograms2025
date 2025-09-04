package demo.sunbeam.FileHandling;

import java.io.*;

class Employee{
    int id;
    String name;
    double salary;

    Employee(){

    }
    Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
}


public class programdemo01 {
    public static void write(Employee e){
        try(FileOutputStream fos = new FileOutputStream("employee.txt",true)){
            try(DataOutputStream dos = new DataOutputStream(fos)){
                /** convert the state of employee into the stream of bytes**/
                dos.writeInt(e.id);
                dos.writeUTF(e.name);
                dos.writeDouble(e.salary);

            }
        } catch (FileNotFoundException ex) {
            throw new RuntimeException(ex);
        } catch (IOException ex) {
            throw new RuntimeException(ex);
        }
    }
    public static Employee read(){
        try(FileInputStream fis = new FileInputStream("employee.txt")){
            try(DataInputStream dis =new DataInputStream(fis)){
                while(true){
                    int id=dis.readInt();
                    String name=dis.readUTF();
                    double salary=dis.readDouble();
                    Employee e=new Employee(id,name,salary);
                    System.out.println(e);
                }
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    public static void main(String[] args) {
        Employee e1 = new Employee(1, "Anil", 10000);
        //Employee e2 = new Employee(2, "Mukesh", 20000);
        write(e1);
        //write(e2);
read();
    }
}
