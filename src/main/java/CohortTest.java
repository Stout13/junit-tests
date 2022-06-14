//  all CohortTest methods are preexisting in Cohort.java, after writing CohortTest() from scratch
//  realized all classes were pre-existing in Cohort.java.  Reviewed methods and everything seems good.

public class CohortTest{
    public static void main(String[] args) {
    }
    @Before
    private List<Student> students = new ArrayList<>();
    }
//            same as Cohort.java
    @Before
    public CohortTest() {
        this.students = new ArrayList<>();
    }
    @Before
    public double getCohortAverage() {
        double avg = 0;
        for (Student student: this.getStudents()) {
            avg += student.getGradeAverage();
        }
        return avg / this.getStudents().size();
    }
    public List<Student> getStudents() {
            return students;
        }
    }
}
//A Cohort instance can add a Student to the List of students.
//        A Cohort instance can get the current List of students.
//        A Cohort instance can get the average, and it's being calculated correctly.