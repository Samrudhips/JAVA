//Program to reverse a string
public class TestOne {
    public static void main(String[] args) {
        String input="Hello World";
        String result="";
        for(int i=input.length()-1;i>=0;i--){
            result=result+input.charAt(i);
        }
        System.out.println(result);
    }
    
}
