package pack1;

public class A {
    public void m1(){
        System.out.println("class A m1-public method");
    }
    private void m2(){
        System.out.println("class A m2-private method");
    }
    protected void m3(){
        System.out.println("class A m3-protected method");
    }
    void m4(){
        //default method
        System.out.println("class A m4-default<>method");
    }
}
