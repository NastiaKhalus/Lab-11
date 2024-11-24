package ua.edu.ucu.apps;

import ua.edu.ucu.apps.task2.BirthdayMailCode;
import ua.edu.ucu.apps.task2.Client;
import ua.edu.ucu.apps.task2.MailInfo;
import ua.edu.ucu.apps.task2.MailSender;
import ua.edu.ucu.apps.task2.MailCode;


public class Main {
    public static void main(String[] args) {
        

        Client client = Client.builder()
            .name("Client Name")
            .age(100)
            .email("test@client.mail")
            .build();

        MailCode mailCode = new BirthdayMailCode();
        MailInfo mailInfo = new MailInfo(client, client1 ->"It is juct random mail!");

        MailSender mailSender = new MailSender();
        mailSender.sendMail(mailInfo);
    }
}