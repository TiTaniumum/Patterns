package Behavioral.ChainResposobility;

public abstract class AbstractLogger {
    public static int INFO = 1;
    public static int DEBUG = 2;
    public static int ERROR  = 3;

    public AbstractLogger nextLogger;

    public int level;

    public void setNextLogger(AbstractLogger nextLogger) {
        this.nextLogger = nextLogger;
    }

    public void logMessage(int level, String message){
        if(this.level == level){
            Write(message);
        }
        if(nextLogger != null){
            nextLogger.logMessage(level,message);
        }
    }
    abstract protected void Write(String message);
}
