public class Swap {
    public static void main(String[] args) {
        int a = 10;
        int b = 25;

        System.out.println("before swapping : " + a );

        int temp = a;
        a = b;
        temp = b;

        System.out.println("after swapping :  a = " + a + " b = " + b );
    }
    
} 
