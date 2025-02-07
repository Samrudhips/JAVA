//Program to reverse a string
public class TestOne {
    public static void main(String[] args) {
        String a="Hello World";
        String b="";
        for(int i=a.length()-1;i>=0;i--){
            b=b+a.charAt(i);
        }
        System.out.println(b);
    }
    
}
