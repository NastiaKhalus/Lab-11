package ua.edu.ucu.apps;
import ua.edu.ucu.apps.task1.Student;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class task1Test {
    @Test
    public void testStudentBuilder() {
        Student student = Student.builder()
                .firstName("John")
                .lastName("Doe")
                .age(20)
                .email("john.doe@example.com")
                .gender("Male")
                .course("Math")
                .course("Physics")
                .build();

        assertEquals("John", student.getFirstName());
        assertEquals("Doe", student.getLastName());
        assertEquals(20, student.getAge());
        assertEquals("john.doe@example.com", student.getEmail());
        assertEquals(2, student.getCourses().size());
        assertTrue(student.getCourses().contains("Math"));
    }
}
