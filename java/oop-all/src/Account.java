public class Account extends Bank {
    public Account(String acc_Name, String acc_Email) {
        this.acc_Name = acc_Name;
        this.acc_Email = acc_Email;
    }

    private String acc_Name;

    public String getAcc_Email() {
        return acc_Email;
    }

    public void setAcc_Email(String email) {
        this.acc_Email = email;
    }

    public String getAcc_Name() {
        return acc_Name;
    }

    public void setAcc_Name(String name) {
        this.acc_Name = name;
    }

    private  String acc_Email;

    @Override
    public void calBal() {

    }
}
