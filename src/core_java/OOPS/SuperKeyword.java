package core_java.OOPS;


class Animal{ //base class
    String color = "white"; //base class data member
    String sound = "Meow Meow";
}

class Cat extends Animal{ //child class
    Cat(){ //default constructor of child class
        String color = "brown"; //child class data member
        System.out.println("The cat color is: " + super.color); //print white(parent class is referred here)
        System.out.println("The cat sound is: " + super.sound); //print meow meow(parent class is referred here)
        System.out.println("The cat color is: " +  color);// print brown
    }
}
public class SuperKeyword extends Cat{
    SuperKeyword(){ //default contructor
        super(); //calling base class constructor
        System.out.println();
    }
    public static void main(String[] args) {
        new SuperKeyword();
    }
}
