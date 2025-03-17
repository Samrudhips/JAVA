import java.awt.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

class Iterators{
    public static void main(String[] args) {

        List<String> enames=new ArrayList<String>();//parent can hold child
        enames.add("Rahul");
        enames.add("Priyanka");
        enames.add("vinol");
        enames.add("Vandhana");
//        for( String ename:enames){
//            System.out.println(ename);
//        }
//        Iterator itr=enames.iterator();
//        while(itr.hasNext()){
//            System.out.println(itr.next());
//        }
        for(int i=0;i<enames.size()-1;i++){
            System.out.println(enames.get(i));
        }


    }
}
