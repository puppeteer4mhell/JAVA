public class Addoverload {
    void add() //no argument
    {
        System.out.println("No Argument Method");
    }
    void add(int a, int b)
    {
        System.out.println("Method added: " + a + ", " + b);
    }
    void add(int a, double b)
    {
        System.out.println("Method added: " + a + ", " + b);
    }
    void add(int a, int b, int c)
    {
        System.out.println("Method added: " + a + ", " + b+ ", "+c);
    }
    void add(double a, int b)
    {
        System.out.println("Method added: " + a + ", " + b);
    }
    public static void main(String[] args)
    {
        Addoverload app = new Addoverload();
        app.add();
        app.add(1, 2);
        app.add(3, 4.5);
        app.add(5,6,8);
        app.add(7.8,9);
    }
}