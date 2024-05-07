package Core_Java;

public class StringConcat {
    public static void main(String[] args) {
        String s1 = "I";
        String s2 = "-Am";

        String s3 = s1.concat(s2);
        System.out.println(s3);

        String s4 = "-Batman";
        String s5 = s3.concat(s4);
        System.out.println(s5);
    }
}
