package ua.edu.ucu.apps;

import ua.edu.ucu.apps.task3.User;
import ua.edu.ucu.apps.task3.ProxyImage;
import ua.edu.ucu.apps.task3.Gender;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class task3Test {
    @Test
    public void testProxyImage() {
        ProxyImage proxyImage = new ProxyImage("test-image.png");

        assertDoesNotThrow(proxyImage::display);
    }

    @Test
    public void testUserConstructors() {
        User user1 = new User("Alice", 30, Gender.FEMALE, 60.0, 165.0);
        assertEquals("Alice", user1.getName());
        assertEquals(30, user1.getAge());
        assertEquals(Gender.FEMALE, user1.getGender());

        User user2 = new User("Bob", 25, Gender.MALE);
        assertEquals("Bob", user2.getName());
        assertEquals(25, user2.getAge());
        assertEquals(Gender.MALE, user2.getGender());

        User user3 = new User("Charlie", Gender.MALE);
        assertEquals("Charlie", user3.getName());
        assertEquals(Gender.MALE, user3.getGender());
    }
}
