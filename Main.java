/*
- Abstract data type
- Requires an interface
- Resizeable, meaning if needed the capacity can either increase or decrease(however it is very slow)
- Backed by an array
- Has a bunch of methods to work with that have already been written, so that makes it easier
to work with compared to an actual array
- Just in like array, if your provide the index number the time complexity will always be
constant time O(1)
- Good for random access if you have the index and for iterating iver the items in the list
- Not very good for inserting items into the list in any position other than the end
- Not very good for deleting/removing or adding items to the list or accessing items in the
list if you dont have the index
 */

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Main {
    public static void main(String[] args) {

        // Calling it Lists because later on if I decide to change a different list
        // its a lot easier to change the specification of the list I am using
        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(new Employee("Sergey", "Pivnev", 1234));
        employeeList.add(new Employee("Kirill", "Marchenko", 4321));
        employeeList.add(new Employee("Connor", "Bedard", 2314));
        employeeList.add(new Employee("Matvei", "Michkov", 3241));

        // This is a lambdas expression, which will print out info on each employee
        employeeList.forEach(employee -> System.out.println(employee));
        System.out.println();

        // Just like an array the index starts at 0 and we can print what we need by knowing
        // the index number. This is also done in constant time or O(1)
        System.out.println(employeeList.get(1));

        // Checks if our list is empty or not
        System.out.println(employeeList.isEmpty());

        // Replacing the employee at index 1. The 1 in .set();  is the index we are replacing
        // and the second portion is what we are replacing it with
        employeeList.set(1, new Employee("Kirill", "Kaprisov", 4123));
        System.out.println(employeeList.get(2));
        System.out.println();

        // Adding an employee to the end of my list. Note: We did not have to resize the
        // arrayList because I never specified the size of it and the default value is 10.
        employeeList.add(new Employee("Lucas", "Raymond", 1414));
        employeeList.forEach(employee -> System.out.println(employee));
        System.out.println();

        // This gives us the size of the array not the capacity of it
        System.out.println(employeeList.size());
        System.out.println();

        // Adding an employee to my list however because I provided the index it won't
        // overwrite the previously written employee. Instead it will shift him and
        // the rest of the employees after him and add this employee at the index provided
        employeeList.add(3, new Employee("Logan", "Cooley", 3214));
        employeeList.forEach(employee -> System.out.println(employee));
        System.out.println();

        // Getting the backing array(the one thats holding the employees)
        Employee[] employeeArray = employeeList.toArray(new Employee[employeeList.size()]);

        System.out.println("This is the print coming from out array: ");
        for(Employee employee: employeeArray){
            System.out.println(employee);
        }
        System.out.println();

        // Checks if we contain the certain employee in our list. Note: you have to implement the equals
        // method in our Employee class so that its going to compare the individual fields against each other
        System.out.print("Do we contain this employee in our list: ");
        System.out.println(employeeList.contains(new Employee("Sergey", "Pivnev",1234)));
        System.out.println();

        // This tells us at what index is what we are looking for
        System.out.print("At what index is Matvei Michkov: ");
        System.out.println(employeeList.indexOf(new Employee("Matvei", "Michkov",3241)));
        System.out.println();

        // Removing an employee from out list using the index. Note: because we removed an employee in the middle
        // and we are dealing with an array in the background, the elements after this certain element had to be
        // shifted down one position
        employeeList.remove(2);
        employeeList.forEach(employee -> System.out.println(employee));

    }
}