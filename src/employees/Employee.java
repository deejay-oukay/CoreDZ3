package employees;

import organizations.Department;

public class Employee {
    private String firstName;
    private String middleName;
    private String lastName;
    private int age;
    private String post;
    private String phoneNumber;
    private float salary;
    private Department department;

    public Employee(String firstName, String middleName, String lastName, int age, String post, String phoneNumber, float salary) {
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.age = age;
        this.post = post;
        this.phoneNumber = phoneNumber;
        this.salary = salary;
    }

    // (i) Надеюсь не имелось ввиду использование интерфейса Comparable, т.к. в данном случае вполне можно обойтись без него...
    public float compareSalary(Employee e) {
        return this.getSalary() - e.getSalary();
    }

    @Override
    public String toString() {
        return "{" +
                "firstName='" + firstName + '\'' +
                ", middleName='" + middleName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", post='" + post + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", salary=" + salary +
                "}\n";
    }

    public float getSalary() {
        return salary;
    }

    public int getAge() {
        return age;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public String getLastName() {
        return lastName;
    }
}
