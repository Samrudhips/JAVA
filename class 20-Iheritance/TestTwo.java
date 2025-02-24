//Through interface multiple inheritance is possible in java
interface User1{
    public abstract void login();
    public abstract void logout();

}
interface User2{
    public abstract void signup();

}
//multiple inheritance
class User implements User1,User2{
    public void login(){
        System.out.println("Login Succesfull");

    }
    public void logout(){
        System.out.println("Logout Succesfull");

    }
    public void signup(){
        System.out.println("Signup");

    }
    public static void main(String[] args) {
        User obj=new User();
        obj.login();
        obj.logout();
        obj.signup();
    }


} 
