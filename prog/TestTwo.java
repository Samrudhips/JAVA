//Program to switch 2 variables without using third variable
public class TestTwo {
    public static void main(String[] args) {
        int a=10;
        int b=20;
        System.out.println("Before swapping "+a+" "+b);
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("After Swapping "+a+" "+b);
        
    }

}
