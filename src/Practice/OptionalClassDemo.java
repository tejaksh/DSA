package Practice;

import java.util.Optional;

public class OptionalClassDemo {
    public static void main(String[] args) {
        String[] words = new String[10];

        // Assign values to the array
        words[0] = "Hello";
        words[1] = "World";
        words[2] = "Java";
        words[3] = "Programming";
        words[4] = "Language";

        // Convert the word at index 4 to lowercase
       // String word = words[5].toLowerCase();

        Optional<String> checkNull = Optional.ofNullable(words[5]);

        if(checkNull.isPresent()){
            String word = words[1].toLowerCase();
            System.out.println(word);
        }
        else
            System.out.println("word is null");

    }
}
