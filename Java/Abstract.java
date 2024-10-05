abstract class Animal  { 
    public abstract void sound();
    public void sleep(){
      System.out.println(" the animal is sleeping");
    }   
}
class Dog extends Animal{
    public void sound(){
        System.out.println("the Dog barks");
    }
}

class Cat extends Animal{
    public void sound(){
        System.out.println("Cat can meows ");
    }
}

public class Abstract{

    public static void main(String[] args) {
        Animal myDog = new Dog();
        Animal myCAt = new Cat();

        myDog.sound();
        myCAt.sound();

        myDog.sleep();
        myCAt.sleep();


    }
}