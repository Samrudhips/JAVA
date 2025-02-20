//interface concepts
interface Bank{
    int min_Bal=500;//by default interface variables are public,static,final
    //public+static+final
}
class Account implements Bank{
    public static void main(String[] args) {
        // min_Bal=600;//gives error
        System.out.println(min_Bal);
    }
}
//javac TestOne.java
//java Account