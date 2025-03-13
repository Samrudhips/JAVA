import java.util.ArrayList;

public class  ArrayListOne{
    public static void main(String[] args) {
        ArrayList al=new ArrayList();
        System.out.println(al);//empty array
        al.add(101);
        al.add("Rahul");
        al.add(34000);
        System.out.println(al);
        System.out.println(al.size());
        System.out.println(al.isEmpty());
        for(int i=0;i<=al.size()-1;i++){
            System.out.println(al.get(i));
        }
    }
}