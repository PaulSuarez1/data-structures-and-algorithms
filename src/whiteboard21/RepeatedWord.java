package whiteboard21;

import java.util.HashSet;

public class RepeatedWord {
    public static String repeatedWord (String input) {
        HashSet<String> words = new HashSet<>();
        String[] wordsArr = input.toLowerCase().split(" ");

        String repeatedWord = null;

        for (int i = 0; i < wordsArr.length; i++) {
            if (!words.contains(wordsArr[i])) {
                words.add(wordsArr[i]);
            } else {
                repeatedWord = wordsArr[i];
                return repeatedWord;
            }
        }
        return repeatedWord;
    }
}
