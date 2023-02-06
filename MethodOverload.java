public class MethodOverload 
{
    void findarea(double a , double b) //rectangle
        {
            double ar = a * b;
            System.out.println("Area of rectangle :- "+ar+" unit^2");
        }
        void findarea(float a)//square
        {
            float ar = a * a;
            System.out.println("Area of square :- "+ar+" unit^2");
        }
        void findarea(double a)//circle
        {
            double ar = 3.14 * a * a;
            System.out.println("Area of circle :- "+ar+" unit^2");
        }
        void findarea(double a, double b, double c)//triangle
        {
            double s = (a+b+c)/2;
            double ar=Math.sqrt(s*(s-a)*(s-b)*(s-c));
            System.out.println("Area of triangle :- "+ar+" unit^2");
        }
        
        public static void main(String[] args)
        {
            MethodOverload  app = new MethodOverload();
            app.findarea(1, 2);
            app.findarea(3, 4.5);
            app.findarea(5,6,8);
            app.findarea(7.8, 9);
        }
}