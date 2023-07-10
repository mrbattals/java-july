package Assignment31;
import java.util.Comparator;
import java.util.Objects;

public class Student implements Comparator<Student>   {
   
    private String studentName, studentContactNumber;
    private int studentId;
    private double studentGpa;

    public Student() {
    }

    public Student(String studentName, String studentContactNumber, int studentId, double studentGpa) {
        this.studentName = studentName;
        this.studentContactNumber = studentContactNumber;
        this.studentId = studentId;
        this.studentGpa = studentGpa;
    }

    public String getStudentName() {
        return this.studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getStudentContactNumber() {
        return this.studentContactNumber;
    }

    public void setStudentContactNumber(String studentContactNumber) {
        this.studentContactNumber = studentContactNumber;
    }

    public int getStudentId() {
        return this.studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public double getStudentGpa() {
        return this.studentGpa;
    }

    public void setStudentGpa(double studentGpa) {
        this.studentGpa = studentGpa;
    }

    public Student studentName(String studentName) {
        setStudentName(studentName);
        return this;
    }

    public Student studentContactNumber(String studentContactNumber) {
        setStudentContactNumber(studentContactNumber);
        return this;
    }

    public Student studentId(int studentId) {
        setStudentId(studentId);
        return this;
    }

    public Student studentGpa(double studentGpa) {
        setStudentGpa(studentGpa);
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Student)) {
            return false;
        }
        Student student = (Student) o;
        return Objects.equals(studentName, student.studentName) && Objects.equals(studentContactNumber, student.studentContactNumber) && studentId == student.studentId && studentGpa == student.studentGpa;
    }

    @Override
    public int hashCode() {
        return Objects.hash(studentName, studentContactNumber, studentId, studentGpa);
    }

    @Override
    public String toString() {
        return "{" +
            " studentName='" + getStudentName() + "'" +
            ", studentContactNumber='" + getStudentContactNumber() + "'" +
            ", studentId='" + getStudentId() + "'" +
            ", studentGpa='" + getStudentGpa() + "'" +
            "}";
    }

    @Override
    public int compare(Student student1, Student student2) {
        if(student1.studentGpa < student2.studentGpa){
            return 1;
        }else if(student1.studentGpa > student2.studentGpa){
            return -1;
        }else{
            return 0;
        }
            }
       
    }
    
    

