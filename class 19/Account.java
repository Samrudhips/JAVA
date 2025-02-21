// //Parametrized constructors
// public class Account {
//     int acc_Id;
//     String acc_Name;
//     //to access class variables inside the class we use this keyword
//     public Account(int aid,String aname){
//         this.acc_Id=aid;
//         this.acc_Name=aname;
//     }
//     public static void main(String[] args) {
//         Account a1=new Account(101,"sam");
//         System.out.println(a1);//address
//         System.out.println(a1.acc_Id);
//         System.out.println(a1.acc_Name);
//     }
    
// }


//Parametrized constructors
public class Account {
    int acc_Id;
    String acc_Name;
    private double acc_Bal;
    //to access class variables inside the class we use this keyword
    public Account(int aid,String aname){
        this.acc_Id=aid;
        this.acc_Name=aname;
    }
    //above one is constructor method
    public void set_accBal(double bal){
        this.acc_Bal=this.acc_Bal+bal;
    }
    public double get_accBal(){
        return this.acc_Bal;
    }
    public void cal_Bal(){
        System.out.println(this.acc_Bal-500);
    }
    public static void main(String[] args) {
        Account a1=new Account(101,"sam");
        a1.set_accBal(5000);
        System.out.println("The Balance is "+a1.get_accBal());
        a1.cal_Bal();//5000-500=4500
    }
    
}