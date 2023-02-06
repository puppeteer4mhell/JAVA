//Use of default constructor
class Def_cons
{
    int roll;
    String name;
    char sec;
    Def_cons() //Default constructor or non args constructor
    {
        System.out.println("This is a default constructor");
    }
    public static void main(String[] args)
    {  
        Def_cons o=new Def_cons();
        System.out.println(o.roll);
        System.out.println(o.name);
        System.out.println(o.sec);
    }
}
