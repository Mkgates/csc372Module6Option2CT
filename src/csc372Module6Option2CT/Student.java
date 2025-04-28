package csc372Module6Option2CT;

/**
 * Student class to store roll number, name, and address.
 */
public class Student {
    int rollno;
    String name;
    String address;
  
    public Student(int rollno, String name, String address) {
        this.rollno = rollno;
        this.name = name;
        this.address = address;
    }

    @Override
    public String toString() {
        return rollno + " " + name + " " + address;
    }
}
