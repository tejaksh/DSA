package Java_8.Lambda;

@FunctionalInterface
interface Sayable{
    String say(String message);
}
public class MultipleStatements {
    public static void main(String[] args) {
        Sayable person = (message) -> {
            String str1 = "Nothing to say, but...";
            String str2 = str1 + message;
            return str2;
        };
        System.out.println(person.say("Time is precious"));
    }
}
