//Assignment 2
//Author: Fadi Andrawis , ID: 324085174

package library;

public class Student {
    /**
     * 5 fields
     */
    protected String studentName;
    protected static int nextId = 0;
    protected final int studentId;
    protected final Publication[] borrowedPublications;
    protected int loanedNum;

    /**
     * constructor that accepts values for all instance variables
     * @param studentName the name of the student
     */

    public Student(String studentName) {
        this.studentName = studentName;
        this.loanedNum = 0;
        this.studentId = nextId;
        nextId++;
        this.borrowedPublications = new Publication[10];
    }

    /**
     *
     * @return yhe loaned number
     */

    public int getLoanedNum() {
        return loanedNum;
    }

    /**
     *
     * @param loanedNum a new loand num
     */

    public void setLoanedNum(int loanedNum) {
        this.loanedNum = loanedNum;
    }

    /**
     * a default constructor
     */

    public Student(){
        this.studentId = nextId;
        nextId++;
        this.borrowedPublications = new Publication[10];
    }

    /**
     * @return the details of the student
     */

    @Override
    public String toString() {
        return "student number:" + studentId +  '\''  + " Name: " + studentName + '\'' +
                " loaned-publications " + loanedNum;
    }
}
