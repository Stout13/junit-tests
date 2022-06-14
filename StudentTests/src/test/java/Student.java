package test.java;

import java.util.ArrayList;
import java.util.List;

public class Student {

    public static void main(String[] args) {
    }
    public String name = "Bjork";
    public List<Integer> grades = new  ArrayList<Integer>();
    public long id = 0;
    public Student() {
    }
    public Student(String namen, ArrayList<Integer> gpa, Integer DL) {
        this.name = namen;
        this.grades = gpa;
        this.id = DL;
    }
    public Student(String nombre) {
        this.name = nombre;
    }

    public ArrayList<Integer> getGrades(){
        return (ArrayList<Integer>) this.grades;
    }

    public long getId() {
        return this.id;
    }
    // returns the student's name
    public String getName() {
        return this.name;
    }
    // adds the given grade to the grades property
    public void addGrade(int grade) {

        this.grades.add((int) grade);
    }
    // returns the average of the students grades
    public double getGradeAverage() {
        double sum = 0;
        double numAsmt = 0;
        for (Integer grade : grades) {
            sum += grade;
            numAsmt += 1;
        }
        return sum / numAsmt;
    }
}