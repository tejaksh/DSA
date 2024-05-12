package core_java;

public class StringBufferAndBuilder {
    public static void main(String[] args) {
        String s1 = "hello";
        String s2 = s1.concat(" world");
        /*System.out.println(s1);
        System.out.println(s2);
*/
        StringBuffer sf = new StringBuffer("Hey");
        //Append a String
        sf.append("world");
        System.out.println("append: " + sf);

        //Insert a String at a specific position
        sf.insert(5, "how");
        System.out.println("Insert: " + sf);

        //
        String result = sf.toString();
        System.out.println(result);


    }
}
