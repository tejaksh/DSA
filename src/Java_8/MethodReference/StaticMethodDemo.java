package Java_8.MethodReference;

import java.net.CookieHandler;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Person{
    private String name;
    private Integer age;

    public Person(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
public class StaticMethodDemo {

    //method to compare by name
    public static int compareByName(Person a, Person b){
        return a.getName().compareTo(b.getName());
    }

    //method to compare by age
    public static int compareByAge(Person a, Person b){
        return a.getAge().compareTo(b.getAge());
    }

    //main method
    public static void main(String[] args) {
        List<Person> personList = new ArrayList<>();

        //add elements to the list using add() method
        personList.add(new Person("Thor", 5000));
        personList.add(new Person("Captain", 100));
        personList.add(new Person("Hulk", 50));

        //sort list by name
        //using static method reference
        Collections.sort(personList, StaticMethodDemo::compareByName);
        System.out.println("Sort by name: ");

        //using static method reference
        personList.stream().map(x -> x.getName()).forEach(System.out::println);

        //sort list by age
        //using static method reference
        Collections.sort(personList, StaticMethodDemo::compareByAge);
        System.out.println("Sort by age: ");

        //using static method reference
        personList.stream().map(x -> x.getName()).forEach(System.out::println);

    }
}
