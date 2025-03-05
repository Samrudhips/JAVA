class Emp{}
public class StringEx {
    
    public static void main(String[] args) {
        int a=100;//primitive
        int b=200;
        int c=100;
        Emp e1=new Emp();//Emp object
        Emp e2=new Emp();
        String s1="Rahul";//string literal
        String s2="Rahul";
        String s3=new String("Rahul");
        //String created using new keyword
        String s4=new String("Rahul");
        System.out.println(a==b);//false
        System.out.println(a==c);//true
        System.out.println(s1==s2);//true
        System.out.println(s1==s3);//false
        System.out.println(s1.equals(s3));//true
        System.out.println(e1==e2);//false
        System.out.println(s3.equals(s4));//true
        System.out.println(s3==s4);//false
        System.out.println(e1.equals(e2));//false
    }
}
