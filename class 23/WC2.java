
public class WC2 {
    public static void main(String[] args) {
        Integer a1=100;//object-unboxing
        //Internally calling-Integer.valueOf(100)
        //Integer a1=Integer.valueOf(a);//autoboxing
        System.out.println(a1);
        int a=a1.intValue();
        System.out.println(a);
    }
    
}
