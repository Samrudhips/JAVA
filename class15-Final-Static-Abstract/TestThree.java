//final variable
public class TestThree{
    final int min_bal=300;
    public static void main(String[] args) {
        TestThree a1=new TestThree();
        System.out.println(a1.min_bal);//300
        // a1.min_bal=100;//cannot reassign value to a final variable
        // System.out.println(a1.min_bal);
    }
}