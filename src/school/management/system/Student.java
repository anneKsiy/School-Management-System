package school.management.system;

/**
 * Created by Abdullah on 27/08/2020
 * This class is responsible for keeping
 * track of a students id, name, grade, fees paid & fees total
 */

public class Student {

    private int id;
    private String name;
    private int grade;
    private int feesPaid;
    private int feesTotal;

    /**
     * To create a new student by intializing:
     * Fees applied to every student: R30 000
     * Initial fees paid is R0
     * @param id : id of student *unique*
     * @param name : name of student
     * @param grade : grade of student
     */
    public Student(int id, String name, int grade) {
        this.feesPaid = 0;
        this.feesTotal = 30000;
        this.id = id;
        this.name = name;
        this.grade = grade;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getGrade() {
        return grade;
    }

    public int getFeesPaid() {
        return feesPaid;
    }

    public int getFeesTotal() {
        return feesTotal;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public void payFees(int fees) {
        feesPaid += fees;
        School.updateTotalMoneyEarned(feesPaid);
    }

    public int getRemainingFees() {
        return feesTotal - feesPaid;
    }

    @Override
    public String toString() {
        return "Student Name: " + name +
                ". Total fees paid: R" + feesPaid +
                ". Fees remaining: R" + getRemainingFees();
    }

}
