package schoolmanagementsystem;

public class Student {

    private int id;
    private String name;
    private int grade;
    private int feesPaid;
    private int feesTotal;

    /**
     *create a new student by initializing.
     * Fees for every student is $30,000
     * Fees paid initially is 0.
     * @param id id is for the studemt: unique.
     * @param name name of the student.
     * @param  grade grade of the student.
     */

    public Student(int id, String name, int grade) {
        this.feesPaid=0;
        this.feesTotal=30000;
        this.id=id;
        this.name=name;
        this.grade=grade;

    }

    //Not going to alter student's name, student's id.

    /**
     * Used to update the student's grade.
     * @param grade new grade of the student
     */

    public void setGrade(int grade){
        this.grade=grade;
    }

    /**
     * feesPaid = $10,000 + 5000 + 15000
     * Add the fees to the fees paid
     * The school is going receive the funds.
     *
     * @param fees the fees that the student pays.
     */

    public void payFees(int fees){
        feesPaid+=fees;

    }

    /**
     *
     * @return id of the student
     */

    public int getId() {
        return id;
    }

    /**
     *
     * @return name of the student
     */

    public String getName() {
        return name;
    }

    /**
     *
     * @return grade of the student
     */

    public int getGrade() {
        return grade;
    }

    /**
     *
     * @returnfees paid by the student
     */

    public int getFeesPaid() {
        return feesPaid;
    }

    /**
     *
     * @return the total fees of the student
     */

    public int getFeesTotal() {
        return feesTotal;
    }

    public void add(Student student) {
    }

    /**
     *
     * @return the remaining fees
     */

    public int getRemainingFees(){
        return feesTotal-feesPaid;
    }
}
