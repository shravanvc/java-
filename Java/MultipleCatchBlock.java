public class MultipleCatchBlock {
    public static void main(String[] args) {
        try {
            int arr[] = new int[5];
            arr[5] = 30;
            
        } catch (ArithmeticException e) {
          System.out.println("AirthmaticException divisible by zero");
        } catch(ArrayIndexOutOfBoundsException e){
            System.out.println("ArrayIndexoutOfBondException :array index out of bound ");
        } finally{
            System.out.println("Exception : some other exception occured");
        }
        System.err.println("Rest of the code");
    }
    
}
