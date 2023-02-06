interface Rollno
{
    void roll();
}
interface Name extends Rollno
{
    void nam();
}
class Person implements Name
{
    public void roll()
    {
        System.out.println("Roll is 101");
    }
    public void nam()
    {
        System.out.println("Name is ABC");
    }
}
public class Demo2
{
    public static void main(String args[])
    {
        Person obj=new Person();
        obj.roll();
        obj.nam();
    }
}