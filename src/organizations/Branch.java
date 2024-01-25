package organizations;

import employees.Employee;

import java.util.ArrayList;
import java.util.List;

/**
 * Филиал
 */
public class Branch extends Organization{
    private Organization org;
    private List<Employee> employees;

    public Branch(String name, int empCount, Organization org) {
        employees = new ArrayList<Employee>();
        this.org = org;
        setName(name);
        setEmpCount(empCount);
    }

    public List<Employee> getEmployees() {
        return employees;
    }
}
