import java.util.ArrayList;

public class ArrayListThree {
    public static void main(String[] args) {
        ArrayList al =new ArrayList();//allowed hetereogenous
        ArrayList<Integer> eids=new ArrayList<Integer>();//allowed integers
        ArrayList<String> enames=new ArrayList<String>();//allowed string values
        enames.add("sam");
        enames.add("varsha");
        enames.add("vinod");
        enames.add("mahi");
        System.out.println(eids);
       for(String ename:enames){
           System.out.println(ename);
       }

    }
}
