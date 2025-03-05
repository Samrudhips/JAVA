//equals method belonging to object class
public class TestThree {
    //equals method is inherited from object class 
    public static void main(String[] args) {
        Test t1=new Test();
        Test t2=new Test();
        System.out.println(t1.equals(t2));//false
        //Object class-equals() method is for reference comparison
    }
    
}
