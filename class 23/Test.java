//String objects are immutable

public class Test {
    public static void main(String[] args) {
        String s1="Rahul";
        s1.concat("Gandhi");
        System.out.println(s1);//Rahul
        String s3="Rahul";
        s3=s3.concat("Gandhi");
        System.out.println(s3);
        //New object Rahul Gandhi is created in String constant pool
        StringBuffer s2=new StringBuffer("Rahul");
        s2.append("Gandhi");
        System.out.println(s2);
        //existing object will be updated from Rahul to Rahul Gandhi on heap
    }
    
}
