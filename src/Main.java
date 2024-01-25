import employees.Employee;
import employees.Supervisor;
import organizations.Branch;
import organizations.Department;
import organizations.Organization;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Organization organization = new Organization();
        Branch b1= new Branch("Branch1",20,organization);
        Branch b2= new Branch("Branch2",25,organization);
        organization.setName("Org1");
        Department dep1 = new Department("Dep1");
        Employee employee1 = new Employee("Alexandr","Grekovich","Makedonsky",20,"GenDir","11111111111",100_000.0f);
        Employee employee2 = new Employee("Bella","Afrikanovna","Stendaper",30,"GlavBuh","22222222222",200_000.0f);
        Employee employee3 = new Employee("Vitaliy","Maydanovich","Klichko",40,"Secretary","33333333333",300_000.0f);
        Employee employee4 = new Employee("Galina","Supovna","Blanka",50,"Driver","44444444444",400_000.0f);

        // 1. Написать компаратор - метод внутри класса сотрудника, сравнивающий сотрудников по произвольному параметру.
        float compareResult = employee1.compareSalary(employee2);
        if (compareResult == 0)
            System.out.println("Зарплата сотрудника "+employee1.getLastName()+" такая же, как у сотрудника "+employee2.getLastName());
        else if (compareResult < 0)
            System.out.println("Зарплата сотрудника "+employee1.getLastName()+" меньше, чем у сотрудника "+employee2.getLastName());
        else
            System.out.println("Зарплата сотрудника "+employee1.getLastName()+" выше, чем у сотрудника "+employee2.getLastName());

        // 2. Опишите класс руководителя, наследник от сотрудника.
        // Перенесите статический метод повышения зарплаты в класс руководителя, модифицируйте метод таким образом,
        // чтобы он мог поднять заработную плату всем, кроме руководителей (использовать instanceof).
        // В основной программе создайте руководителя и поместите его в общий массив сотрудников.
        // Повысьте зарплату всем сотрудникам и проследите, чтобы зарплата руководителя не повысилась.
        Supervisor supervisor1 = new Supervisor("Danila","Bratovich","Bodrov",60,"Killer","55555555555",500_000.0f);
        Employee[] employees = new employees.Employee[]{employee1,employee2,employee3,employee4,supervisor1};
        System.out.println("Данные до повышения ЗП:\n"+Arrays.toString(employees));
        Supervisor.upSalary(employees);
        System.out.println("Данные после повышения ЗП:\n"+Arrays.toString(employees));
    }
}