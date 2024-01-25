package organizations;

import employees.Employee;

import java.util.ArrayList;
import java.util.List;

public class Organization {
    private String name;
    private int empCount;
    private String address;
    private List<Department> depList;
    private Employee manager;

    public Organization(String name, int empCount, String address, Employee manager) {
        this.name = name;
        this.empCount = empCount;
        this.address = address;
        this.manager = manager;
        depList = new ArrayList<Department>();
    }

    public Organization() {
        depList = new ArrayList<Department>();
    }

    @Override
    public String toString() {
        return "organizations.Organization{" +
                "name='" + name + '\'' +
                ", empCount=" + empCount +
                ", address='" + address + '\'' +
                ", depList=" + depList +
                ", manager=" + manager +
                '}';
    }

    public String getName() {
        return name;
    }

    public void addDepartment(Department dep){
        depList.add(dep);
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getEmpCount() {
        return empCount;
    }

    public void setEmpCount(int empCount) {
        this.empCount = empCount;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public List<Department> getDepList() {
        return depList;
    }

    public void setDepList(List<Department> depList) {
        this.depList = depList;
    }

    public Employee getManager() {
        return manager;
    }

    public void setManager(Employee manager) {
        this.manager = manager;
    }
}
