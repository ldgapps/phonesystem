// 
// Decompiled by Procyon v0.5.36
// 

package phonesystem;

import javax.mail.Transport;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.mail.Message;
import javax.mail.Address;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.swing.JLabel;
import DB.Metodos;
import javax.mail.Session;
import java.util.Properties;

public class Email
{
    private Properties pro;
    private String password;
    private Session session;
    private Metodos metodos;
    
    public Email() {
        this.pro = new Properties();
    }
    
    public void envio(final String email, final String mensa, final JLabel error) {
        try {
            final Properties props = new Properties();
            props.setProperty("mail.smtp.host", "smtp.gmail.com");
            props.setProperty("mail.smtp.starttls.enable", "true");
            props.setProperty("mail.smtp.port", "587");
            props.setProperty("mail.smtp.auth", "true");
            final Session session = Session.getDefaultInstance(props);
            final String correoRemitente = this.metodos.email();
            final String passwordRemitente = this.metodos.contra();
            final String correoReceptor = email;
            final String asunto = this.metodos.empresa();
            final String mensaje = mensa;
            final MimeMessage message = new MimeMessage(session);
            message.setFrom((Address)new InternetAddress(correoRemitente));
            message.addRecipient(Message.RecipientType.TO, (Address)new InternetAddress(correoReceptor));
            message.setSubject(asunto);
            message.setText(mensaje, "ISO-8859-1", "html");
            final Transport t = session.getTransport("smtp");
            t.connect(correoRemitente, passwordRemitente);
            t.sendMessage((Message)message, message.getRecipients(Message.RecipientType.TO));
            error.setText("Enviado al correo");
            t.close();
        }
        catch (Exception ex) {
            this.metodos.addpendiente(email, mensa);
            error.setText("Pendiente por enviar");
            Logger.getLogger(Email.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void envio(final String id, final JLabel error) {
        try {
            final Properties props = new Properties();
            props.setProperty("mail.smtp.host", "smtp.gmail.com");
            props.setProperty("mail.smtp.starttls.enable", "true");
            props.setProperty("mail.smtp.port", "587");
            props.setProperty("mail.smtp.auth", "true");
            final Session session = Session.getDefaultInstance(props);
            final String correoRemitente = this.metodos.email();
            final String passwordRemitente = this.metodos.contra();
            final String correoReceptor = this.metodos.emailpendiente(id);
            final String asunto = this.metodos.empresa();
            final String mensaje = this.metodos.mensajependiente(id);
            final MimeMessage message = new MimeMessage(session);
            message.setFrom((Address)new InternetAddress(correoRemitente));
            message.addRecipient(Message.RecipientType.TO, (Address)new InternetAddress(correoReceptor));
            message.setSubject(asunto);
            message.setText(mensaje, "ISO-8859-1", "html");
            final Transport t = session.getTransport("smtp");
            t.connect(correoRemitente, passwordRemitente);
            t.sendMessage((Message)message, message.getRecipients(Message.RecipientType.TO));
            t.close();
            this.metodos.pendienteenviado(id);
            error.setText("Enviado al correo");
        }
        catch (Exception ex) {
            error.setText("Pendiente por enviar");
            Logger.getLogger(Email.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
