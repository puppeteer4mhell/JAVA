//use of parameterized constructor
class para_cons
{
    int roll;
    String name;
    char sec;
    para_cons(int r, String n, char s)//parameterized constructor
    {
        roll = r;
        name = n;
        sec = s;
    }
    void display()
    {
        System.out.println("Roll is "+ roll);
        System.out.println("Name is "+ name);
        System.out.println("Sec is "+ sec);
    }
    public static void main(String[] args)
    {
        para_cons o1= new para_cons(101, "Raj", 'a');
        para_cons o2= new para_cons(102, "Deppak", 'b');
        o1.display();
        o2.display();
    }
}
