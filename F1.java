//Without static and inside the same class.
class F1
{
    void display() //non static method
    {
        System.out.println("Display Something...");
    }
    public static void main(String[] args)
    {
        F1 o=new F1(); // o is the object of the F1 class
        o.display();
    }
}