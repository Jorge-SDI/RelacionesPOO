import Agregacion.Department;
import Agregacion.Institute;
import Agregacion.Student;
import Asociacion.Bank;
import Asociacion.Employee;
import Composicion.House;
import Composicion.Room;

import java.util.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        Scanner in = new Scanner(System.in);
        System.out.println("=====Relaciones POO====");
        System.out.println("1) Asociación");
        System.out.println("2) Agregación");
        System.out.println("3) Composición");
        System.out.print("Opción: ");
        int opcion = in.nextInt();

        switch (opcion) {
            case 1:
                // Creating Employee objects
                Employee emp1 = new Employee("Ridhi");
                Employee emp2 = new Employee("Vijay");

                // adding the employees to a set
                Set<Employee> employees = new HashSet<>();
                employees.add(emp1);
                employees.add(emp2);

                // Creating a Bank object
                Bank bank = new Bank("ICICI");

                // setting the employees for the Bank object
                bank.setEmployees(employees);

                // traversing and displaying the bank employees
                for (Employee emp : bank.getEmployees()) {
                    System.out.println(emp.getEmployeeName()
                            + " belongs to bank "
                            + bank.getBankName());
                }
                break;
            case 2:
                // Creating independent Student objects
                Student s1 = new Student("Parul", 1);
                Student s2 = new Student("Sachin", 2);
                Student s3 = new Student("Priya", 1);
                Student s4 = new Student("Rahul", 2);

                // Creating an list of CSE Students
                List<Student> cse_students = new ArrayList<Student>();
                cse_students.add(s1);
                cse_students.add(s2);

                // Creating an initial list of EE Students
                List<Student> ee_students = new ArrayList<Student>();
                ee_students.add(s3);
                ee_students.add(s4);

                // Creating Department object with a Students list
                // using Aggregation (Department "has" students)
                Department CSE = new Department("CSE", cse_students);
                Department EE = new Department("EE", ee_students);

                // Creating an initial list of Departments
                List<Department> departments = new ArrayList<Department>();
                departments.add(CSE);
                departments.add(EE);

                // Creating an Institute object with Departments list
                // using Aggregation (Institute "has" Departments)
                Institute institute = new Institute("BITS", departments);

                // Display message for better readability
                System.out.print("Total students in institute: ");

                // Calling method to get total number of students
                // in the institute and printing on console
                System.out.print(
                        institute.getTotalStudentsInInstitute());
                break;
            case 3:
                House house = new House("Dream House");

                house.addRoom(new Room("Living Room"));
                house.addRoom(new Room("Bedroom"));
                house.addRoom(new Room("Kitchen"));
                house.addRoom(new Room("Bathroom"));

                int r = house.getTotalRooms();
                System.out.println("Total Rooms: " + r);

                System.out.println("Room names: ");
                for (Room room : house.getRooms()) {
                    System.out.println("- " + room.getRoomName());
                }
                break;
            default:
                System.out.println("No existe opción");
                break;
        }

    }
}