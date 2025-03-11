//how to use throw?-throwing user defined exceptions

public class TestTwo {
    public static void main(String[] args) {
        try{
            throw new ArithmeticException("/by zero");

        }
        catch(ArithmeticException ae){
            System.out.println(ae.getMessage());

        }
        System.out.println("GN");
    }
    
}
