
public class Car {
    //public class InstanceMethod {
   // public void Display(String name) {
   //   System.out.println("Name:" + Name);a
   // }
   // public static int square(int number){
   //  return number * number;
   // }


   //constructor
   public Car(String brand, int year){
    this.brand = brand;
    this.year = year;
   }

   public void DisplayCarinfo(){
    System.out.println("car brand: " + brand);
    System.out.println("manufacturer: " + year);

   }
    public static void main(String[] args) {
       // InstanceMethod a = new InstanceMethod();
       // a.Display("yogi");
       // int result = InstanceMethod.square(5);
       // System.out.println("square of 5 is : " + result);
       Car myCar = new Car("BMW" 1995);
       myCar.DisplayCarinfo();
    }
}
