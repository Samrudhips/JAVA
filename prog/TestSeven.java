
//Program to print Palindrome
public class TestSeven {
    public static void main(String[] args) {
        String a="abcdvcba";
        int i=0,j=a.length()-1;
        while(i<j){
            if(a.charAt(i)!=a.charAt(j)){
                System.out.println("Not a palindrome");
                System.exit(0);
               
            }
            i++;
            j--;
        }
        System.out.println("Palindrome");

        
    }
    
}
