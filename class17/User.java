//Interface concepts
interface User1{
    void login();//by default methods are public+abstract
    void logout();
    //abstract methods
}
class User implements User1{
    public void login(){
        System.out.println("Login");
    }
    public  void logout(){
        //void logout(){}-gives error
        // attempting to assign weaker access privileges; was public
        System.out.println("Logout");
    }
    public static void main(String[] args) {
        User u1=new User();
        // User1 u1=new User();
        u1.login();
        u1.logout();
    }
}
// 1.public-higher privilage
// 2.protected
// 3.default
// 4.private-lower privilage