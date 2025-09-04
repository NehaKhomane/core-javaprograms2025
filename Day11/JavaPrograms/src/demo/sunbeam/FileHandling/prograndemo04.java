package demo.sunbeam.FileHandling;




import java.io.*;
import java.util.ArrayList;
import java.util.List;

class Emp implements Serializable {

    int empid;
    String name;
    double salary;

    Emp() {

    }

    public Emp(int empid, String name, double salary) {
        this.empid = empid;
        this.name = name;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "empid=" + empid +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
}

public class prograndemo04 {

    public static void write(List<Emp> employeeList) {
        try (FileOutputStream fos = new FileOutputStream("employee.txt")) {
            try (BufferedOutputStream bos = new BufferedOutputStream(fos)) {
                try (ObjectOutputStream oos = new ObjectOutputStream(bos)) {
                    oos.writeObject(employeeList);
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void read() {
        try (FileInputStream fis = new FileInputStream("employee.txt")) {
            try (BufferedInputStream bis = new BufferedInputStream(fis)) {
                try (ObjectInputStream ois = new ObjectInputStream(bis)) {
                    List<Emp> employeeList = (List<Emp>) ois.readObject();
                    employeeList.forEach(System.out::println);
                }
            }
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    public static void main(String[] args) {
        List<Emp> employeeList = new ArrayList<>();
        employeeList.add(new Emp(1, "Anil", 10000));
        employeeList.add(new Emp(2, "Mukesh", 20000));
        employeeList.add(new Emp(3, "Ramesh", 30000));
        employeeList.add(new Emp(4, "Suresh", 40000));
        employeeList.add(new Emp(5, "Ram", 50000));
        //write(employeeList);

        read();

    }
}
