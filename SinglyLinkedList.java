/* - Best used if you want to insert or delete items from the front of the list
- Otherwise you would have to traverse the list in order to insert at a specific place
or the end.
- Can grow without having to resize(only bounded by the amount of memory you have)
- One disadvantage is that you have to store that extra field that points to the
next field in the list
 */

import java.util.Objects;

public class SinglyLinkedList {
    public static void main(String[] args){

        Employee sergeyPivnev = new Employee("Sergey", "Pivnev", 1234);
        Employee matveiMichkov = new Employee("Matvei", "Michkov", 4321);
        Employee connorBedard = new Employee("Connor", "Bedard", 1498 );
        Employee alexanderOvechkin = new Employee("Alexander", "Ovechkin", 1408);

        // Adding the employees one by one
        EmployeeLinkedList list = new EmployeeLinkedList();

        //Checks to see if its empty or not
        System.out.println(list.isEmpty());

        list.addToFront(sergeyPivnev);
        list.addToFront(matveiMichkov);
        list.addToFront(connorBedard);
        list.addToFront(alexanderOvechkin);

        // Gets the size of our SinglylinkedList
        System.out.println(list.getSize());

       list.printList();

       // Removing one employee from the front of the list
        list.removeFromFront();
        list.printList();
        System.out.println(list.getSize());

    }
}
/* The Employee class is a blueprint for creating Employee objects. Each Employee object has three
properties: firstName, lastName, and id, which are encapsulated  */
class Employee{

    private String firstName;
    private String lastName;
    private int id;

    Employee(String firstName, String lastName, int id) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return id == employee.id && Objects.equals(firstName, employee.firstName) && Objects.equals(lastName, employee.lastName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, id);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", id=" + id +
                '}';
    }
}
/*
The EmployeeNode class represents a node in the linked list. Each node contains an
Employee object and a reference to the next node in the list (next).
 */
class EmployeeNode{
    private Employee employee;
    private EmployeeNode next;

    public EmployeeNode(Employee employee){
        this.employee = employee;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public EmployeeNode getNext() {
        return next;
    }

    public void setNext(EmployeeNode next) {
        this.next = next;
    }

    public String toString(){
        return employee.toString();
    }
}
/* This class implements the singly linked list functionality. It primarily manages a
series of EmployeeNode objects linked together.
 */
public class EmployeeLinkedList {
    private EmployeeNode head;
    private int size;
    // 'node.setNext(head)' sets the new added employee to the previous head and then sets
    // the head to that new employee using 'head = node';
    public void addToFront(Employee employee) {

        EmployeeNode node = new EmployeeNode(employee);
        node.setNext(head);
        head = node;
        size++;
    }
    // Method to remove the node from the front
    public EmployeeNode removeFromFront(){
        if(isEmpty(){
            return null;
        }
        // Saves the current head to the removeNode variable, then point the head
        // to the next node in the list and decrement the size of our list
        EmployeeNode removeNode = head;
        head = head.getNext();
        size--;
        return removeNode;
    }

    public int getSize(){
        return size;
    }

    public boolean isEmpty(){
        return head = null;
    }
    public void printList() {

        EmployeeNode current = head;
        System.out.print("Head -> ");

        // This will print until we hit the end of the list and showcase how the employees are linked
        // together in a linked list
        while (current != null) {
            System.out.print(current);
            System.out.print(" -> ");
            current = current.getNext();
        }
        System.out.println("Null");
    }
}



