class Poly {
    public int add(int a, int b){
        return a + b;
    }
    public int add(int a, int b, int c){
        return a + b + c ;
    }
    public double add(double a, double b){
        return a + b;
    }
}
public class Polymorphism{
    public static void main(String[] args) {
        Poly p = new Poly();
        System.out.println("sum of integers : " + p.add(10,20));
        System.out.println("sum of integers : " + p.add(10,20,30));
        System.out.println("sum of integers : " + p.add(10,20.5));
    }
}
