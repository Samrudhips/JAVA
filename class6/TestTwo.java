public class TestTwo {
    int a;//instance variable
    static int b;//static variable
    public static void main(String[] args) {
        int c=300;//local variable
        TestTwo t1=new TestTwo();
        System.out.println(t1.a+t1.b+c);//0+0+300=300
        TestTwo t2=new TestTwo();
        t2.a=101;
        Test.b=11;
        System.out.println(t1.a+t2.a+t1.b);//0+101+11=112
        b=15;
        System.out.println(t1.b+t2.b+b+Test.b);//14+14+14+14=56
    }
    
}
