package schoolmanagementsystem;

import java.util.List;

/**
 * many teachers, many students
 * implements teachers and students
 */

public class School {

    private List <Teacher> teacher;
    private List<Student> student;
    private int totalMoneyEarned;
    private int totalMoneySpent;

    public School(List<Teacher> teachers, List<Student> students){
        this.teacher = teachers;
        this.student = students;
        totalMoneyEarned=0;
        totalMoneySpent=0;
    }

    /**
     * the list of teachers in the school
     * @return
     */

    public List<Teacher> getTeacher() {
        return teacher;
    }

    /**
     *
     * @param teacher the teacher to be added.
     */

    public void addTeacher(Student teacher) {
        student.add(teacher);

    }

    public void setTeacher(List<Teacher> teacher) {
        this.teacher = teacher;
    }

    public List<Student> getStudent() {
        return student;
    }


    public void addStudent(Student student) {
        student.add(student);
    }

    public void setStudent(List<Student> student) {
        this.student = student;
    }

    public int getTotalMoneyEarned() {
        return totalMoneyEarned;
    }

    public void setTotalMoneyEarned(int totalMoneyEarned) {
        this.totalMoneyEarned = totalMoneyEarned;
    }

    public int getTotalMoneySpent() {
        return totalMoneySpent;
    }

    public void setTotalMoneySpent(int totalMoneySpent) {
        this.totalMoneySpent = totalMoneySpent;
    }
}
