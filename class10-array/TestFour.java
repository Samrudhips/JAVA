//Reading/Iterating array elements using for loop,while,do-while,for-each loop
public class TestFour {
    public static void main(String[] args) {
        String []enames;//Declaration
        enames=new String[4];//Creation
        enames[0]="RG";//initialization
        enames[1]="SG";
        enames[3]="MG";//enames[2]=0(default value)
        //Iteratng using for loop
        // for(int i=0;i<=enames.length-1;i++){
        //     System.out.println(enames[i]);

        // }

        //Itertaing the array using while loop
        // int i=0;
        // while(i<=enames.length-1){
        //     System.out.println(enames[i]);
        //     i++;
        // }
        
        //Iterating the array using for-each loop
        for(String ename:enames){
            System.out.println(ename);
        }

        
    }
    
}
