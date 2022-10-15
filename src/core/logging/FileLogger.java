package core.logging;

public class FileLogger implements Logger{
    @Override
    public void logMesaji(String logMesaji) {
        System.out.println("Dosyaya loglandı: "+logMesaji);
    }
}
