import java.util.*;
public class DisplayEmployeeDetails {

        public class Employee {
            private String name;
            private int id;
            private double salary;

            public Employee(String name, int id, double salary) {
                this.name = name;
                this.id = id;
                this.salary = salary;
            }

            public void display() {
                System.out.println("name of the employee is " + name + "with id " + id + " and having salary " + salary);
            }

        }

        public static void main(String[]args) {
            DisplayEmployeeDetails dispalyDetails=new DisplayEmployeeDetails();
            Employee e=dispalyDetails.new Employee("Ram",12,10000);
            e.display();


        }

    }

