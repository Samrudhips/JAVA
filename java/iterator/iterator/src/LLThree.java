import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
class LLThree{
        public static void main(String[] args) {
            LinkedList ll1 = new LinkedList();
            LinkedList<Integer> eids = new LinkedList<Integer>();
            LinkedList<String> enames = new LinkedList<String>();
            enames.add("Mohan");
            enames.add("Manasa");
            enames.add("vinod");
//           for(int i=0;i<enames.size()-1;i++){
//                System.out.println(enames.get(i);
//           }
//            for(String ename:enames){
//               System.out.println(enames);
            //  }

//            int i=0;
//            while(i<=enames.size()-1){
//               System.out.println(enames.get(i));
//               i++;
        //}

//            int i=0;
//            do{
//                System.out.println(enames);
//                i++;
//
//            }while(i<=enames.size()-1);
            
//            Iterator itr=enames.iterator();
//            while(itr.hasNext()){
//                System.out.println(itr.next());
//
//            }
                System.out.println(enames);
                Collections.sort(enames);
                System.out.println(enames);

        }
    }


