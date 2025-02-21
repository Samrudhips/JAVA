//Encapsulation-setters and getters
// public class Employee {
//     private int Emp_Id;
//     private String Emp_Name;
//     //private variables

//     //public methods
//     public void setEmp_Id(int emp_Id){
//         this.Emp_Id=emp_Id;
//     }
//     public int getEmp_Id(){
//         return this.Emp_Id;
//     }
    
//     public void setEmp_Name(String emp_Name){
//         this.Emp_Name=emp_Name;
//     }
//     public String getEmp_Name(){
//         return this.Emp_Name;
//     }
//     public static void main(String[] args) {
//         Employee e1=new Employee();
//         e1.setEmp_Id(101);
//         e1.setEmp_Name("rahul");
//         System.out.println(e1.getEmp_Id()+" "+e1.getEmp_Name());
//     }
    
// }
public class Employee{
    private int Emp_Id;
    private String Emp_Name;
    public void setEmp_Id(int emp_Id){
        this.Emp_Id=emp_Id;
    }
    public int getEmp_Id(){
        return this.Emp_Id;
    }
    public void setEmp_Name(String emp_Name){
        this.Emp_Name=emp_Name;
    }
    public String getEmp_Name(){
        return this.Emp_Name;
    }
    public static void main(String[] args) {
        Employee e1=new Employee();
        e1.setEmp_Id(101);
        e1.setEmp_Name("sam");
        System.out.println(e1.getEmp_Id()+" "+e1.getEmp_Name());
        
    }
}