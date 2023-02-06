abstract class EmployeeDetails //Abstract Class
{
    private String name="Rohit";
    private int emp_id=151;
    public void commonDetails() //Regular Method
    {
        System.out.println("Name is "+name);
        System.out.println("Emp_id is "+emp_id);
    }
    public abstract void confidentialDetails(int s, String p); //Abstract Method
}
class Teacher extends EmployeeDetails
{
    private int salary;
    private String dept;
    public void confidentialDetails(int s, String p) //Implementaion of abstract method
    {
        salary=s;
        dept=p;
        System.out.println("Salary is "+salary);
        System.out.println("Department is "+dept);
    }
    public static void main(String[] args)
    {
        Teacher obj=new Teacher();
        obj.confidentialDetails(10000, "IT");
        obj.commonDetails();
    }
}