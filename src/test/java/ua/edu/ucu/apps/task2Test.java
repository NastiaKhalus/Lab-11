package ua.edu.ucu.apps;
import ua.edu.ucu.apps.task2.Client;
import ua.edu.ucu.apps.task2.MailInfo;
import ua.edu.ucu.apps.task2.BirthdayMailCode;
import ua.edu.ucu.apps.task2.MailCode;
import ua.edu.ucu.apps.task2.MailSender;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class task2Test {
    @Test
    public void testMailInfo() {
        Client client = Client.builder()
                .name("Test User")
                .email("test@user.com")
                .age(25)
                .build();

        MailCode mailCode = new BirthdayMailCode();
        MailInfo mailInfo = new MailInfo(client, c -> "Happy Birthday!");

        assertEquals(client, mailInfo.getClient());
        assertEquals("Happy Birthday!", mailInfo.generate());
    }

    @Test
    public void testMailSender() {
        Client client = Client.builder()
                .name("Test User")
                .email("test@user.com")
                .age(25)
                .build();

        MailInfo mailInfo = new MailInfo(client, c -> "Test email content");
        MailSender mailSender = new MailSender();

        assertDoesNotThrow(() -> mailSender.sendMail(mailInfo));
    }
}
