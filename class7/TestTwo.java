public class TestTwo {
    public static void main(String[] args) {
        //pre-increment=first increment then assign
        int a=10;
        int b=++a;
        System.out.println("PRE INCREMENT");
        System.out.println(a);//11
        System.out.println(b);//11
        //post-increment=first assign then increment

        int x=10;
        int y=x++;
        System.out.println("POST-INCREMENT");
        System.out.println(x);//11
        System.out.println(y);//10
        
        
    
    }
   
}
