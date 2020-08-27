package school.management.system;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Abdullah on 27/08/2020
 */

public class Main {
    public static void main(String[] args) {
        Teacher Ismaeel = new Teacher(1, "Ismaeel", 17000);
        Teacher Nizar = new Teacher(2, "Nizar", 10000);
        Teacher Nurjehaan = new Teacher(3, "Nurjehaan", 21000);

        List<Teacher> teacherList = new ArrayList<>();
        teacherList.add(Ismaeel);
        teacherList.add(Nizar);
        teacherList.add(Nurjehaan);

        Student Abdullah = new Student(1, "Abdullah", 12);
        Student Qudsiya = new Student(2, "Qudsiya", 12);
        Student Muhammad = new Student(3, "Muhammad", 10);

        List<Student> studentList = new ArrayList<>();
        studentList.add(Abdullah);
        studentList.add(Qudsiya);
        studentList.add(Muhammad);

        School CptHS = new School(teacherList, studentList);

        Abdullah.payFees(30000);
        Qudsiya.payFees(30000);

        System.out.println("Cape Town High has earned: R" + CptHS.getTotalMoneyEarned());

        System.out.println("--------------Making CPT HIGH PAY SALARY---------------------");
        Nizar.receiveSalary(Nizar.getSalary());
        System.out.println("Cape Town High has paid salary to: " + Nizar.getName() + " of amount: R" + Nizar.getSalary());
        System.out.println(Qudsiya);
        System.out.println(Nizar);

    }
}
