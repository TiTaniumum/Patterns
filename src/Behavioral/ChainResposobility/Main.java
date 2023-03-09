package Behavioral.ChainResposobility;

public class Main {
    private static AbstractLogger  getChainOfLoggers(){
        AbstractLogger errorLogger = new ErrorLogger(AbstractLogger.ERROR);
        AbstractLogger fileLogger = new FileLogger(AbstractLogger.DEBUG);
        AbstractLogger consoleLogger = new ConsoleLogger(AbstractLogger.INFO);

        errorLogger.setNextLogger(fileLogger);
        fileLogger.setNextLogger(consoleLogger);

        return errorLogger;
    }
    public static void main(String[] Args){
        AbstractLogger loggerChain = getChainOfLoggers();
        loggerChain.logMessage(AbstractLogger.INFO,"This is an Information message");
        loggerChain.logMessage(AbstractLogger.ERROR, "This is an Error Message");
        loggerChain.logMessage(AbstractLogger.DEBUG, "this is a Debug Message");
    }
}
