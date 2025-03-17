import java.util.LinkedList;

class LinkedListTwo {
    public static void main(String[] args) {
        LinkedList ll1=new LinkedList();
        LinkedList<Integer>eids=new LinkedList<Integer>();
        LinkedList<String>enames=new LinkedList<String>();
        enames.add("Mohan");
        enames.add("Manasa");
        enames.add("vinod");
        enames.set(0,"Mohan Gandhi");//update the value
        System.out.println(enames);
    }
}
