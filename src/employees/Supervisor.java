package employees;

public class Supervisor extends Employee {
    public Supervisor(String firstName, String middleName, String lastName, int age, String post, String phoneNumber, float salary) {
        super(firstName, middleName, lastName, age, post, phoneNumber, salary);
    }

    // (i) Метод был перенесён, а не скопирован: класс-источник удалён за ненадобностью (в нём не осталось других методов)
    public static void upSalary(Employee[] employees) {
        for (Employee employee: employees) {
            if ((employee.getAge() > 45) && (!(employee instanceof Supervisor)))
                employee.setSalary(employee.getSalary()+5000);
        }
    }

}
