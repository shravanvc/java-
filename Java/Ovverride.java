class Animal {
    public void sound(){
        System.out.println("animal make sound");
    }
}
class Dog extends Animal{
    //subclass method ovverride the superclass
    public void sound(){
        System.out.println("the Dog can barks");
    }
}
class Cat extends Animal{
    public void sound(){
        System.out.println("the Cat can meows");
    }
}
public class Ovverride{
    public static void main(String[] args) {
        Animal A = new Animal();
        Animal Dog = new Dog();
        Animal Cat = new Cat();

        A.sound();
        Dog.sound();
        Cat.sound();

    }

}