package csc372Module6Option2CT;

/**
 * Student class to store roll number, name, and address.
 */
public class Student {
    int rollno;
    String name;
    String address;
  
    public Student(int rollno, String name, String address) {
    	if (rollno < 0) {
    		throw new IllegalArgumentException("Roll number must be non-negative.");
    		
    	}
    	if (name ==null || name.trim().isEmpty()) {
    		throw new IllegalArgumentException("Name must not be null or empty.");
    			
    	}
    	if (address == null || address.trim().isEmpty()) {
    		throw new IllegalArgumentException("Address must not be null or empty.");
    	}
        
    	this.rollno = rollno;
        this.name = name;
        this.address = address;
    }

    @Override
    public String toString() {
        return rollno + " " + name + " " + address;
    }
}
