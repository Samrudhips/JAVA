//Program to convert string from uppercase to lowercase and vice-versa 
public class TestThree {
    public static void main(String[] args) {
        String s="helloworld";
        StringBuffer sb=new StringBuffer(s);
        for(int i=0;i<=s.length()-1;i++){
            if(Character.isLowerCase(s.charAt(i))){
                sb.setCharAt(i,Character.toUpperCase(s.charAt(i)));
            }
            else if(Character.isUpperCase(s.charAt(i))){
                sb.setCharAt(i,Character.toLowerCase(s.charAt(i)));
            }
        }
        System.out.println(sb);
    }
    
}
