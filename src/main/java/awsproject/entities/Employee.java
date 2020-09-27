package awsproject.entities;

public class Employee {
    private String firstName;
    private String lastName;
    private Integer id;
    private Integer managerId;

    public Employee() {
    }

    public Employee(String firstName, String lastName, Integer id, Integer managerId) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.id = id;
        this.managerId = managerId;
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

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getManagerId() {
        return managerId;
    }

    public void setManagerId(Integer managerId) {
        this.managerId = managerId;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", id=" + id +
                ", managerId=" + managerId +
                '}';
    }

}
