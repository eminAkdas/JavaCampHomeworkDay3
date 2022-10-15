package core.logging;

public class MailLogger implements Logger{
    @Override
    public void logMesaji(String logMesaji) {
        System.out.println("Mail gönderildi: "+logMesaji);
    }
}
