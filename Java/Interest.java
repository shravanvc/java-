
import java.util.Scanner;

public class Interest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("p : ");
        int p = scanner.nextInt();

        System.out.println("t : ");
        int t = scanner.nextInt();
    
        System.out.println("r : ");
        int r = scanner.nextInt();
    

    
       System.out.println("the interest is : " + (p*t*r/100));
    }
    
}
