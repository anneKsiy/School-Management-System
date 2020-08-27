package school.management.system;

/**
 * Created by Abdullah on 27/08/2020
 * This class is responsible for keeping
 * track of a students id, name & salary
 */

public class Teacher {

    private int id;
    private String name;
    private double salary;
    private int salaryEarned;

    /**
     * Creates a new Teacher object
     * @param id id for teacher *unique*
     * @param name name for teacher
     * @param salary salary for teacher
     */

    public Teacher(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.salaryEarned = 0;
    }

    public int getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public double getSalary() {
        return this.salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void receiveSalary(double salary) {
        salaryEarned += salary;
        School.updateTotalMoneySpent(salary);
    }

    @Override
    public String toString() {
        return "Teacher Name: " + name +
                ". Teacher Salary: R" + salary +
                ". Salary earned so far: R" + salaryEarned;
    }

}
