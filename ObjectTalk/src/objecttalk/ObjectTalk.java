package objecttalk;

import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class ObjectTalk {

    public static void main(String[] args) {
        
        List<String> commandList = new LinkedList<String>();
        commandList.add("Roll");
        commandList.add("Jump");
        commandList.add("Bark");
        commandList.add("Lie down");
        commandList.add("Pretend dead");
        commandList.add("Give the paw");

        Random randomizer = new Random();
        Man man = new Man();
        System.out.println(man.getGreeting());
        Dog dog = new Dog();
        System.out.println(dog.getGreeting());
        for (int i = 0; i < 5; i++) {
            
                man.setCommand(commandList.get(randomizer.nextInt(commandList.size())));
                System.out.println(man.getCommand());
                dog.setAction(man);
                System.out.println(dog.getBark());
                System.out.println(dog.getAction());
                
        }
        
        System.out.println(man.getFeeling());
        System.out.println(dog.getFeeling());
        
    }

}
