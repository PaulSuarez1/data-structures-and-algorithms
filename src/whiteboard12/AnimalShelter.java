package whiteboard12;

import java.util.LinkedList;
import java.util.Queue;

public class AnimalShelter {
    Queue<String> dog = new LinkedList<>();
    Queue<String> cat = new LinkedList<>();

    public String enqueue(String animal) {
        if (animal.equalsIgnoreCase("dog")) {
            dog.add(animal);
        } else if (animal.toUpperCase().equals("cat")) {
            cat.add(animal);
        }
        return animal;
    }

    public String dequeue(String pref) {
        if (pref.equalsIgnoreCase("dog")) {
           return dog.poll();
        } else if (pref.toUpperCase().equals("cat")) {
           return cat.poll();
        }
        return "uhhhhh";
    }
}
