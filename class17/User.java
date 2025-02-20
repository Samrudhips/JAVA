// //Interface concepts
// interface User1{
//     void login();//by default methods are public+abstract
//     void logout();
//     //abstract methods
// }
// class User implements User1{
//     public void login(){
//         System.out.println("Login");
//     }
//     public void logout(){
//         //void logout(){}-gives error
//         // attempting to assign weaker access privileges; was public
//         System.out.println("Logout");
//     }
//     public static void main(String[] args) {
//         User u1=new User();
//         // User1 u1=new User();
//         u1.login();
//         u1.logout();
//     }
// }
// 1.public-higher privilage
// 2.protected
// 3.default
// 4.private-lower privilage
interface User1{
    public abstract void  Method1();
    public abstract void Method2();
} 
class User implements User1{
    public void Method1(){
        System.out.println("Hello there");

    }
    public void Method2(){
        System.out.println("Hi World");

    }
    public static void main(String[] args) {
        User u1=new User();
        u1.Method1();
        u1.Method2();
    }
}