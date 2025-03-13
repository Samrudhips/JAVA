import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
//Sorting in arrayList

public class ArrayListFour {
    public static void main(String[] args) {
        ArrayList al =new ArrayList();//allowed hetereogenous
        ArrayList<Integer> eids=new ArrayList<Integer>();//allowed integers
        ArrayList<String> enames=new ArrayList<String>();//allowed string values
        enames.add("sam");
        enames.add("varsha");
        enames.add("vinod");
        enames.add("mahi");
        System.out.println(enames);
//        Collections.sort(enames);//sorting array list object
        Collections.sort(enames,Collections.reverseOrder());//sorting in reverse order
        System.out.println(enames);


    }
}
