// public class Test extends Object {
//     //object class present in lang package
//     //toString method is provided by object class
//     public String getMyName(){
//         return "ProStack";
//     }

//     public static void main(String[] args) {
//         Test t1=new Test();
//         System.out.println(t1);
//         System.out.println(t1.toString());
//         System.out.println(t1.getMyName());
//     }
// }

public class Test extends Object{
    //overriding toString method
    public String toString() {
        //toString() method belongs to Object Class 
        // return getClass().getName() + "@" + Integer.toHexString(hashCode());
        return "Test class-ToString method ";

}
public static void main(String[] args) {
    Test t1=new Test();
    System.out.println(t1);
    System.out.println(t1.toString());
}
}