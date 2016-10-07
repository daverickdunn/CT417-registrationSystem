/*
 * David Richard Dunn
 * 12100858
 * d.dunn8@nuigalway.ie
 */

import com.daverickdunn.ct417.registrationsystem.*;
import org.junit.After;
import org.junit.AfterClass;
import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class studentJUnitTest {
    
    public static CourseProgramme course;
    public static Module module;
    public static Student student;
    
    public studentJUnitTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
        course = new CourseProgramme("BCT1 Bachelor of Science (Computer Science & Information Technology)");
        course.setStartDate("07-09-2016");
        course.setEndDate("30-04-2017");
        module = new Module("Software Engineering III", "CT417");
        student = new Student("John Doe", 21, "01/03/88");
    }
    
    @AfterClass
    public static void tearDownClass() {
       
    }
    
    @Before
    public void setUp() {
        System.out.println("Starting Test");
    }
    
    @After
    public void tearDown() {
         System.out.println("Test Complete");
    }

    @Test
    public void testName() {
        assertEquals(student.getUsername(), "John Doe21");
    }
 
    @Test
    public void testModule() {
        module.addStudent(student);
        assertEquals(student, module.getStudents().get(0));
    }
    
    
}
