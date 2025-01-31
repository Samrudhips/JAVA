public class Test {
    int a=100;//instance variable
    int b=200;//instance variable
    static int c=300;
    public static void main(String[] args) {
        Test t1=new Test();//1st object is created
        Test t2=new Test();//2nd object is created
        System.out.println(t1.a+t2.b+c);//600
        t2.a=11;//Updating value from 100 to 11 in t2 object
        System.out.println(t1.a+t1.b);//300
        System.out.println(t2.a+t2.b);//211
       
    
}
}
