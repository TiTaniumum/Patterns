package Behavioral.ChainResposobility;

public class ErrorLogger extends AbstractLogger{
    public ErrorLogger(int level) {
        this.level = level;
    }

    @Override
    protected void Write(String message) {
        System.out.println("Error Console logger -> Error: " + message);
    }
}
