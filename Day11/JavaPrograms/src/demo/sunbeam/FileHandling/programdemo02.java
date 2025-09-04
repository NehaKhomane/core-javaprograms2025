package demo.sunbeam.FileHandling;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

class Employe implements Serializable {
private int id;
private String name;
private double salary;

Employe(){

}
Employe(int id, String name, double salary) {
    this.id = id;
    this.name = name;
    this.salary = salary;
}

    @Override
    public String toString() {
        return "Employe{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
}

public class programdemo02 {
    public static  void  write(List<Employe> list){
        try(FileOutputStream fos=new FileOutputStream("emp2.txt",true)){
            try (ObjectOutputStream oos=new ObjectOutputStream(fos)) {
                oos.writeObject(list);

            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    public static List<Employe> read(){
        try( FileInputStream fileInputStream=new FileInputStream("emp2.txt")){
            try(ObjectInputStream ois =new ObjectInputStream(fileInputStream)){
                List<Employe> list=(List<Employe>) ois.readObject();
                list.forEach(System.out::println);

            } catch (ClassNotFoundException e) {
                throw new RuntimeException(e);
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            e.printStackTrace();

        }
        return List.of();
    }
    public static void main(String[] args) {
        List<Employe> list = new ArrayList<>();
        list.add(new Employe(1, "Anil", 10000));
        list.add(new Employe(2, "Mukesh", 20000));
        list.add(new Employe(3, "Ramesh", 30000));
        list.add(new Employe(4, "Suresh", 40000));
     read();
    }
}
