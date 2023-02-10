package Exercice_1;

/**
 * Student
 */
public class Student {

    private String stdName;
    
    private int stdRollNo;

    private int stdId;

    public Student() {
    }

    public Student(String stdName, int stdRollNo, int stdId) {
        this.stdName = stdName;
        this.stdRollNo = stdRollNo;
        this.stdId = stdId;
    }

    public String getStdName() {
        return stdName;
    }

    public void setStdName(String stdName) {
        this.stdName = stdName;
    }

    public int getStdRollNo() {
        return stdRollNo;
    }

    public void setStdRollNo(int stdRollNo) {
        this.stdRollNo = stdRollNo;
    }

    public int getStdId() {
        return stdId;
    }

    public void setStdId(int stdId) {
        this.stdId = stdId;
    }

    @Override
    public String toString() {
        return "Student [stdName=" + stdName + ", stdRollNo=" + stdRollNo +
         ", stdId=" + stdId + "]";
    }

    

    
}