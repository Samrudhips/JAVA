//Program to find Armstrong Number
import java.math.*;
public class TestSix {
    public static void main(String[] args) {
        int n=154,armstrong=0;
        int original=n;
        while(n>0){
          int temp=n%10;//3
            temp=(int)Math.pow(temp,3);//27
            armstrong=armstrong+temp;
            n=n/10;//15
    
        }
        if(armstrong==original){
            System.out.println("Armstrong number");

        }else{
            System.out.println("Not a Armstrong Number");
        }
        
        
    }

}
