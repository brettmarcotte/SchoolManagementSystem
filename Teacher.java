package schoolmanagementsystem;

/**
 * This class is responsible for keeping track
 * of teacher's name, id, and salary.
 */


public class Teacher {

    private int id;
    private String name;
    private int salary;
    private int grade;
    private int feesPaid;
    private int salaryEarned;

    /**
     *
     * @param id id is for the teacher
     * @param name name of the teacher
     * @param salary salary of the teacher
     */

    public Teacher(int id, String name, int salary) {
        this.id=id;
        this.name=name;
        this.salary=salary;
    }


    /**
     *
     * @return the id for the teacher
     */
    public int getId(){
        return id;
    }

    /**
     *
     * @return name of the teacher
     */
    public String getName(){
        return name;
    }

    /**
     *
     * @return the salary of the teacher
     */
    public int getSalary(){
        return salary;
    }

    /**
     * set the salary
     * @param salary
     */
    public void setSalary(int salary){
        this.salary=salary;
    }

    /**
     * Used to update the student's grade
     * @param grade new grade for the students
     */

    public void setGrade(int grade){
        this.grade=grade;
    }

    /**
     * Keep adding to the fees to feesPaid Field.
     * Add the fees to the fees paid.
     * the school is going to receive funds.
     * @param fees the fees that the student pays.
     */

    public void updateFeesPaid(int fees){
       feesPaid+=fees;

    }

    /**
     * remove from the total money earned by the school.
     * @param salary
     */

    public void receiveSalary(int salary) {

    }




}
