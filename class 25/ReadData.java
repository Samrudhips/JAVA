//checked exception1 handling using try and catch

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class ReadData {
    public static void main(String[] args) {
        try{
            PrintWriter obj=new PrintWriter("abc.txt");//exception statement-file not found exception
        }catch(FileNotFoundException e){
            e.printStackTrace();
        }

        }
       
}
