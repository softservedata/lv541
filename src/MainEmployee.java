import com.softserve.edu.Employee;

public class MainEmployee {
    public static void main(String[] args) {
        Employee employee1 = new Employee("Anna");
        employee1.setHours(130);
        employee1.setRate(1000);
        Employee employee2 = new Employee("Igor");
        employee2.setHours(125);
        employee2.setRate(800);
        Employee employee3 = new Employee("Oleg");
        employee3.setHours(120);
        employee3.setRate(1500);
        System.out.println("The first employee " + employee1.getName() + " has a salary of " + employee1.getSalary() + " UAH");
        System.out.println("After changing the rate " + employee1.getName() + "`s salary becomes " + employee1.changeRate(1300) + " UAH");
        System.out.println("Possible bonuses for " + employee1.getName() + " are " + employee1.getBonuses() + " UAH");
        System.out.println("");
        System.out.println("The second employee " + employee2.getName() + " has a salary of " + employee2.getSalary() + " UAH");
        System.out.println("After changing the rate " + employee2.getName() + "`s salary becomes " + employee2.changeRate(1400) + " UAH");
        System.out.println("Possible bonuses for " + employee2.getName() + " are " + employee2.getBonuses() + " UAH");
        System.out.println("");
        System.out.println("The third employee " + employee3.getName() + " has a salary of " + employee3.getSalary() + " UAH");
        System.out.println("After changing the rate " + employee3.getName() + "`s salary becomes " + employee3.changeRate(1600) + " UAH");
        System.out.println("Possible bonuses for " + employee3.getName() + " are " + employee3.getBonuses() + " UAH");
        System.out.println("");
        System.out.println("The total salary of all workers = " + Employee.totalSum + " UAH");

    }
}
