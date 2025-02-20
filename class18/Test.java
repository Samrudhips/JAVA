//Constructor- special method To initialize object values
public class Test {
    public Test(){
        System.out.println("Constructor method");
    }
    
    public void m1(){
        System.out.println("Normal Method");
    }
    public static void main(String[] args) {
        new Test();
        new Test();
    }
    
}
