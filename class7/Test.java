public class Test {
    public static void main(String[] args) {
        int a=10;
        int b=20;
        float c=40.5f;
        float d=10.5f;
        double e=c+d;
        // byte f=10;
        // byte g=f+1;//error 1 is int type,cannot convert from int to byte
        // int d=a+c;//incompatible types,gives lossy conversion error
        System.out.println(a+b);//30
        System.out.println(b+c);//60.5
        System.out.println(e);//51.0

        
    
    }
   
}
