package ku.cs.models;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentListTest {

    @Test
    @DisplayName("Add and Find Student In StudentList")
    public void studentAddAndFindStudentInStudentList() {
        StudentList studentList = new StudentList();
        studentList.addNewStudent("6610405913","Tungme");
        studentList.addNewStudent("6610402221","Thing",100);

        Student student = studentList.findStudentById("6610405913");

        String expected = "Tungme";
        String actual = student.getName();
        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Add Score To Student")
    public void studentAddScore() {
        StudentList studentList = new StudentList();
        studentList.addNewStudent("6610405913","Tungme");
        studentList.addNewStudent("6610402221","Thing",100);

        studentList.giveScoreToId("6610402221",200);

        Student student = studentList.findStudentById("6610402221");
        double actual = student.getScore();

        assertEquals(300,actual);
    }

    @Test
    @DisplayName("View Student Grade")
    public void studentViewGrade() {
        StudentList studentList = new StudentList();
        studentList.addNewStudent("6610405913","Tungme");
        studentList.addNewStudent("6610402221","Thing",100);

        studentList.giveScoreToId("6610402221",200);

        String actual = studentList.viewGradeOfId("6610402221");

        assertEquals("A",actual);
    }

    @Test
    @DisplayName("View Student Grade If Student Don't Exist")
    public void studentViewGradeDoNotExist() {
        StudentList studentList = new StudentList();
        studentList.addNewStudent("6610405913","Tungme");
        studentList.addNewStudent("6610402221","Thing",100);

        String actual = studentList.viewGradeOfId("xxxxxxxxxx");

        assertNull(actual);
    }
}