// //Abstract class
// abstract class Bank{
// public abstract void cal_Bal(); //no return type-only declaration
// public String getDetails(){
//     return "Test-Case";
// }
    
// }
// public class Account extends Bank{
//     public void cal_Bal(){
//         System.out.println("Test Case-123");
//         //child class providing the implementation
//     }
//     public static void main(String[] args) {
//         Account a1=new Account();
//         a1.cal_Bal();
//         System.out.println(a1.getDetails());
        
//     }
// }

abstract class Bank{
    abstract void myMethod();
    public String Method2(){
        return "Hello";
    }
}
public class Account extends Bank{
    public void myMethod(){
        System.out.println("Hello there");
    }
    public static void main(String[] args) {
        Account a1=new Account();
        a1.Method2();
        a1.myMethod();
    }

}