package test.java;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class StudentTest {
    public static void main(String[] args) {
        Student Mark = new Student("Mark");
        System.out.println(Mark.grades);
        Integer[] marksGrades = new Integer[]{100, 80, 95, 92, 88, 60};
        Collections.addAll(Mark.grades, marksGrades);
        System.out.println(Mark.getName());
        System.out.println(Arrays.toString(marksGrades));
        Mark.addGrade(79);
        System.out.println(Mark.grades);
        System.out.println(Mark.getGradeAverage());


        Student Sarah = new Student("Sarah");
        System.out.println(Sarah.grades);
        Integer[] SarahsGrades = new Integer[]{90, 92, 93, 88, 94, 70};
        Collections.addAll(Sarah.grades, SarahsGrades);
        System.out.println(Sarah.getName());
        System.out.println(Arrays.toString(SarahsGrades));
        Sarah.addGrade(79);
        System.out.println(Sarah.grades);
        System.out.println(Sarah.getGradeAverage());

        Student Kyle = new Student("Kyle");
        System.out.println(Kyle.grades);
        Integer[] KylesGrades = new Integer[]{84, 68, 58, 58, 88, 94};
        Collections.addAll(Kyle.grades, KylesGrades);
        System.out.println(Kyle.getName());
        System.out.println(Arrays.toString(KylesGrades));
        Kyle.addGrade(79);
        System.out.println(Kyle.grades);
        System.out.println(Kyle.getGradeAverage());

        Student Jen = new Student("Jen");
        System.out.println(Jen.grades);
        Integer[] JensGrades = new Integer[]{88, 78, 86, 72, 60, 58};
        Collections.addAll(Jen.grades, JensGrades);
        System.out.println(Jen.getName());
        System.out.println(Arrays.toString(JensGrades));
        Jen.addGrade(79);
        System.out.println(Jen.grades);
        System.out.println(Jen.getGradeAverage());
    }
}