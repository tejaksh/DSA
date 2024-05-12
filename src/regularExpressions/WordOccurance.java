package regularExpressions;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class WordOccurance {
    public static void main(String[] args) {
        Pattern pattern = Pattern.compile("Hi", Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(" hi world");
        System.out.println(Pattern.matches("[ST][a-z]{4}", "Tejas"));
        /*boolean matchFound = matcher.find();
        if(matchFound){
            System.out.println("Match Found");
        }
        else{
            System.out.println("Match Not Found");
        }*/
    }
}

/*
public class WordOccurance {

    static boolean wordMatcher(String string){
        Pattern pattern = Pattern.compile(string, Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher("hi world");
        boolean matchFound = matcher.find();

        if(matchFound){
            System.out.println("Match Found");
        }
        else{
            System.out.println("Match Not Found");
        }
        return false;
    }

    public static void main(String[] args) {
        WordOccurance word = new WordOccurance();
        word.wordMatcher("hi");

    }
}




*/
