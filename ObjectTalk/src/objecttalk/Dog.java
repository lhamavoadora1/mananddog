package objecttalk;

public class Dog {

    String greeting = "Greets*";
    String feeling = "Just chillin' bro!*";
    String label = "Dog: *";
    String bark = "Bark! ";
    String barking;
    String action;
    
    public String getFeeling() {
        return label + this.feeling;
    }
    
    public String getGreeting() {
        return label + this.greeting;
    }

    public void setAction(Man m) {

        barking = "";
        String command = m.command;
        if (command != null) {
            this.action = label + command + "*";
            for (int i = 0; i < command.length(); i++) {
                this.barking += bark;
            }
        }

    }

    public String getAction() {

        if (action == null) {
            return this.action = label + "Stares*";
        } else {
            return this.action;
        }

    }

    public String getBark() {

        return this.barking;

    }

}
