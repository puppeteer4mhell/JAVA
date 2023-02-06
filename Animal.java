class Animal
{
    public void display()
    {
        System.out.println("Parent Class");
    }
}
class Dog extends Animal
{
    public final void display()
    {
        System.out.println("Parent Class");
    }
}
class Test1
{
    public static void main(String[] args)
    {
        Dog obj=new Dog();
        obj.display();
    }
}