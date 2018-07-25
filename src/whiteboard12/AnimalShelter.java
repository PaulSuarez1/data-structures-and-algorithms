package whiteboard12;

import java.util.LinkedList;
import java.util.Queue;

public class AnimalShelter {
    Queue<String> dog = new LinkedList<>();
    Queue<String> cat = new LinkedList<>();

    public String enqueue(String animal) {
        if (animal == "dog") {
            dog.add(animal);
        } else if (animal == "cat") {
            cat.add(animal);
        }
        return animal;
    }

    public String dequeue(String pref) {
        if (pref == "dog") {
           return dog.poll();
        } else if (pref == "cat") {
           return cat.poll();
        }
        return "uhhhhh";
    }
}
