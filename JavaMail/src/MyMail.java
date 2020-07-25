import java.util.Properties;
import java.util.Date;

import javax.activation.DataHandler;
import javax.activation.DataSource;
import javax.activation.FileDataSource;
import javax.mail.*;                  // Include Authenticator, Message, PasswordAuthentication, Session, Transport
import javax.mail.internet.*;     // Include InternetAddress, MimeMessage
public class MyMail {
    public static void main(String[] args) {
        final String SSL_FACTORY = "javax.net.ssl.SSLSocketFactory";  
        Properties prop = System.getProperties();
        prop.setProperty("mail.smtp.host", "smtp.gmail.com");   
        prop.setProperty("mail.smtp.socketFactory.class", SSL_FACTORY);   
        prop.setProperty("mail.smtp.socketFactory.fallback", "false");   
        prop.setProperty("mail.smtp.port", "465");   
        prop.setProperty("mail.smtp.socketFactory.port", "465");   
        prop.put("mail.smtp.auth", "true");   
        final String user = "jinniu87@gmail.com";
        final String password = "niujin123";
        Session session = Session.getDefaultInstance(prop, new Authenticator() {
            protected PasswordAuthentication getPasswordAuthentication() { 
		return new PasswordAuthentication(user, password); 		} 
            });
        try {		
            Message msg = new MimeMessage(session);
            msg.setFrom(new InternetAddress("jinniu87@gmail.com"));         
            msg.setRecipient(Message.RecipientType.TO, new InternetAddress("niujin223@gmail.com"));
            msg.setSubject("Status report from Jin Niu");
            msg.setSentDate(new Date());
            MimeMultipart msgMultipart = new MimeMultipart("mixed");
            
            MimeBodyPart bodytext = new MimeBodyPart();
            bodytext.setText("Please see attachment.");
            msgMultipart.addBodyPart(bodytext);
           
            
//            MimeBodyPart attchment = new MimeBodyPart();   
//            attchment.setFileName("status_20130816.doc"); 
//            DataSource ds1 = new FileDataSource("D:\\status_20130816.doc");  
//            DataHandler dh1 = new DataHandler(ds1);  
//            attchment.setDataHandler(dh1); 
//            msgMultipart.addBodyPart(attchment);
            
            msg.setContent(msgMultipart);  
            Transport.send(msg);
            System.out.println("Message sent successfully!");
        } catch (Exception e) { System.out.println(e); }
    }
}
