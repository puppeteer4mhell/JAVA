//Constructor Overloading
public class ConsOverload {
    ConsOverload() //No Argument constructor
    {
        System.out.println("This is a Zero Argument Constructor");

    }
    ConsOverload(String a) //One Argument constructor
    {
        System.out.println("This is a One Argument Constructor with value "+a);
    }
    ConsOverload(String a, int n)//Two arguments constructor
    {
        System.out.println("This is a Two Arguments Constructor with value "+a+" and "+n);
    }
    public static void main(String[] args)
    {
        ConsOverload obj=new ConsOverload(); //it will automatically call no arguments constructor
        ConsOverload obj2=new ConsOverload("Java",2022); //It will automatically call two arguments constructor
        ConsOverload obj3=new ConsOverload("Hello"); //It will automatically call one arguments constructor
    }
}