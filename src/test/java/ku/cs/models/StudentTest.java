package ku.cs.models;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentTest {
    Student s1;

    @BeforeEach
    void init(){
        s1 = new Student("6610405913","Tungme");
    }

    @Test
    void testAddScore(){
        Student s1 = new Student("6610405913","Tungme");
        s1.addScore(50);
        assertEquals(50,s1.getScore());
        s1.addScore(10);
        assertEquals(60,s1.getScore());
    }

    @Test
    void testCalculateGrade(){
        Student s1 = new Student("6610405913","Tungme",50);
        s1.addScore(10);
        assertEquals("C",s1.grade());
    }

}