package core.logging;

public class DatabaseLogger implements Logger{
    @Override
    public void logMesaji(String logMesaji) {
        System.out.println("Veritabanına loglandı: "+logMesaji);
    }
}
