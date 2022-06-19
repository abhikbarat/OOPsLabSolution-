package labAssignmentOOP;

public class Employee {
	public String firstName;
    public String lastName;
    
    public Employee(final String firstName, final String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }
    
    public String getfirstName() {
        return this.firstName;
    }
    
    public String getlastName() {
        return this.lastName;
    }
}

