package objecttalk;

public class Man {
    
    String greeting = "Hey Doggy!";
    String feeling = "How you're doing doggy?";
    String label = "Man: ";
    String command;
    
    public String getFeeling() {
        return label + this.feeling;
    }
    
    public String getGreeting() {
        return label + this.greeting;
    }

    public String getCommand() {
        return label + this.command;
    }

    public void setCommand(String command) {
        this.command = command;
    }

}
