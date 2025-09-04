package demo.sunbeam.FileHandling;



import java.io.*;
import java.util.ArrayList;
import java.util.List;

class Employees implements Serializable {
    private static final long serialVersionUID = 1L;

    int empid;
    String name;
    double salary;
    double commission;
    transient double total = salary + commission;
    static String company = "sunbeam";

    Employees() {
    }


    public Employees(int empid, String name, double salary, double commission) {
        this.empid = empid;
        this.name = name;
        this.salary = salary;
        this.commission = commission;
        this.total = this.salary + this.commission;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "empid=" + empid +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                ", commission=" + commission +
                ", total=" + total +
                ", company=" + company +
                '}';
    }
}

public class programdemo03 {

    public static void write(List<Employee> employeeList) {
        try (FileOutputStream fos = new FileOutputStream("emp6.txt")) {
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
        try (FileInputStream fis = new FileInputStream("emp6.db")) {
            try (BufferedInputStream bis = new BufferedInputStream(fis)) {
                try (ObjectInputStream ois = new ObjectInputStream(bis)) {
                    List<Employees> employeeList = (List<Employees>) ois.readObject();
                    employeeList.forEach(e -> e.total = e.salary + e.commission);
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
        List<Employees> employeeList = new ArrayList<>();
        employeeList.add(new Employees(1, "Anil", 10000, 2000));
        employeeList.add(new Employees(2, "Mukesh", 20000, 3000));
        employeeList.add(new Employees(3, "Ramesh", 30000, 4000));
        employeeList.add(new Employees(4, "Suresh", 40000, 5000));
        employeeList.add(new Employees(5, "Ram", 50000, 6000));



        read();

    }
}