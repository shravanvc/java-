
import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter a year:");
        int Year = scanner.nextInt();
        if((Year % 4 == 0 && Year % 100 != 0)||(Year % 400 == 0)){
            System.out.println(Year + "is leapyear");
        }else{
            System.out.println(Year + "not a leap year");
        }
        
    }
    
}
