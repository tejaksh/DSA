package REVISION;
    // Base Class
    class Animal {
        void eat()
        {
            System.out.println("eat() method of base class");
            System.out.println("eating.");
        }
        void sound(){
            System.out.println("Animal sound");
        }
    }

    // Inherited Class
    class Dog extends Animal {
        void eat()
        {
            //System.out.println("eat() method of derived class");
            System.out.println("Dog is eating.");
        }
        void sound(){
            System.out.println("Bark");
        }
    }

    class Cat extends Animal{
        void eat(){
            System.out.println("Cat is eating");
        }
        void sound(){
            System.out.println("Meow");
        }
    }
    public class MethodOverriding {
        // Main Function
        public static void main(String args[])
        {
//            Dog d1 = new Dog();
//            Animal a1 = new Animal();
//
//            Cat c1 = new Cat();
//            Animal a2 = new Animal();

            /*d1.eat();
            d1.sound();
            //a1.eat();
            c1.eat();
            c1.sound();
            //a2.eat();*/

            Animal animal1 = new Dog();
            Animal animal2 = new Cat();
            // eat() method of animal class is overridden by
            // base class eat()
            animal1.eat();
            animal1.sound();
            animal2.eat();
            animal2.sound();
        }
    }