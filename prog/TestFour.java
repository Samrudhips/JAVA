//Program to find prime number
public class TestFour {
    
    public static void main(String[] args) {
        int n=5;
        boolean b=true;
        for(int i=2;i<n;i++){
            if(n%i==0){
                b=false;
                break;
            }
        }
        System.out.println(n+" is a prime number "+b);
        
    }
}
