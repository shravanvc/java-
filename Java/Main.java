
import javax.sound.sampled.SourceDataLine;

class Bird {
    void fly() {
        System.out.println("Bird can fly");
    }
}

class Parrot extends Bird {
    void color() {
        System.out.println("I am green");
    }
}

class SingleParrot extends Bird {
    void sing() {
        System.out.println("I can sing");
    }
}
class cow extends Bird {
    void whatcoloriam(){
        System.out.println("I am black");
    }
}

public class Main {
    public static void main(String[] args) {
        Parrot p = new Parrot();
        cow s = new cow();
        p.color();
        p.fly();

        SingleParrot sp = new SingleParrot();
        sp.sing();
        sp.fly();
    }
}
class A{
void testMethod(){

}
class B{
    void Method(){

    }
}
class C extends A,B{}